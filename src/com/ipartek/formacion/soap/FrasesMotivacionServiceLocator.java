/**
 * FrasesMotivacionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipartek.formacion.soap;

public class FrasesMotivacionServiceLocator extends org.apache.axis.client.Service implements com.ipartek.formacion.soap.FrasesMotivacionService {

    public FrasesMotivacionServiceLocator() {
    }


    public FrasesMotivacionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FrasesMotivacionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FrasesMotivacion
    private java.lang.String FrasesMotivacion_address = "http://localhost:8080/HelloSOAP/services/FrasesMotivacion";

    public java.lang.String getFrasesMotivacionAddress() {
        return FrasesMotivacion_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FrasesMotivacionWSDDServiceName = "FrasesMotivacion";

    public java.lang.String getFrasesMotivacionWSDDServiceName() {
        return FrasesMotivacionWSDDServiceName;
    }

    public void setFrasesMotivacionWSDDServiceName(java.lang.String name) {
        FrasesMotivacionWSDDServiceName = name;
    }

    public com.ipartek.formacion.soap.FrasesMotivacion getFrasesMotivacion() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FrasesMotivacion_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFrasesMotivacion(endpoint);
    }

    public com.ipartek.formacion.soap.FrasesMotivacion getFrasesMotivacion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ipartek.formacion.soap.FrasesMotivacionSoapBindingStub _stub = new com.ipartek.formacion.soap.FrasesMotivacionSoapBindingStub(portAddress, this);
            _stub.setPortName(getFrasesMotivacionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFrasesMotivacionEndpointAddress(java.lang.String address) {
        FrasesMotivacion_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ipartek.formacion.soap.FrasesMotivacion.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ipartek.formacion.soap.FrasesMotivacionSoapBindingStub _stub = new com.ipartek.formacion.soap.FrasesMotivacionSoapBindingStub(new java.net.URL(FrasesMotivacion_address), this);
                _stub.setPortName(getFrasesMotivacionWSDDServiceName());
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
        if ("FrasesMotivacion".equals(inputPortName)) {
            return getFrasesMotivacion();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.formacion.ipartek.com", "FrasesMotivacionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.formacion.ipartek.com", "FrasesMotivacion"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FrasesMotivacion".equals(portName)) {
            setFrasesMotivacionEndpointAddress(address);
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
