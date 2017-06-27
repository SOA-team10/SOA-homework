
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VerifyResultType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VerifyResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentNotExist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BadPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VeritySuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9a8c\u8bc1\u7ed3\u679c\u7c7b\u578b", propOrder = {
    "studentNotExist",
    "badPassword",
    "veritySuccess"
})
public class VerifyResultType {

    @XmlElement(name = "StudentNotExist", required = true)
    protected String studentNotExist;
    @XmlElement(name = "BadPassword", required = true)
    protected String badPassword;
    @XmlElement(name = "VeritySuccess", required = true)
    protected String veritySuccess;

    /**
     * ��ȡstudentNotExist���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentNotExist() {
        return studentNotExist;
    }

    /**
     * ����studentNotExist���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentNotExist(String value) {
        this.studentNotExist = value;
    }

    /**
     * ��ȡbadPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadPassword() {
        return badPassword;
    }

    /**
     * ����badPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadPassword(String value) {
        this.badPassword = value;
    }

    /**
     * ��ȡveritySuccess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeritySuccess() {
        return veritySuccess;
    }

    /**
     * ����veritySuccess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeritySuccess(String value) {
        this.veritySuccess = value;
    }

}
