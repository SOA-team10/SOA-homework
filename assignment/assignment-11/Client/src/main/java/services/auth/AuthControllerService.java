/**
 * AuthControllerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public interface AuthControllerService extends javax.xml.rpc.Service {
    public java.lang.String getMyAuthPortAddress();

    public services.auth.MyAuth getMyAuthPort() throws javax.xml.rpc.ServiceException;

    public services.auth.MyAuth getMyAuthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
