/**
 * ClearPathAPI_v9_0BeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.poc.clearpath.webservice;

public class ClearPathAPI_v9_0BeanServiceLocator extends org.apache.axis.client.Service implements com.poc.clearpath.webservice.ClearPathAPI_v9_0BeanService {

    public ClearPathAPI_v9_0BeanServiceLocator() {
    }


    public ClearPathAPI_v9_0BeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClearPathAPI_v9_0BeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for cpAPI_v9_0
    private java.lang.String cpAPI_v9_0_address = "http://216.255.85.211/api/services/cpAPI_v9_0";

    public java.lang.String getcpAPI_v9_0Address() {
        return cpAPI_v9_0_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String cpAPI_v9_0WSDDServiceName = "cpAPI_v9_0";

    public java.lang.String getcpAPI_v9_0WSDDServiceName() {
        return cpAPI_v9_0WSDDServiceName;
    }

    public void setcpAPI_v9_0WSDDServiceName(java.lang.String name) {
        cpAPI_v9_0WSDDServiceName = name;
    }

    public com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean getcpAPI_v9_0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(cpAPI_v9_0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcpAPI_v9_0(endpoint);
    }

    public com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean getcpAPI_v9_0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.poc.clearpath.webservice.CpAPI_v9_0SoapBindingStub _stub = new com.poc.clearpath.webservice.CpAPI_v9_0SoapBindingStub(portAddress, this);
            _stub.setPortName(getcpAPI_v9_0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcpAPI_v9_0EndpointAddress(java.lang.String address) {
        cpAPI_v9_0_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.poc.clearpath.webservice.ClearPathAPI_v9_0Bean.class.isAssignableFrom(serviceEndpointInterface)) {
                com.poc.clearpath.webservice.CpAPI_v9_0SoapBindingStub _stub = new com.poc.clearpath.webservice.CpAPI_v9_0SoapBindingStub(new java.net.URL(cpAPI_v9_0_address), this);
                _stub.setPortName(getcpAPI_v9_0WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("cpAPI_v9_0".equals(inputPortName)) {
            return getcpAPI_v9_0();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "ClearPathAPI_v9_0BeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://service.pbclearpath.com/api/services/cpAPI_v9_0", "cpAPI_v9_0"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("cpAPI_v9_0".equals(portName)) {
            setcpAPI_v9_0EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
