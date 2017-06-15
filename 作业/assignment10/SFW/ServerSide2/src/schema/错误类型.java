
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�������� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��������">
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
public class �������� {

    @XmlElement(name = "MissingParameter", required = true)
    protected String missingParameter;
    @XmlElement(name = "NoResult", required = true)
    protected String noResult;
    @XmlElement(name = "InvalidStudentId", required = true)
    protected String invalidStudentId;

    /**
     * ��ȡmissingParameter���Ե�ֵ��
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
     * ����missingParameter���Ե�ֵ��
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
     * ��ȡnoResult���Ե�ֵ��
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
     * ����noResult���Ե�ֵ��
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
     * ��ȡinvalidStudentId���Ե�ֵ��
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
     * ����invalidStudentId���Ե�ֵ��
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
