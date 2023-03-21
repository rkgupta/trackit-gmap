var parcelEvents;
var parcelEventResponseArray;
var map=null;
var myLatLng=null;
var mapOptions=null;
var lineSymbol=null;
var flightPath =null;
var markerArray=new Array();
var geocoder=null;
var pendingRequestCount;

$().ready(function() {
	// if text input field value is not empty show the "X" button
	$("#field").keyup(function() {
		$("#x").fadeIn();
		if ($.trim($("#field").val()) == "") {
			$("#x").fadeOut();
		}
	});
	// on click of "X", delete input field value and hide "X"
	$("#x").click(function() {
		$("#field").val("");
		$(this).hide();
	});
	
	//geocoder = new google.maps.Geocoder();
	
	myLatLng = new google.maps.LatLng(20.00, 20.00);
	mapOptions = {
		zoom : 2,
		center : myLatLng,
		mapTypeId : google.maps.MapTypeId.TERRAIN
	};
	
	lineSymbol = {
	    	    path: google.maps.SymbolPath.CIRCLE,
	    	    scale: 4,
	    	    strokeColor: '#292'
	    	  };
	
});



function submitTrackingSearchForm() {
	var upid = $("#field").val();
	
	$('#parcel-details').html('');
	$('#address-details').html('');
	$('#tracking-details').html('');
	$('#tracking-details-map').css('visibility','hidden');
	$('#parcel-details-loading').html('<div class="loading-img"><img id="ajax-loader" src="/trackit/resources/images/ajax-loader.gif"></div><div class="loading-message">Please wait while we fetch your parcel details...</div>');
	
	parcelEvents = new Array();
	parcelEventResponseArray = new Array();
	var parcelDetailsHtml = '<div class="table-header">Shipment Details</div><table id="parcel-details-table"><tbody>';
	var tmpHtml = '<div class="table-header">Shipment History</div><table id="tracking-details-table"><thead><tr><th width="25%">Date</th><th width="15%">Event Code</th><th width="40%">Description</th><th width="20%">Location</th></tr></thead><tbody>';
	
	$.ajax({
		  url: '/trackit/api/upid/'+upid,
		  //url:'/trackit/resources/trackit.json',
		  dataType: 'json',
		  success: function(trackingData) {
			  	if(trackingData){
			  		var row = "";
			  		$.each(trackingData.events, function(key, event) {
			  			parcelEvents.push(event);
			  			row = '<tr><td>' + Date.parse(event.eventDate +' '+event.eventTime).toString("MMMM dd, yyyy, h:mm:ss tt") +'</td><td>'
			  			+ event.eventCode + '</td><td>'
			  			+ event.eventDescription + '</td><td>'
			  			+ event.eventCity + '</td></tr>';
			  			tmpHtml += row;
			  		});
			  		var parcelRow = '<tr><td><b>Tracking ID : </b>'+trackingData.trackingNumber+'</td></tr>';
			  		if(trackingData.orderId){
			  			parcelRow += '<tr><td class="order-info"><b> Order ID : </b><a href="javascript:void(0)" onclick="openOrderDetailsBox()">'+trackingData.orderId+'</a></td></tr>';
			  			//parcelRow += '<tr><td class="order-info"><b> Order ID : </b>'+trackingData.orderId+'</td></tr>';
			  		}
			  		if(trackingData.weight && trackingData.weightUom){
			  			parcelRow += '<tr><td><b> Weight : </b>'+trackingData.weight+' '+trackingData.weightUom+'</td></tr>';				
			  		}
			  		if(trackingData.estimatedDeliveryDateTime){
			  			parcelRow += '<tr><td><b> Estimated Delivery Date : </b>'+Date.parse(trackingData.estimatedDeliveryDateTime).toString("MMMM dd, yyyy, h:mm:ss tt")+'</td></tr>';
			  		}
			  		
			  		var addressHTML = '<table id="address-details-table"><thead><tr><th width="50%">Merchant Address</th><th width="50%">Shipping Address</th></tr></thead><tbody><tr>'
			  		var sendersAddr = convertJSONAddress(trackingData.sendersAddress);
			  		var destinationAddr = convertJSONAddress(trackingData.destinationAddress);
			  		if(sendersAddr && sendersAddr != ''){
			  			addressHTML += '<td>'+sendersAddr+'</td>'
			  		}
			  		if(destinationAddr && destinationAddr != ''){
			  			addressHTML += '<td>'+destinationAddr+'</td>'
			  		}
			  		addressHTML +='</tr></tbody></table>'
			  			
			  		$('#parcel-details-loading').html('');	
			  		if(sendersAddr || destinationAddr){
			  			$('#address-details').html(addressHTML);
			  		}	
			  		
			  		parcelDetailsHtml += parcelRow+'</tbody></table>';
			  		$('#parcel-details').html(parcelDetailsHtml);
			  		
			  		tmpHtml += '</tbody></table>';
			  		$('#tracking-details').html(tmpHtml);
			  		mapLoading();
			  		
			  	}else{
			  		noParcelDetailsFound()
			  	}
		  },
		  complete: function() {
			  	pendingRequestCount = parcelEvents.length;
			  	if(parcelEvents.length > 0){
			  		populateParcelPathLatLong();
			  	}
		  },
		  error: function(){
			  noParcelDetailsFound();
		  }
	});

}

