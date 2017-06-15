
package ass7;

import schema.错误类型;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "invalidDataError", targetNamespace = "http://jw.nju.edu.cn/test1")
public class SearchScoreFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private 错误类型 faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SearchScoreFault(String message, 错误类型 faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SearchScoreFault(String message, 错误类型 faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: java.lang.String
     */
    public 错误类型 getFaultInfo() {
        return faultInfo;
    }

}
