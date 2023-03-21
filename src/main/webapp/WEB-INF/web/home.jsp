<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
<html>
  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  	<title>Trackit - Parcel tracking made simpler!</title>
  	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
  	<link href="<%=request.getContextPath()%>/resources/css/main.css" rel="stylesheet" type="text/css" />
  	
  	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-1.7.1.min.js"></script>
  	<!--script src="http://maps.google.com/maps/api/js?sensor=false&.js" type="text/javascript"></script-->
  	<script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
  	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/date.js"></script>
  	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/trackit.js"></script>
  </head>
  <body>
  	<div>
	    <div id="header">trackIt</div>
	    <div id="content">
	    	<div id="content-top">
	    		<div id="searchContainer">
					<div id="search-form">
			    		<label for="field" id="search-label">Tracking No: </label>
						<input type="text" name="field" id="field" />
						<div id="delete"><span id="x">x</span></div>
						<input type="submit" name="submit" id="submit" href="javascript:void(0);" onclick="submitTrackingSearchForm()"/>
					</div>
				</div>
	    	</div>
	    	<div id="content-bottom">
	    		<div id="parcel-details-loading"></div>
	    		<div id="parcel-details"></div>
	    		<div id="address-details"></div>
	    		<div id="tracking-details"></div>
	    		<div id="map-loading"></div>
	    		<div id="tracking-details-map"></div>
	    	</div>    	
	    </div>
	    <div id="lightbox-wrapper">       	
			<div style="height: 20px; width: 100%; position: relative;">
       			<div style="float: right; position: absolute; right: -14px; top: 5px;">
					<a onclick="closeOrderDetailsBox()" title="Close" class="lightbox-close" id="lightbox-close-btn" href="javascript:void(0)" style="display: block;"></a>
				</div>
    		</div>
			<div style="display: block;" id="order-details-box" class="lightbox-white-content">
    			<div id="order-details-loading">
					<div class="loading-img"><img id="ajax-loader" src="/trackit/resources/images/ajax-loader.gif"></div>
					<div class="loading-message">Please wait while we fetch your order details ...</div>
				</div>
    			<div id="order-details"></div>
    		</div>   
		</div>	
		<div id="fade" class="lightbox-black-overlay"></div>
	    <div id="footer">
			<div id="copyright">
			     <p>&copy; 2012 Pitney Bowes Software. All rights reserved.</p>		         
			</div>   
	    </div>
   	</div>
  </body>
</html>