function populateParcelPathLatLong() {
	// Loop over each value in the array.
	$.each(parcelEvents, function(index, event) {
		var location='';
		if(event.eventCity && event.eventCity != '?'){
			location = location+event.eventCity;
		}
		if(event.eventRegion && event.eventRegion != '?'){
			location = location+'+'+event.eventRegion;
		}
		if(event.eventCountry && event.eventCountry != '?'){
			location = location+'+'+event.eventCountry;
		}
		if(event.eventPostalCode && event.eventPostalCode != '?'){
			location = location+'+'+event.eventPostalCode;
		}
		if(location){
			/*
			 * Geocoding 1. Faster. This might work till March 2013, not sure though. If this happens use Geocoding 2.
			 */
		    /*geocoder.geocode( {'address': location }, function(data, status){
				if (status == google.maps.GeocoderStatus.OK){
					var eventArray = new Array();
					eventArray.push(data[0].geometry.location.lat());
					eventArray.push(data[0].geometry.location.lng());
					eventArray.push("<b>Event :</b> " + event.eventDescription + "<br>");
					eventArray.push("<b>Date :</b> " + event.eventDate + "<br>");
					eventArray.push("<b>City :</b> " + event.eventCity + "<br>");
					eventArray.push("<b>Country :</b> " + event.eventCountry+ "<br>");
					eventArray.push(event.eventCode);
					eventArray.push(index);
					parcelEventResponseArray.push(eventArray);

					checkLastEventAndProcess(index);
				}else{
					checkLastEventAndProcess(index);
				}
			});*/
			
			/*
			 * Geocoding 2. Stable One
			 */
			$.ajax({
				url : '/trackit/api/geocode/' + location,
				dataType : 'json',
				async : true,
				cache : true,
				success : function(data) {
					if (data.results.length > 0) {
						var eventArray = new Array();
						eventArray.push(data.results[0].geometry.location.lat);
						eventArray.push(data.results[0].geometry.location.lng);
						eventArray.push("<b>Event :</b> " + event.eventDescription+ "<br>");
						eventArray.push("<b>Date :</b> " + event.eventDate + "<br>");
						eventArray.push("<b>City :</b> " + event.eventCity + "<br>");
						eventArray.push("<b>Country :</b> " + event.eventCountry+ "<br>");
						eventArray.push(event.eventCode);
						eventArray.push(index);
						
						parcelEventResponseArray.push(eventArray);
						checkLastEventAndProcess();	
					} else {
						checkLastEventAndProcess();
					}
				},
				error : function() {
					checkLastEventAndProcess();
				}
			});
		}
		else{
			checkLastEventAndProcess();
		}
	});
}

function checkLastEventAndProcess() {
	pendingRequestCount--;
	if(pendingRequestCount == 0){
		$('#tracking-details-map').css('margin', '0 auto');
		if(parcelEventResponseArray.length==0){
			unableToLoadMap();
		}else{
			makeMapVisible();
			displayParcelMap(); 
		}
	}
}

