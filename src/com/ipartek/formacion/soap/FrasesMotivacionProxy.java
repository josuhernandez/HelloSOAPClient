package com.ipartek.formacion.soap;

public class FrasesMotivacionProxy implements com.ipartek.formacion.soap.FrasesMotivacion {
  private String _endpoint = null;
  private com.ipartek.formacion.soap.FrasesMotivacion frasesMotivacion = null;
  
  public FrasesMotivacionProxy() {
    _initFrasesMotivacionProxy();
  }
  
  public FrasesMotivacionProxy(String endpoint) {
    _endpoint = endpoint;
    _initFrasesMotivacionProxy();
  }
  
  private void _initFrasesMotivacionProxy() {
    try {
      frasesMotivacion = (new com.ipartek.formacion.soap.FrasesMotivacionServiceLocator()).getFrasesMotivacion();
      if (frasesMotivacion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)frasesMotivacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)frasesMotivacion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (frasesMotivacion != null)
      ((javax.xml.rpc.Stub)frasesMotivacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ipartek.formacion.soap.FrasesMotivacion getFrasesMotivacion() {
    if (frasesMotivacion == null)
      _initFrasesMotivacionProxy();
    return frasesMotivacion;
  }
  
  public java.lang.String dameFrase() throws java.rmi.RemoteException{
    if (frasesMotivacion == null)
      _initFrasesMotivacionProxy();
    return frasesMotivacion.dameFrase();
  }
  
  public java.lang.String pedirFrase(int idFrase) throws java.rmi.RemoteException{
    if (frasesMotivacion == null)
      _initFrasesMotivacionProxy();
    return frasesMotivacion.pedirFrase(idFrase);
  }
  
  
}