/**
 * MyAuth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public interface MyAuth extends java.rmi.Remote {
    public services.auth.验证类型 verify(services.auth.账号认证类型 parameters) throws java.rmi.RemoteException, services.auth.AuthFaultType, services.auth.NotFoundType;
}