function displayParcelMap() {
	clearOverlays();	
	parcelEventResponseArray.sort(function(a, b){
	    var x=a[7];
	    var y=b[7];
	    return x-y;
	});
	if(map == null){
		$('#tracking-details-map').html('');
		map = new google.maps.Map(document.getElementById("tracking-details-map"), mapOptions);
	}
	flightPath = new google.maps.Polyline({
		strokeColor : "#FF0000",
		strokeOpacity : 1.0,
		strokeWeight : 2,
		icons: [{
		      icon: lineSymbol,
		      offset: '100%'
		    }]
	});
	
	var gLatLng;
	var marker, i;
	var infoContent;
	var iconFile;
	
	var infowindow = new google.maps.InfoWindow({
		maxWidth:200
	});
	var path = flightPath.getPath();
    for (i = parcelEventResponseArray.length-1; i >=0; i--) {
      gLatLng = new google.maps.LatLng(parcelEventResponseArray[i][0], parcelEventResponseArray[i][1]);
      path.push(gLatLng);
      
      marker = new google.maps.Marker({
        position: gLatLng,
        map: map
      });
      
      if(parcelEventResponseArray[i][6] === 'PSR'){
    	  iconFile = 'http://maps.google.com/mapfiles/ms/icons/green-dot.png'; 
      }else if(parcelEventResponseArray[i][6] === 'DLD'||parcelEventResponseArray[i][6] === 'DLC')
    	  iconFile = 'http://maps.google.com/mapfiles/ms/icons/red-dot.png'; 
      else{
    	  iconFile = 'http://maps.google.com/mapfiles/ms/icons/yellow-dot.png';
      }
      
      marker.setIcon(iconFile)
      markerArray.push(marker);
      
      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        return function() {
          infoContent = parcelEventResponseArray[i][2]+parcelEventResponseArray[i][3]+parcelEventResponseArray[i][4]+parcelEventResponseArray[i][5];
          infowindow.setContent(infoContent);
          infowindow.open(map, marker);
        }
      })(marker, i));
    }
    flightPath.setMap(map);
    animateCircle(flightPath);
}

function clearOverlays() {
	if (flightPath) {
		flightPath.setMap(null);
	}
	flightPath=null;
	if (markerArray) {
		for ( var i = 0; i < markerArray.length; i++) {
			markerArray[i].setMap(null);
		}
		markerArray.length = 0;
	}
}

function animateCircle(path) {
    var count = 0;
    offsetId = window.setInterval(function() {
      count = (count + 1) % 200;

      var icons = path.get('icons');
      icons[0].offset = (count / 2) + '%';
      path.set('icons', icons);
  }, 30);
}

function convertJSONAddress(jsonAddress){
	var address='';
	if(jsonAddress){
		if(jsonAddress.firstName && jsonAddress.firstName != '?'){
			address += jsonAddress.firstName+' ';
		}
		if(jsonAddress.middleName && jsonAddress.middleName != '?'){
			address += jsonAddress.middleName+' ';
		}
		if(jsonAddress.lastName && jsonAddress.lastName != '?'){
			address += jsonAddress.lastName;
		}
		address += '<br>';
		if(jsonAddress.street1 && jsonAddress.street1 != '?'){
			address += jsonAddress.street1;
		}
		if(jsonAddress.street2 && jsonAddress.street2 != '?'){
			address += ', '+jsonAddress.street2;
		}
		if(jsonAddress.street3 && jsonAddress.street3 != '?'){
			address += ', '+jsonAddress.street3;
		}
		address += '<br>'
		if(jsonAddress.city && jsonAddress.city != '?'){
			address += jsonAddress.city;
		}
		address += '<br>'
		if(jsonAddress.region && jsonAddress.region != '?'){
			address += jsonAddress.region;
		}
		address += '<br>'
		if(jsonAddress.country && jsonAddress.country != '?'){
			address += jsonAddress.country;
		}
		address += '<br>'
		if(jsonAddress.postalCode && jsonAddress.postalCode != '?'){
			address += jsonAddress.postalCode;
		}
		address += '<br>'
		if(jsonAddress.email && jsonAddress.email != '?'){
			address += jsonAddress.email;
		}
		address += '<br>'
		if(jsonAddress.phoneNumber1 && jsonAddress.phoneNumber1 != '?'){
			address +='Ph. No - '+jsonAddress.phoneNumber1;
			if(jsonAddress.phoneNumber2 && jsonAddress.phoneNumber2 != '?'){
				address += ', '+jsonAddress.phoneNumber2;
			}
			address += '<br>'
		}
	}
	return address;
}

