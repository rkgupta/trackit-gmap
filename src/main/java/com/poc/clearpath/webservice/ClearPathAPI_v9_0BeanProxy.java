package com.poc.clearpath.webservice;

public class ClearPathAPI_v9_0BeanProxy implements com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean {
  private String _endpoint = null;
  private com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean clearPathAPI_v9_0Bean = null;
  
  public ClearPathAPI_v9_0BeanProxy() {
    _initClearPathAPI_v9_0BeanProxy();
  }
  
  public ClearPathAPI_v9_0BeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initClearPathAPI_v9_0BeanProxy();
  }
  
  private void _initClearPathAPI_v9_0BeanProxy() {
    try {
      clearPathAPI_v9_0Bean = (new com.poc.clearpath.webservice.ClearPathAPI_v9_0BeanServiceLocator()).getcpAPI_v9_0();
      if (clearPathAPI_v9_0Bean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clearPathAPI_v9_0Bean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clearPathAPI_v9_0Bean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clearPathAPI_v9_0Bean != null)
      ((javax.xml.rpc.Stub)clearPathAPI_v9_0Bean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean getClearPathAPI_v9_0Bean() {
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean;
  }
  
  public com.poc.clearpath.domain.Category getCategory(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCategory(merchantCode, categoryCode);
  }
  
  public com.poc.clearpath.domain.Basket test(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.test(basket, deliveryOption);
  }
  
  public java.math.BigDecimal addCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.addCategory(category);
  }
  
  public void updateCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.updateCategory(category);
  }
  
  public com.poc.clearpath.domain.CategoryDetails[] getCategories(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCategories(merchantCode);
  }
  
  public void addCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addCategoryHSCode1(categoryId, HSCode, HSMode, source);
  }
  
  public void addCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addCategoryHSCode2(merchantCode, categoryCode, HSCode, HSMode, source);
  }
  
  public void removeCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.removeCategoryHSCode1(categoryId, HSCode);
  }
  
  public void removeCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.removeCategoryHSCode2(merchantCode, categoryCode, HSCode);
  }
  
  public void removeAllCategoryHSCodes1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.removeAllCategoryHSCodes1(categoryId);
  }
  
  public void removeAllCategoryHSCodes2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.removeAllCategoryHSCodes2(merchantCode, categoryCode);
  }
  
  public java.math.BigDecimal addCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.addCommodity(commodity);
  }
  
  public void updateCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.updateCommodity(commodity);
  }
  
  public com.poc.clearpath.domain.CatalogCommodityDetails getCommodity(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCommodity(merchantCode, SKU);
  }
  
  public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCommodities1(categoryId);
  }
  
  public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCommodities2(merchantCode, categoryCode);
  }
  
  public void setCommodityCountryOfOrigin(java.lang.String merchantCode, java.lang.String SKU, java.lang.String countryOfOrigin) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setCommodityCountryOfOrigin(merchantCode, SKU, countryOfOrigin);
  }
  
  public void setCommodityDefaultImportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setCommodityDefaultImportHSCode1(commodityId, HSCode, source);
  }
  
  public void setCommodityDefaultImportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setCommodityDefaultImportHSCode2(merchantCode, SKU, HSCode, source);
  }
  
  public void setCommodityDefaultExportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setCommodityDefaultExportHSCode1(commodityId, HSCode, source);
  }
  
  public void setCommodityDefaultExportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setCommodityDefaultExportHSCode2(merchantCode, SKU, HSCode, source);
  }
  
  public void setImportHSCode(java.math.BigDecimal commodityID, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setImportHSCode(commodityID, country, HSCode, source);
  }
  
  public java.lang.String confirmUploadFile(java.lang.String fileName, java.lang.String type) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.confirmUploadFile(fileName, type);
  }
  
  public java.lang.String getUploadCatalogStatus(java.lang.String confirmationNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getUploadCatalogStatus(confirmationNumber);
  }
  
  public com.poc.clearpath.domain.ECCN getECCN(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getECCN(merchantCode, SKU);
  }
  
  public java.lang.String[] getCategoryHSCodes(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCategoryHSCodes(merchantCode, categoryCode);
  }
  
  public java.lang.String getCommodityDefaultImportHSCode(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCommodityDefaultImportHSCode(merchantCode, sku);
  }
  
  public void submitForExportVerificationDetails(java.lang.String merchantCode, java.lang.String[] skuList, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.submitForExportVerificationDetails(merchantCode, skuList, country);
  }
  
  public com.poc.clearpath.domain.ExportVerification getExportVerificationDetails(java.lang.String merchantCode, java.lang.String sku, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getExportVerificationDetails(merchantCode, sku, country);
  }
  
  public com.poc.clearpath.domain.BrokerClassification getExportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getExportUnclassifiedCommodities(country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber);
  }
  
  public com.poc.clearpath.domain.BrokerClassification getImportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getImportUnclassifiedCommodities(country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber);
  }
  
  public com.poc.clearpath.domain.BrokerClassification getImportClassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getImportClassifiedCommodities(country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber);
  }
  
  public com.poc.clearpath.domain.OrderPage getOrders(com.poc.clearpath.domain.OrderFilter filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrders(filter, pageNumber);
  }
  
  public void setOrderReference(java.lang.String orderNumber, java.lang.String orderReference) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setOrderReference(orderNumber, orderReference);
  }
  
  public java.lang.String generatePackingSlip(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.generatePackingSlip(parcelNumber);
  }
  
  public java.lang.String generateDDULabel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.generateDDULabel(parcelNumber);
  }
  
  public java.lang.String generatePackageControlLabel(com.poc.clearpath.domain.Address destinationAddress, com.poc.clearpath.domain.Address senderAddress, java.lang.String orderNumber, java.lang.String parcelId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.generatePackageControlLabel(destinationAddress, senderAddress, orderNumber, parcelId);
  }
  
  public com.poc.clearpath.domain.ParcelDetails getParcelDetails(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getParcelDetails(parcelNumber);
  }
  
  public com.poc.clearpath.domain.Invoice[] getInvoices(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getInvoices(startDate, endDate);
  }
  
  public com.poc.clearpath.domain.InvoiceDetails getInvoice(java.lang.String invoiceNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getInvoice(invoiceNumber);
  }
  
  public com.poc.clearpath.domain.QuoteNoShDetails getEstimatedDutiesAndTaxes(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getEstimatedDutiesAndTaxes(basket, portOfEntry);
  }
  
  public com.poc.clearpath.domain.QuoteDetails getQuote(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getQuote(basket, deliveryOption);
  }
  
  public void confirmOrder(java.lang.String orderNumber, java.lang.String confirmDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.confirmOrder(orderNumber, confirmDate);
  }
  
  public void cancelOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.cancelOrder(orderNumber);
  }
  
  public com.poc.clearpath.domain.OrderDetails getOrderDetails(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrderDetails(orderNumber);
  }
  
  public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelIdentification(java.lang.String packgeIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrderDetailsByInboundParcelIdentification(packgeIdentificationNo);
  }
  
  public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrderDetailsByInboundParcelNumber(inboundParcelNumber);
  }
  
  public java.lang.String getPartnerByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getPartnerByOrder(orderNumber);
  }
  
  public void checkOrderCommodityRestrictions(java.lang.String orderNumber, java.lang.String sku, java.lang.String countryOfOrigin, java.math.BigDecimal quantity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.checkOrderCommodityRestrictions(orderNumber, sku, countryOfOrigin, quantity);
  }
  
  public com.poc.clearpath.domain.Address getHubAddressForOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getHubAddressForOrder(orderNumber);
  }
  
  public void addOrder(com.poc.clearpath.domain.Order order) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addOrder(order);
  }
  
  public com.poc.clearpath.domain.RestrictionDetails checkRestrictions(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.checkRestrictions(basket, portOfEntry, shippingMethodId);
  }
  
  public void checkSizeRestrictions(com.poc.clearpath.domain.Size size, java.lang.String shippingMethodId, java.lang.String county) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.checkSizeRestrictions(size, shippingMethodId, county);
  }
  
  public com.poc.clearpath.domain.ShippingMethod[] getShippingMethods(com.poc.clearpath.domain.Basket basket) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getShippingMethods(basket);
  }
  
  public com.poc.clearpath.domain.ShippingProperty[] getShippingPropertiesByMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getShippingPropertiesByMerchant(merchantCode);
  }
  
  public boolean addShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.addShippingPropertyByMerchant(merchantCode, name, value);
  }
  
  public boolean updateShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.updateShippingPropertyByMerchant(merchantCode, name, value);
  }
  
  public boolean removeShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.removeShippingPropertyByMerchant(merchantCode, name);
  }
  
  public boolean addShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.addShippingPropertyByCountry(merchantCode, country, name, value);
  }
  
  public boolean removeShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.removeShippingPropertyByCountry(merchantCode, country, name);
  }
  
  public java.lang.String closeContainer(java.lang.String containerType) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.closeContainer(containerType);
  }
  
  public void addParcelToContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addParcelToContainer(containerNumber, parcelNumber);
  }
  
  public void deleteParcelFromContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.deleteParcelFromContainer(containerNumber, parcelNumber);
  }
  
  public java.lang.String getContainerForParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getContainerForParcel(parcelNumber);
  }
  
  public com.poc.clearpath.domain.ContainerDetails getContainerDetails(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getContainerDetails(containerNumber);
  }
  
  public java.lang.String createExceptionParcel(java.lang.String merchantCode, java.lang.String parcelDisposition, java.lang.String inboundParcelNumber, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.createExceptionParcel(merchantCode, parcelDisposition, inboundParcelNumber, isSplitParcel);
  }
  
  public void addItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.ExceptionCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addItemToExceptionParcel(exceptionParcelNumber, exceptionCommodity);
  }
  
  public void addUnknownItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.UnknownCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addUnknownItemToExceptionParcel(exceptionParcelNumber, exceptionCommodity);
  }
  
  public java.lang.String closeExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.closeExceptionParcel(exceptionParcelNumber, size);
  }
  
  public com.poc.clearpath.domain.ExceptionParcelDetails getExceptionParcel(java.lang.String exceptionParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getExceptionParcel(exceptionParcelNumber);
  }
  
  public java.lang.String[] getExceptionsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getExceptionsByOrder(orderNumber);
  }
  
  public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOpenExceptionParcel(merchantCode);
  }
  
  public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOpenExceptionParcel(partnerCode, merchantCode);
  }
  
  public com.poc.clearpath.domain.Merchant getMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getMerchant(merchantCode);
  }
  
  public com.poc.clearpath.domain.Partner getPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getPartner(partnerCode);
  }
  
  public void confirmParcelDelivery(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String deliveredDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.confirmParcelDelivery(parcelNumber, parcelType, deliveredDate);
  }
  
  public java.lang.String createParcelFromInboundParcel(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.createParcelFromInboundParcel(inboundParcelNumber, size);
  }
  
  public java.lang.String createParcel(com.poc.clearpath.domain.Parcel parcel, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.createParcel(parcel, isSplitParcel);
  }
  
  public com.poc.clearpath.domain.OrderDetails getOrderDetailsByParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrderDetailsByParcel(parcelNumber);
  }
  
  public java.lang.String[] getParcelsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getParcelsByOrder(orderNumber);
  }
  
  public com.poc.clearpath.domain.ParcelDetails[] getParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getParcelDetailsListByOrder(orderNumber);
  }
  
  public void addParcelEvent(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String eventType, java.lang.String date) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addParcelEvent(parcelNumber, parcelType, eventType, date);
  }
  
  public void updateInboundParcelSize(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size actualInboundParcelSize) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.updateInboundParcelSize(inboundParcelNumber, actualInboundParcelSize);
  }
  
  public void addInboundParcel(com.poc.clearpath.domain.InboundParcel inboundParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addInboundParcel(inboundParcel);
  }
  
  public void cancelInboundParcelByNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.cancelInboundParcelByNumber(inboundParcelNumber);
  }
  
  public void cancelInboundParcelByIdentification(java.lang.String packageIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.cancelInboundParcelByIdentification(packageIdentificationNo);
  }
  
  public com.poc.clearpath.domain.InboundParcelDetails getInboundParcelDetails(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getInboundParcelDetails(ID);
  }
  
  public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsList(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getInboundParcelDetailsList(ID);
  }
  
  public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getInboundParcelDetailsListByOrder(orderNumber);
  }
  
  public void addParcelPolicy(java.lang.String upid, java.lang.String policyId, java.lang.String policyDate, java.lang.String policyStatus, java.lang.String policyError) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addParcelPolicy(upid, policyId, policyDate, policyStatus, policyError);
  }
  
  public com.poc.clearpath.api.domain.policy.Policy getParcelPolicy(java.lang.String upid) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getParcelPolicy(upid);
  }
  
  public void addClaim(java.lang.String policyId, java.lang.String claimId, java.lang.String claimDate, java.lang.String verifyDate, java.lang.String error, java.math.BigDecimal claimAmount, java.lang.String reasonCode, java.lang.String customerCaseSubmissionDate, java.lang.String customerCaseID, java.lang.String consigneeID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addClaim(policyId, claimId, claimDate, verifyDate, error, claimAmount, reasonCode, customerCaseSubmissionDate, customerCaseID, consigneeID);
  }
  
  public void addVerifyClaim(java.lang.String claimId, java.lang.String verificationID, java.lang.String verificationDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addVerifyClaim(claimId, verificationID, verificationDate);
  }
  
  public com.poc.clearpath.domain.Address getHubAddressForReturn(java.lang.String rma) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getHubAddressForReturn(rma);
  }
  
  public void addMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addMerchant(merchant);
  }
  
  public void updateMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.updateMerchant(merchant);
  }
  
  public com.poc.clearpath.domain.Merchant[] getAllMerchants() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getAllMerchants();
  }
  
  public com.poc.clearpath.domain.Partner[] getAllPartners() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getAllPartners();
  }
  
  public com.poc.clearpath.domain.Merchant getMerchantByPartner(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getMerchantByPartner(partnerCode, merchantCode);
  }
  
  public com.poc.clearpath.domain.MerchantBox[] getMerchantBoxes(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getMerchantBoxes(merchantCode);
  }
  
  public com.poc.clearpath.domain.Merchant[] getMerchantsByPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getMerchantsByPartner(partnerCode);
  }
  
  public void addCommodities(com.poc.clearpath.domain.CatalogCommodity[] commodities) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.addCommodities(commodities);
  }
  
  public java.lang.String confirmUploadCatalog(java.lang.String fileName) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.confirmUploadCatalog(fileName);
  }
  
  public void setImportHSCode2(java.lang.String merchantCode, java.lang.String sku, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.setImportHSCode2(merchantCode, sku, country, HSCode, source);
  }
  
  public com.poc.clearpath.domain.CountryHSCode[] getCommodityImportHSCodes(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getCommodityImportHSCodes(merchantCode, sku);
  }
  
  public boolean addTrackingEvent(com.poc.clearpath.domain.TrackingDetails details) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.addTrackingEvent(details);
  }
  
  public com.poc.clearpath.domain.TrackingDetails getTrackingDetails(java.lang.String referenceId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getTrackingDetails(referenceId);
  }
  
  public com.poc.clearpath.domain.TrackingDetails getTrackingDetailsByTracking(java.lang.String trackingNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getTrackingDetailsByTracking(trackingNumber);
  }
  
  public com.poc.clearpath.domain.ParcelDetails getParcelDetailsByBarCode(java.lang.String barcode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getParcelDetailsByBarCode(barcode);
  }
  
  public com.poc.clearpath.domain.ContainerTask generateDDUManifest() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.generateDDUManifest();
  }
  
  public com.poc.clearpath.domain.ContainerTask regenerateDDUManifest(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.regenerateDDUManifest(containerNumber);
  }
  
  public com.poc.clearpath.domain.OrderPageEx getOrdersEx(com.poc.clearpath.domain.OrderFilterEx filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getOrdersEx(filter, pageNumber);
  }
  
  public void testError() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    clearPathAPI_v9_0Bean.testError();
  }
  
  public java.lang.String getEntryHUB(java.lang.String countryCode, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException{
    if (clearPathAPI_v9_0Bean == null)
      _initClearPathAPI_v9_0BeanProxy();
    return clearPathAPI_v9_0Bean.getEntryHUB(countryCode, shippingMethodId);
  }
  
  
}