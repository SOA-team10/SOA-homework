
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>错误类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="错误类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MissingParameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvalidStudentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9519\u8bef\u7c7b\u578b", propOrder = {
    "missingParameter",
    "noResult",
    "invalidStudentId"
})
public class 错误类型 {

    @XmlElement(name = "MissingParameter", required = true)
    protected String missingParameter;
    @XmlElement(name = "NoResult", required = true)
    protected String noResult;
    @XmlElement(name = "InvalidStudentId", required = true)
    protected String invalidStudentId;

    /**
     * 获取missingParameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingParameter() {
        return missingParameter;
    }

    /**
     * 设置missingParameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingParameter(String value) {
        this.missingParameter = value;
    }

    /**
     * 获取noResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoResult() {
        return noResult;
    }

    /**
     * 设置noResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoResult(String value) {
        this.noResult = value;
    }

    /**
     * 获取invalidStudentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidStudentId() {
        return invalidStudentId;
    }

    /**
     * 设置invalidStudentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidStudentId(String value) {
        this.invalidStudentId = value;
    }

}