function makeMapVisible(){
	$('#map-loading').html('');
	$('#tracking-details-map').css("border","1px solid #B9C9FE");
	$('#tracking-details-map').addClass('shadow');
	$('#tracking-details-map').css('visibility','');
}

function mapLoading(){
	$('#map-loading').html('<div class="loading-img"><img id="ajax-loader" src="/trackit/resources/images/ajax-loader.gif"></div><div class="loading-message">WOW! We just found your parcel. Please wait...</div>');
}

function noParcelDetailsFound(){
	$('#parcel-details-loading').html('');
	$('#tracking-details').html('<div id="error-div">OOPs, No parcel found!\n Please enter a valid Tracking No.</div>');
}

function unableToLoadMap(){
	map = null;
	$('#map-loading').html('');
	$('#tracking-details-map').html('');
	$('#tracking-details-map').removeClass('shadow');
	$('#tracking-details-map').removeAttr("style");
	$('#tracking-details-map').css('margin', '0 auto');
	$('#tracking-details-map').html('<div id="error-div"> Unable to load the map. ');
	$('#tracking-details-map').css('visibility', '');
}

function noOrderDetailsFound(){
	$('#order-details-loading').html('');
	$('#order-details-loading').css('margin','0');
	$('#order-details').html('<div id="error-div">OOPs, We could not fetch your order details. Please try again !</div>');
}

