/**
 * CpAPI_v9_0SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.webservice;

public class CpAPI_v9_0SoapBindingStub extends org.apache.axis.client.Stub implements com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[114];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Category"));
        oper.setReturnClass(com.poc.clearpath.domain.Category.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCategoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("test");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "basket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"), com.poc.clearpath.domain.Basket.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deliveryOption"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryOption"), com.poc.clearpath.domain.DeliveryOption.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"));
        oper.setReturnClass(com.poc.clearpath.domain.Basket.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "testReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Category"), com.poc.clearpath.domain.Category.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addCategoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Category"), com.poc.clearpath.domain.Category.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CategoryDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.CategoryDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCategoriesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCategoryHSCode1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCategoryHSCode2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeCategoryHSCode1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeCategoryHSCode2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAllCategoryHSCodes1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAllCategoryHSCodes2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCommodity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodity"), com.poc.clearpath.domain.CatalogCommodity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addCommodityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCommodity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodity"), com.poc.clearpath.domain.CatalogCommodity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommodity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodityDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.CatalogCommodityDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommodityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommodities1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CatalogCommodityDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.CatalogCommodityDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommodities1Return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommodities2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CatalogCommodityDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.CatalogCommodityDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommodities2Return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommodityCountryOfOrigin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "countryOfOrigin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommodityDefaultImportHSCode1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodityId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommodityDefaultImportHSCode2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommodityDefaultExportHSCode1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodityId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommodityDefaultExportHSCode2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setImportHSCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodityID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmUploadFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "confirmUploadFileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUploadCatalogStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "confirmationNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUploadCatalogStatusReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getECCN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ECCN"));
        oper.setReturnClass(com.poc.clearpath.domain.ECCN.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getECCNReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCategoryHSCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_soapenc_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCategoryHSCodesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommodityDefaultImportHSCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sku"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommodityDefaultImportHSCodeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitForExportVerificationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "skuList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_soapenc_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExportVerificationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sku"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExportVerification"));
        oper.setReturnClass(com.poc.clearpath.domain.ExportVerification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getExportVerificationDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExportUnclassifiedCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referenceDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BrokerClassification"));
        oper.setReturnClass(com.poc.clearpath.domain.BrokerClassification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getExportUnclassifiedCommoditiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImportUnclassifiedCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referenceDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BrokerClassification"));
        oper.setReturnClass(com.poc.clearpath.domain.BrokerClassification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getImportUnclassifiedCommoditiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImportClassifiedCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referenceDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "itemsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BrokerClassification"));
        oper.setReturnClass(com.poc.clearpath.domain.BrokerClassification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getImportClassifiedCommoditiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderFilter"), com.poc.clearpath.domain.OrderFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderPage"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrdersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setOrderReference");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackingSlip");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generatePackingSlipReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateDDULabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generateDDULabelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePackageControlLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "destinationAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"), com.poc.clearpath.domain.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"), com.poc.clearpath.domain.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generatePackageControlLabelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParcelDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getParcelDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Invoice"));
        oper.setReturnClass(com.poc.clearpath.domain.Invoice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInvoicesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InvoiceDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.InvoiceDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInvoiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEstimatedDutiesAndTaxes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "basket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"), com.poc.clearpath.domain.Basket.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portOfEntry"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteNoShDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.QuoteNoShDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getEstimatedDutiesAndTaxesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getQuote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "basket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"), com.poc.clearpath.domain.Basket.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deliveryOption"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryOption"), com.poc.clearpath.domain.DeliveryOption.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.QuoteDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getQuoteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "confirmDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrderDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderDetailsByInboundParcelIdentification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "packgeIdentificationNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrderDetailsByInboundParcelIdentificationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderDetailsByInboundParcelNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrderDetailsByInboundParcelNumberReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPartnerByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPartnerByOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkOrderCommodityRestrictions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sku"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "countryOfOrigin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHubAddressForOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        oper.setReturnClass(com.poc.clearpath.domain.Address.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getHubAddressForOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Order"), com.poc.clearpath.domain.Order.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRestrictions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "basket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"), com.poc.clearpath.domain.Basket.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portOfEntry"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shippingMethodId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "RestrictionDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.RestrictionDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "checkRestrictionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkSizeRestrictions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"), com.poc.clearpath.domain.Size.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shippingMethodId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "county"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getShippingMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "basket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket"), com.poc.clearpath.domain.Basket.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ShippingMethod"));
        oper.setReturnClass(com.poc.clearpath.domain.ShippingMethod[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getShippingMethodsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getShippingPropertiesByMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ShippingProperty"));
        oper.setReturnClass(com.poc.clearpath.domain.ShippingProperty[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getShippingPropertiesByMerchantReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addShippingPropertyByMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addShippingPropertyByMerchantReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateShippingPropertyByMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateShippingPropertyByMerchantReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeShippingPropertyByMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeShippingPropertyByMerchantReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addShippingPropertyByCountry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addShippingPropertyByCountryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeShippingPropertyByCountry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeShippingPropertyByCountryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeContainer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "containerType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "closeContainerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addParcelToContainer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "containerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteParcelFromContainer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "containerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContainerForParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContainerForParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContainerDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "containerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ContainerDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContainerDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelDisposition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isSplitParcel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createExceptionParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addItemToExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionCommodity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionCommodity"), com.poc.clearpath.domain.ExceptionCommodity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUnknownItemToExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionCommodity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "UnknownCommodity"), com.poc.clearpath.domain.UnknownCommodity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"), com.poc.clearpath.domain.Size.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "closeExceptionParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exceptionParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ExceptionParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getExceptionParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExceptionsByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_soapenc_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getExceptionsByOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOpenExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ExceptionParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOpenExceptionParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOpenExceptionParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ExceptionParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOpenExceptionParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant"));
        oper.setReturnClass(com.poc.clearpath.domain.Merchant.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMerchantReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Partner"));
        oper.setReturnClass(com.poc.clearpath.domain.Partner.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPartnerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmParcelDelivery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deliveredDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createParcelFromInboundParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"), com.poc.clearpath.domain.Size.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createParcelFromInboundParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Parcel"), com.poc.clearpath.domain.Parcel.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isSplitParcel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"), java.lang.Boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderDetailsByParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrderDetailsByParcelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParcelsByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_soapenc_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getParcelsByOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParcelDetailsListByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ParcelDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getParcelDetailsListByOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addParcelEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parcelType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eventType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateInboundParcelSize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actualInboundParcelSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size"), com.poc.clearpath.domain.Size.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addInboundParcel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcel"), com.poc.clearpath.domain.InboundParcel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInboundParcelByNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inboundParcelNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInboundParcelByIdentification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "packageIdentificationNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInboundParcelDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.InboundParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInboundParcelDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInboundParcelDetailsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_InboundParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.InboundParcelDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInboundParcelDetailsListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInboundParcelDetailsListByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_InboundParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.InboundParcelDetails[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getInboundParcelDetailsListByOrderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addParcelPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "upid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "policyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "policyDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "policyStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "policyError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParcelPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "upid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://policy.domain.api.clearpath.pb.com", "Policy"));
        oper.setReturnClass(com.poc.clearpath.api.domain.policy.Policy.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getParcelPolicyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addClaim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "policyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "claimId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "claimDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verifyDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "claimAmount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reasonCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerCaseSubmissionDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerCaseID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "consigneeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addVerifyClaim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "claimId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "verificationDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHubAddressForReturn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rma"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address"));
        oper.setReturnClass(com.poc.clearpath.domain.Address.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getHubAddressForReturnReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant"), com.poc.clearpath.domain.Merchant.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant"), com.poc.clearpath.domain.Merchant.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllMerchants");
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Merchant"));
        oper.setReturnClass(com.poc.clearpath.domain.Merchant[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllMerchantsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllPartners");
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Partner"));
        oper.setReturnClass(com.poc.clearpath.domain.Partner[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllPartnersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMerchantByPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant"));
        oper.setReturnClass(com.poc.clearpath.domain.Merchant.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMerchantByPartnerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMerchantBoxes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_MerchantBox"));
        oper.setReturnClass(com.poc.clearpath.domain.MerchantBox[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMerchantBoxesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMerchantsByPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Merchant"));
        oper.setReturnClass(com.poc.clearpath.domain.Merchant[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMerchantsByPartnerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "commodities"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CatalogCommodity"), com.poc.clearpath.domain.CatalogCommodity[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmUploadCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "confirmUploadCatalogReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setImportHSCode2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sku"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "HSCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommodityImportHSCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "merchantCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sku"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CountryHSCode"));
        oper.setReturnClass(com.poc.clearpath.domain.CountryHSCode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommodityImportHSCodesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTrackingEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "details"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingDetails"), com.poc.clearpath.domain.TrackingDetails.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addTrackingEventReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrackingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "referenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.TrackingDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTrackingDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrackingDetailsByTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.TrackingDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTrackingDetailsByTrackingReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParcelDetailsByBarCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "barcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelDetails"));
        oper.setReturnClass(com.poc.clearpath.domain.ParcelDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getParcelDetailsByBarCodeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateDDUManifest");
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerTask"));
        oper.setReturnClass(com.poc.clearpath.domain.ContainerTask.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generateDDUManifestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("regenerateDDUManifest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "containerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerTask"));
        oper.setReturnClass(com.poc.clearpath.domain.ContainerTask.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "regenerateDDUManifestReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrdersEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderFilterEx"), com.poc.clearpath.domain.OrderFilterEx.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"), java.lang.Integer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderPageEx"));
        oper.setReturnClass(com.poc.clearpath.domain.OrderPageEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getOrdersExReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testError");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntryHUB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shippingMethodId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getEntryHUBReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "fault"),
                      "com.pb.clearpath.domain.CPAppException",
                      new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException"), 
                      true
                     ));
        _operations[113] = oper;

    }

    public CpAPI_v9_0SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CpAPI_v9_0SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CpAPI_v9_0SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://policy.domain.api.clearpath.pb.com", "Policy");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.api.domain.policy.Policy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_BasketCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.BasketCommodity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BasketCommodity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CatalogCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CatalogCommodity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CatalogCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CatalogCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CategoryDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CategoryDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CategoryDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CommodityClassification");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CommodityClassification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityClassification");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CommodityStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CommodityStatement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityStatement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CostComponent");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CostComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CountryHSCode");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CountryHSCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CountryHSCode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CPError");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CPError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPError");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_CPException");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CPException[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPException");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_EstimatedParcel");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.EstimatedParcel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "EstimatedParcel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ExceptionParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ExceptionParcelCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_InboundParcelCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelCommodity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_InboundParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_InboundParcelDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Invoice");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Invoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Invoice");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Merchant");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Merchant[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_MerchantBox");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.MerchantBox[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantBox");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_MerchantStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.MerchantStatement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantStatement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_OrderCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_OrderHeader");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeader");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_OrderHeaderEx");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderHeaderEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeaderEx");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ParcelCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelCommodity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ParcelDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ParcelStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelStatement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_Partner");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Partner[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Partner");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_QuoteCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_QuoteNoShCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteNoShCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteNoShCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_RestrictionCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.RestrictionCommodityDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "RestrictionCommodityDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ShippingMethod");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingMethod");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ShippingOption");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingOption");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_ShippingProperty");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingProperty");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ArrayOf_tns1_TrackingEvent");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.TrackingEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Address");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Basket");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Basket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BasketCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.BasketCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "BrokerClassification");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.BrokerClassification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CatalogCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CatalogCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CatalogCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Category");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CategoryDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CategoryDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityClassification");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CommodityClassification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CommodityStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CommodityStatement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Consignee");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Consignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Container");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Container.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ContainerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ContainerTask");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ContainerTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CostComponent");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CostComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CountryHSCode");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CountryHSCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPAppException");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CPAppException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPError");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CPError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "CPException");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.CPException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryOption");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.DeliveryOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "DeliveryPromise");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.DeliveryPromise.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ECCN");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ECCN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "EstimatedParcel");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.EstimatedParcel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ExceptionCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ExceptionParcelCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExceptionParcelDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ExceptionParcelDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Exporter");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Exporter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ExportVerification");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ExportVerification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcel");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InboundParcelReturnAddress");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InboundParcelReturnAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Invoice");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Invoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "InvoiceDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.InvoiceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Merchant");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Merchant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantBox");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.MerchantBox.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.MerchantDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "MerchantStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.MerchantStatement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Order");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderFilter");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderFilterEx");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderFilterEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeader");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderHeaderEx");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderHeaderEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderPage");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "OrderPageEx");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.OrderPageEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Parcel");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Parcel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelConsignee");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelConsignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ParcelStatement");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ParcelStatement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Partner");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Partner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteNoShCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteNoShCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "QuoteNoShDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.QuoteNoShDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "RestrictionCommodityDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.RestrictionCommodityDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "RestrictionDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.RestrictionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingMethod");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingOption");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "ShippingProperty");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.ShippingProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "Size");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingDetails");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.TrackingDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "TrackingEvent");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.TrackingEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:v9_0.domain.pbclearpath.com", "UnknownCommodity");
            cachedSerQNames.add(qName);
            cls = com.poc.clearpath.domain.UnknownCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.poc.clearpath.domain.Category getCategory(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Category) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Category) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Category.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Basket test(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "test"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {basket, deliveryOption});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Basket) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Basket) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Basket.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.math.BigDecimal addCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {category});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateCategory(com.poc.clearpath.domain.Category category) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "updateCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {category});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.CategoryDetails[] getCategories(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.CategoryDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.CategoryDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.CategoryDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addCategoryHSCode1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {categoryId, HSCode, HSMode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode, java.lang.Integer HSMode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addCategoryHSCode2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode, HSCode, HSMode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeCategoryHSCode1(java.math.BigDecimal categoryId, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeCategoryHSCode1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {categoryId, HSCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeCategoryHSCode2(java.lang.String merchantCode, java.lang.String categoryCode, java.lang.String HSCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeCategoryHSCode2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode, HSCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeAllCategoryHSCodes1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeAllCategoryHSCodes1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {categoryId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void removeAllCategoryHSCodes2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeAllCategoryHSCodes2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.math.BigDecimal addCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addCommodity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateCommodity(com.poc.clearpath.domain.CatalogCommodity commodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "updateCommodity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.CatalogCommodityDetails getCommodity(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCommodity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, SKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.CatalogCommodityDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.CatalogCommodityDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.CatalogCommodityDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities1(java.math.BigDecimal categoryId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCommodities1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {categoryId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.CatalogCommodityDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.CatalogCommodityDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.CatalogCommodityDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.CatalogCommodityDetails[] getCommodities2(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCommodities2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.CatalogCommodityDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.CatalogCommodityDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.CatalogCommodityDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCommodityCountryOfOrigin(java.lang.String merchantCode, java.lang.String SKU, java.lang.String countryOfOrigin) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setCommodityCountryOfOrigin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, SKU, countryOfOrigin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCommodityDefaultImportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setCommodityDefaultImportHSCode1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodityId, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCommodityDefaultImportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setCommodityDefaultImportHSCode2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, SKU, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCommodityDefaultExportHSCode1(java.math.BigDecimal commodityId, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setCommodityDefaultExportHSCode1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodityId, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCommodityDefaultExportHSCode2(java.lang.String merchantCode, java.lang.String SKU, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setCommodityDefaultExportHSCode2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, SKU, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setImportHSCode(java.math.BigDecimal commodityID, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setImportHSCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodityID, country, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String confirmUploadFile(java.lang.String fileName, java.lang.String type) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "confirmUploadFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fileName, type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getUploadCatalogStatus(java.lang.String confirmationNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getUploadCatalogStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {confirmationNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ECCN getECCN(java.lang.String merchantCode, java.lang.String SKU) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getECCN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, SKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ECCN) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ECCN) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ECCN.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getCategoryHSCodes(java.lang.String merchantCode, java.lang.String categoryCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCategoryHSCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, categoryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getCommodityDefaultImportHSCode(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCommodityDefaultImportHSCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, sku});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void submitForExportVerificationDetails(java.lang.String merchantCode, java.lang.String[] skuList, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "submitForExportVerificationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, skuList, country});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ExportVerification getExportVerificationDetails(java.lang.String merchantCode, java.lang.String sku, java.lang.String country) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getExportVerificationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, sku, country});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ExportVerification) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ExportVerification) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ExportVerification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.BrokerClassification getExportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getExportUnclassifiedCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.BrokerClassification) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.BrokerClassification) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.BrokerClassification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.BrokerClassification getImportUnclassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getImportUnclassifiedCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.BrokerClassification) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.BrokerClassification) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.BrokerClassification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.BrokerClassification getImportClassifiedCommodities(java.lang.String country, java.lang.String fromDate, java.lang.String toDate, java.lang.String referenceDate, java.lang.Integer itemsPerPage, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getImportClassifiedCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {country, fromDate, toDate, referenceDate, itemsPerPage, pageNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.BrokerClassification) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.BrokerClassification) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.BrokerClassification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderPage getOrders(com.poc.clearpath.domain.OrderFilter filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter, pageNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setOrderReference(java.lang.String orderNumber, java.lang.String orderReference) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setOrderReference"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber, orderReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generatePackingSlip(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "generatePackingSlip"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generateDDULabel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "generateDDULabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generatePackageControlLabel(com.poc.clearpath.domain.Address destinationAddress, com.poc.clearpath.domain.Address senderAddress, java.lang.String orderNumber, java.lang.String parcelId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "generatePackageControlLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {destinationAddress, senderAddress, orderNumber, parcelId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ParcelDetails getParcelDetails(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getParcelDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Invoice[] getInvoices(java.lang.String startDate, java.lang.String endDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Invoice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Invoice[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Invoice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.InvoiceDetails getInvoice(java.lang.String invoiceNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoiceNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.InvoiceDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.InvoiceDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.InvoiceDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.QuoteNoShDetails getEstimatedDutiesAndTaxes(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getEstimatedDutiesAndTaxes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {basket, portOfEntry});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.QuoteNoShDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.QuoteNoShDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.QuoteNoShDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.QuoteDetails getQuote(com.poc.clearpath.domain.Basket basket, com.poc.clearpath.domain.DeliveryOption deliveryOption) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getQuote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {basket, deliveryOption});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.QuoteDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.QuoteDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.QuoteDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void confirmOrder(java.lang.String orderNumber, java.lang.String confirmDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "confirmOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber, confirmDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "cancelOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderDetails getOrderDetails(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrderDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelIdentification(java.lang.String packgeIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrderDetailsByInboundParcelIdentification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {packgeIdentificationNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByInboundParcelNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrderDetailsByInboundParcelNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inboundParcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getPartnerByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getPartnerByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void checkOrderCommodityRestrictions(java.lang.String orderNumber, java.lang.String sku, java.lang.String countryOfOrigin, java.math.BigDecimal quantity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "checkOrderCommodityRestrictions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber, sku, countryOfOrigin, quantity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Address getHubAddressForOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getHubAddressForOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Address) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Address) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addOrder(com.poc.clearpath.domain.Order order) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {order});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.RestrictionDetails checkRestrictions(com.poc.clearpath.domain.Basket basket, java.lang.String portOfEntry, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "checkRestrictions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {basket, portOfEntry, shippingMethodId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.RestrictionDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.RestrictionDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.RestrictionDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void checkSizeRestrictions(com.poc.clearpath.domain.Size size, java.lang.String shippingMethodId, java.lang.String county) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "checkSizeRestrictions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {size, shippingMethodId, county});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ShippingMethod[] getShippingMethods(com.poc.clearpath.domain.Basket basket) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getShippingMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {basket});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ShippingMethod[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ShippingMethod[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ShippingMethod[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ShippingProperty[] getShippingPropertiesByMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getShippingPropertiesByMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ShippingProperty[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ShippingProperty[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ShippingProperty[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addShippingPropertyByMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, name, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "updateShippingPropertyByMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, name, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeShippingPropertyByMerchant(java.lang.String merchantCode, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeShippingPropertyByMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name, java.lang.String value) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addShippingPropertyByCountry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, country, name, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeShippingPropertyByCountry(java.lang.String merchantCode, java.lang.String country, java.lang.String name) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "removeShippingPropertyByCountry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, country, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String closeContainer(java.lang.String containerType) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "closeContainer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {containerType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addParcelToContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addParcelToContainer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {containerNumber, parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteParcelFromContainer(java.lang.String containerNumber, java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "deleteParcelFromContainer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {containerNumber, parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getContainerForParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getContainerForParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ContainerDetails getContainerDetails(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getContainerDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {containerNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ContainerDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ContainerDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ContainerDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String createExceptionParcel(java.lang.String merchantCode, java.lang.String parcelDisposition, java.lang.String inboundParcelNumber, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "createExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, parcelDisposition, inboundParcelNumber, isSplitParcel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.ExceptionCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addItemToExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exceptionParcelNumber, exceptionCommodity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addUnknownItemToExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.UnknownCommodity exceptionCommodity) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addUnknownItemToExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exceptionParcelNumber, exceptionCommodity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String closeExceptionParcel(java.lang.String exceptionParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "closeExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exceptionParcelNumber, size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ExceptionParcelDetails getExceptionParcel(java.lang.String exceptionParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exceptionParcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ExceptionParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getExceptionsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getExceptionsByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOpenExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ExceptionParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ExceptionParcelDetails getOpenExceptionParcel(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOpenExceptionParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {partnerCode, merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ExceptionParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ExceptionParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Merchant getMerchant(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Merchant) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Merchant) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Merchant.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Partner getPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {partnerCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Partner) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Partner) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Partner.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void confirmParcelDelivery(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String deliveredDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "confirmParcelDelivery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber, parcelType, deliveredDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String createParcelFromInboundParcel(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size size) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "createParcelFromInboundParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inboundParcelNumber, size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String createParcel(com.poc.clearpath.domain.Parcel parcel, java.lang.Boolean isSplitParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "createParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcel, isSplitParcel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderDetails getOrderDetailsByParcel(java.lang.String parcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrderDetailsByParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getParcelsByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getParcelsByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ParcelDetails[] getParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getParcelDetailsListByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ParcelDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ParcelDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ParcelDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addParcelEvent(java.lang.String parcelNumber, java.lang.String parcelType, java.lang.String eventType, java.lang.String date) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addParcelEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parcelNumber, parcelType, eventType, date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateInboundParcelSize(java.lang.String inboundParcelNumber, com.poc.clearpath.domain.Size actualInboundParcelSize) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "updateInboundParcelSize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inboundParcelNumber, actualInboundParcelSize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addInboundParcel(com.poc.clearpath.domain.InboundParcel inboundParcel) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addInboundParcel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inboundParcel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelInboundParcelByNumber(java.lang.String inboundParcelNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "cancelInboundParcelByNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inboundParcelNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelInboundParcelByIdentification(java.lang.String packageIdentificationNo) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "cancelInboundParcelByIdentification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {packageIdentificationNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.InboundParcelDetails getInboundParcelDetails(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getInboundParcelDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.InboundParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.InboundParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.InboundParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsList(java.lang.String ID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getInboundParcelDetailsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.InboundParcelDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.InboundParcelDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.InboundParcelDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.InboundParcelDetails[] getInboundParcelDetailsListByOrder(java.lang.String orderNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getInboundParcelDetailsListByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orderNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.InboundParcelDetails[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.InboundParcelDetails[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.InboundParcelDetails[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addParcelPolicy(java.lang.String upid, java.lang.String policyId, java.lang.String policyDate, java.lang.String policyStatus, java.lang.String policyError) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addParcelPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {upid, policyId, policyDate, policyStatus, policyError});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.api.domain.policy.Policy getParcelPolicy(java.lang.String upid) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getParcelPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {upid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.api.domain.policy.Policy) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.api.domain.policy.Policy) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.api.domain.policy.Policy.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addClaim(java.lang.String policyId, java.lang.String claimId, java.lang.String claimDate, java.lang.String verifyDate, java.lang.String error, java.math.BigDecimal claimAmount, java.lang.String reasonCode, java.lang.String customerCaseSubmissionDate, java.lang.String customerCaseID, java.lang.String consigneeID) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addClaim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {policyId, claimId, claimDate, verifyDate, error, claimAmount, reasonCode, customerCaseSubmissionDate, customerCaseID, consigneeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addVerifyClaim(java.lang.String claimId, java.lang.String verificationID, java.lang.String verificationDate) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addVerifyClaim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {claimId, verificationID, verificationDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Address getHubAddressForReturn(java.lang.String rma) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getHubAddressForReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rma});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Address) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Address) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Address.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchant});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateMerchant(com.poc.clearpath.domain.Merchant merchant) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "updateMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchant});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Merchant[] getAllMerchants() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getAllMerchants"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Merchant[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Merchant[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Merchant[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Partner[] getAllPartners() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getAllPartners"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Partner[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Partner[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Partner[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Merchant getMerchantByPartner(java.lang.String partnerCode, java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getMerchantByPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {partnerCode, merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Merchant) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Merchant) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Merchant.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.MerchantBox[] getMerchantBoxes(java.lang.String merchantCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getMerchantBoxes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.MerchantBox[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.MerchantBox[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.MerchantBox[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.Merchant[] getMerchantsByPartner(java.lang.String partnerCode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getMerchantsByPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {partnerCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.Merchant[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.Merchant[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.Merchant[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addCommodities(com.poc.clearpath.domain.CatalogCommodity[] commodities) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commodities});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String confirmUploadCatalog(java.lang.String fileName) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "confirmUploadCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setImportHSCode2(java.lang.String merchantCode, java.lang.String sku, java.lang.String country, java.lang.String HSCode, java.lang.String source) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "setImportHSCode2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, sku, country, HSCode, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.CountryHSCode[] getCommodityImportHSCodes(java.lang.String merchantCode, java.lang.String sku) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getCommodityImportHSCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantCode, sku});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.CountryHSCode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.CountryHSCode[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.CountryHSCode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addTrackingEvent(com.poc.clearpath.domain.TrackingDetails details) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "addTrackingEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {details});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.TrackingDetails getTrackingDetails(java.lang.String referenceId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getTrackingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {referenceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.TrackingDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.TrackingDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.TrackingDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.TrackingDetails getTrackingDetailsByTracking(java.lang.String trackingNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getTrackingDetailsByTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trackingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.TrackingDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.TrackingDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.TrackingDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ParcelDetails getParcelDetailsByBarCode(java.lang.String barcode) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getParcelDetailsByBarCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {barcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ParcelDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ParcelDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ParcelDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ContainerTask generateDDUManifest() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "generateDDUManifest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ContainerTask) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ContainerTask) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ContainerTask.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.ContainerTask regenerateDDUManifest(java.lang.String containerNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "regenerateDDUManifest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {containerNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.ContainerTask) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.ContainerTask) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.ContainerTask.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.poc.clearpath.domain.OrderPageEx getOrdersEx(com.poc.clearpath.domain.OrderFilterEx filter, java.lang.Integer pageNumber) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getOrdersEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter, pageNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.poc.clearpath.domain.OrderPageEx) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.poc.clearpath.domain.OrderPageEx) org.apache.axis.utils.JavaUtils.convert(_resp, com.poc.clearpath.domain.OrderPageEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testError() throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "testError"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getEntryHUB(java.lang.String countryCode, java.lang.String shippingMethodId) throws java.rmi.RemoteException, com.poc.clearpath.domain.CPAppException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://v9_0.service.api.clearpath.pb.com", "getEntryHUB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode, shippingMethodId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.poc.clearpath.domain.CPAppException) {
              throw (com.poc.clearpath.domain.CPAppException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
