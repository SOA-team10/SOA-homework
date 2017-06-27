
package services.info;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AuthFault", targetNamespace = "http://jw.nju.edu.cn/schema")
public class AuthorityException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AuthFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AuthorityException(String message, AuthFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AuthorityException(String message, AuthFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: services.info.AuthFaultType
     */
    public AuthFaultType getFaultInfo() {
        return faultInfo;
    }

}