function openOrderDetailsBox(){
	$('#order-details').html('');
	$('#order-details-loading').css('margin','50px 0px');
	$('#lightbox-wrapper').css('display', 'block');
	$('#order-details-box').css('display', 'block');
	$('#fade').css('display', 'block');
	$('#lightbox-close-btn').css('display', 'block');
	$('#order-details-loading').html('<div class="loading-img"><img id="ajax-loader" src="/trackit/resources/images/ajax-loader.gif"></div><div class="loading-message">Please wait while we fetch your order details ...</div>');
	
	//make ajax call to get order details
	var orderId = $('.order-info a').text();	
	var orderDetailsHtml = '<div class="order-details-header">Order Details</div><table id="order-details-table"><thead><tr><th>SKU</th><th>Commodity</th><th>Qty</th><th>Sale Price</th></tr></thead><tbody>';
	
	
	$.ajax({
		  //url:'/trackit/resources/orderDetails.json',
		  url: '/trackit/api/orderId/'+orderId,
		  dataType: 'json',
		  success: function(orderDetails) {
			  	if(orderDetails){
			  		var commodityRow='';
			  		
			  		var commoditySum = 0;
			  		var shippingCOP = 0;
			  		var handlingCOP = 0;
			  		var insuranceCOP = 0;
			  		
			  		var shippingINT = 0;
			  		var handlingINT = 0;
			  		var brokerage = 0;
			  		var duty = 0;
			  		var taxes = 0;
			  		
			  		$.each(orderDetails.commodities, function(key, commodity) {
			  			commodityRow = '<tr>';
			  			commodityRow += '<td>'+commodity.SKU+'</td>';
			  			commodityRow += '<td>'+commodity.name+'</td>';
			  			commodityRow += '<td>'+commodity.quantity+'</td>';
			  			commodityRow += '<td>'+commodity.costComponents[0].value.toFixed(2)+'</td>';
			  			commodityRow += '</tr>';
			  			
			            commoditySum += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "SALEPRICE"));
			            shippingCOP += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "COPSHIPPING"));
			            handlingCOP += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "COPHANDLING"));
			            insuranceCOP += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "COPINSURANCE"));
			            
			            shippingINT += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "INTSHIPPING"));
			            handlingINT += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "INTHANDLING"));
			            brokerage += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "BROKERAGE"));
			            duty += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "DUTY"));
			            taxes += parseFloat(getTotalCostForCostComponent(commodity.costComponents, "TAX"));
			  		});
			  		orderDetailsHtml += commodityRow+'</tbody></table>';
			  		var merchantCharges = parseFloat(commoditySum + shippingCOP + handlingCOP + insuranceCOP).toFixed(2);
			  		var clearpathCharges = parseFloat(shippingINT+handlingINT+brokerage+duty+taxes).toFixed(2);
			  		var totalCharges = parseFloat(merchantCharges) + parseFloat(clearpathCharges);
			  		
			  		var chargesTotal = '<table id="charges-details-table"><tbody>';
			  		var chargesRow = '<tr><td>Total</td><td>'+commoditySum.toFixed(2)+'</td></tr>';
			  		chargesRow +='<tr><td>Shipping COP</td><td>'+shippingCOP.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr><td>Handling COP</td><td>'+handlingCOP.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr><td>Insurance COP</td><td>'+insuranceCOP.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr class="sum-total"><td>Merchant Charges</td><td>'+merchantCharges+'</td></tr>'; 
			  		
			  		chargesRow +='<tr><td>Shipping INT</td><td>'+shippingINT.toFixed(2)+'</td></tr>';
			  		chargesRow +='<tr><td>Handling INT</td><td>'+handlingINT.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr><td>Brokerage</td><td>'+brokerage.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr><td>Duty</td><td>'+duty.toFixed(2)+'</td></tr>'; 
			  		chargesRow +='<tr><td>Tax</td><td>'+taxes.toFixed(2)+'</td></tr>';
			  		chargesRow +='<tr class="sum-total"><td>Clearpath Charges</td><td>'+clearpathCharges+'</td></tr>'; 
			  		
			  		chargesRow += '<tr class="order-total"><td>Order Total</td><td>'+totalCharges.toFixed(2)+'</td></tr>';
			  		chargesRow += '</tbody></table>';			  		
			  		chargesTotal += chargesRow;
			  		
			  		var orderInfoHtml = '<table id="order-info-table"><tbody>';
			  		var infoRow = '<tr><td class="order-info-head">Order Number</td><td>'+orderDetails.orderNumber+'</td></tr>';
			  		infoRow +='<tr><td class="order-info-head">Order Reference</td><td>'+orderDetails.orderReference+'</td></tr>'; 
			  		infoRow +='<tr><td class="order-info-head">Partner</td><td>'+''+'</td></tr>';
			  		infoRow +='<tr><td class="order-info-head">Order Date</td><td>'+orderDetails.orderDate+'</td></tr>'; 
			  		infoRow +='<tr><td class="order-info-head">Confirmation Date</td><td>'+''+'</td></tr>'; 
			  		infoRow +='<tr><td class="order-info-head">Expiration Date</td><td>'+orderDetails.expiryDate+'</td></tr>'; 
			  		infoRow +='<tr><td class="order-info-head">Status</td><td class="order-status">'+orderDetails.status+'</td></tr>';			  		
			  		infoRow += '</tbody></table>';
			  		
			  		orderInfoHtml += infoRow;
			  		
			  		orderDetailsHtml += chargesTotal + orderInfoHtml;
			  		
			  		$('#order-details-loading').html('');
			  		$('#order-details-loading').css('margin','0');			  		
			  		$('#order-details').html(orderDetailsHtml);
			  	}else{
			  		noOrderDetailsFound();
			  	}
		  },
		  error: function(){
			 noOrderDetailsFound();
		  }
	});
}

function closeOrderDetailsBox(){
	$('#lightbox-wrapper').css('display', 'none');
	$('#order-details-box').css('display', 'none');
	$('#fade').css('display', 'none');
	$('#lightbox-close-btn').css('display', 'none');
}

function getTotalCostForCostComponent(array, regex){
	var cost = 0;
	$.each(array, function(){
		if (this.name === regex || this.type === regex) {
			cost += parseFloat(this.value);
		}
	});
	return cost.toFixed(2);
}
