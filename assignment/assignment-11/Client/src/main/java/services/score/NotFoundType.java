
package services.score;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotFoundType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NotFoundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotFoundReason" type="{http://jw.nju.edu.cn/schema}NotFoundReasonType"/>
 *         &lt;element name="NotFoundId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotFoundType", propOrder = {
    "notFoundReason",
    "notFoundId"
})
public class NotFoundType {

    @XmlElement(name = "NotFoundReason", required = true)
    @XmlSchemaType(name = "string")
    protected NotFoundReasonType notFoundReason;
    @XmlElement(name = "NotFoundId", required = true)
    protected String notFoundId;

    /**
     * ��ȡnotFoundReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NotFoundReasonType }
     *     
     */
    public NotFoundReasonType getNotFoundReason() {
        return notFoundReason;
    }

    /**
     * ����notFoundReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NotFoundReasonType }
     *     
     */
    public void setNotFoundReason(NotFoundReasonType value) {
        this.notFoundReason = value;
    }

    /**
     * ��ȡnotFoundId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotFoundId() {
        return notFoundId;
    }

    /**
     * ����notFoundId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotFoundId(String value) {
        this.notFoundId = value;
    }

}
