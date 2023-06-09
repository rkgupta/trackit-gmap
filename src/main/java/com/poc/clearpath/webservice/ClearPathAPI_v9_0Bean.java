/**
 * ClearPathAPI_v9_0Bean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.webservice;

public interface ClearPathAPI_v9_0Bean extends java.rmi.Remote {
    public com.poc.clearpath.domain.Category getCategory(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Basket test(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.math.BigDecimal addCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void updateCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.CategoryDetails[] getCategories(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void removeCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void removeCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void removeAllCategoryHSCodes1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void removeAllCategoryHSCodes2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.math.BigDecimal addCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void updateCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.CatalogCommodityDetails getCommodity(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setCommodityCountryOfOrigin(java.lang.String merchantCode, java.lang.String SKU, java.lang.String countryOfOrigin) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setCommodityDefaultImportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setCommodityDefaultImportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setCommodityDefaultExportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setCommodityDefaultExportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setImportHSCode(java.math.BigDecimal commodityID, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String confirmUploadFile(java.lang.String fileName, java.lang.String type) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String getUploadCatalogStatus(java.lang.String confirmationNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ECCN getECCN(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String[] getCategoryHSCodes(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String getCommodityDefaultImportHSCode(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void submitForExportVerificationDetails(java.lang.String merchantCode, java.lang.String[] skuList, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ExportVerification getExportVerificationDetails(java.lang.String merchantCode, java.lang.String sku, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.BrokerClassification getExportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.BrokerClassification getImportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.BrokerClassification getImportClassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderPage getOrders(com.poc.clearpath.domain.OrderFilter filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setOrderReference(java.lang.String orderNumber, java.lang.String orderReference) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String generatePackingSlip(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String generateDDULabel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String generatePackageControlLabel(com.poc.clearpath.domain.Address destinationAddress, com.poc.clearpath.domain.Address senderAddress, java.lang.String orderNumber, java.lang.String parcelId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ParcelDetails getParcelDetails(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Invoice[] getInvoices(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.InvoiceDetails getInvoice(java.lang.String invoiceNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.QuoteNoShDetails getEstimatedDutiesAndTaxes(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.QuoteDetails getQuote(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void confirmOrder(java.lang.String orderNumber, java.lang.String confirmDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void cancelOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderDetails getOrderDetails(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelIdentification(java.lang.String packgeIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String getPartnerByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void checkOrderCommodityRestrictions(java.lang.String orderNumber, java.lang.String sku, java.lang.String countryOfOrigin, java.math.BigDecimal quantity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Address getHubAddressForOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addOrder(com.poc.clearpath.domain.Order order) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.RestrictionDetails checkRestrictions(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void checkSizeRestrictions(com.poc.clearpath.domain.Size size, java.lang.String shippingMethodId, java.lang.String county) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ShippingMethod[] getShippingMethods(com.poc.clearpath.domain.Basket basket) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ShippingProperty[] getShippingPropertiesByMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean addShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean updateShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean removeShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean addShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean removeShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String closeContainer(java.lang.String containerType) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addParcelToContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void deleteParcelFromContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String getContainerForParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ContainerDetails getContainerDetails(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String createExceptionParcel(java.lang.String merchantCode, java.lang.String parcelDisposition, java.lang.String inboundParcelNumber, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.ExceptionCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addUnknownItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.UnknownCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String closeExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ExceptionParcelDetails getExceptionParcel(java.lang.String exceptionParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String[] getExceptionsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Merchant getMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Partner getPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void confirmParcelDelivery(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String deliveredDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String createParcelFromInboundParcel(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String createParcel(com.poc.clearpath.domain.Parcel parcel, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String[] getParcelsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ParcelDetails[] getParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addParcelEvent(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String eventType, java.lang.String date) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void updateInboundParcelSize(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size actualInboundParcelSize) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addInboundParcel(com.poc.clearpath.domain.InboundParcel inboundParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void cancelInboundParcelByNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void cancelInboundParcelByIdentification(java.lang.String packageIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.InboundParcelDetails getInboundParcelDetails(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsList(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addParcelPolicy(java.lang.String upid, java.lang.String policyId, java.lang.String policyDate, java.lang.String policyStatus, java.lang.String policyError) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.api.domain.policy.Policy getParcelPolicy(java.lang.String upid) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addClaim(java.lang.String policyId, java.lang.String claimId, java.lang.String claimDate, java.lang.String verifyDate, java.lang.String error, java.math.BigDecimal claimAmount, java.lang.String reasonCode, java.lang.String customerCaseSubmissionDate, java.lang.String customerCaseID, java.lang.String consigneeID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addVerifyClaim(java.lang.String claimId, java.lang.String verificationID, java.lang.String verificationDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Address getHubAddressForReturn(java.lang.String rma) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void updateMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Merchant[] getAllMerchants() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Partner[] getAllPartners() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Merchant getMerchantByPartner(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.MerchantBox[] getMerchantBoxes(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.Merchant[] getMerchantsByPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void addCommodities(com.poc.clearpath.domain.CatalogCommodity[] commodities) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String confirmUploadCatalog(java.lang.String fileName) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void setImportHSCode2(java.lang.String merchantCode, java.lang.String sku, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.CountryHSCode[] getCommodityImportHSCodes(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public boolean addTrackingEvent(com.poc.clearpath.domain.TrackingDetails details) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.TrackingDetails getTrackingDetails(java.lang.String referenceId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.TrackingDetails getTrackingDetailsByTracking(java.lang.String trackingNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ParcelDetails getParcelDetailsByBarCode(java.lang.String barcode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ContainerTask generateDDUManifest() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.ContainerTask regenerateDDUManifest(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public com.poc.clearpath.domain.OrderPageEx getOrdersEx(com.poc.clearpath.domain.OrderFilterEx filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public void testError() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
    public java.lang.String getEntryHUB(java.lang.String countryCode, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException;
}
