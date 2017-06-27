
package services.info;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidParamFault", targetNamespace = "http://jw.nju.edu.cn/schema")
public class ScoreModifyException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParamFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ScoreModifyException(String message, ParamFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ScoreModifyException(String message, ParamFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: services.info.ParamFaultType
     */
    public ParamFaultType getFaultInfo() {
        return faultInfo;
    }

}
