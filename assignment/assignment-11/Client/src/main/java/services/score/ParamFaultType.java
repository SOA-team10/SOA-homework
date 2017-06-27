
package services.score;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParamFaultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ParamFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ParamIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FaultInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *       &lt;attribute name="ParamName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamFaultType", propOrder = {

})
public class ParamFaultType {

    @XmlElement(name = "ParamIndex", required = true)
    protected BigInteger paramIndex;
    @XmlElement(name = "FaultInfo", required = true)
    protected String faultInfo;
    @XmlAttribute(name = "ParamName")
    protected String paramName;

    /**
     * ��ȡparamIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParamIndex() {
        return paramIndex;
    }

    /**
     * ����paramIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParamIndex(BigInteger value) {
        this.paramIndex = value;
    }

    /**
     * ��ȡfaultInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultInfo() {
        return faultInfo;
    }

    /**
     * ����faultInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultInfo(String value) {
        this.faultInfo = value;
    }

    /**
     * ��ȡparamName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * ����paramName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

}
