
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��ַ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��ַ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ʡֱϽ��" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="����" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="�ֵ�" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="��" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5730\u5740\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
public class ��ַ���� {

    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    protected String ʡֱϽ��;
    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    protected String �ֵ�;
    @XmlElement(required = true)
    protected String ��;

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get����() {
        return ����;
    }

    /**
     * ���ù������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

    /**
     * ��ȡʡֱϽ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getʡֱϽ��() {
        return ʡֱϽ��;
    }

    /**
     * ����ʡֱϽ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setʡֱϽ��(String value) {
        this.ʡֱϽ�� = value;
    }

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get����() {
        return ����;
    }

    /**
     * �����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

    /**
     * ��ȡ�ֵ����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ֵ�() {
        return �ֵ�;
    }

    /**
     * ���ýֵ����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ֵ�(String value) {
        this.�ֵ� = value;
    }

    /**
     * ��ȡ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��() {
        return ��;
    }

    /**
     * ���ú����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��(String value) {
        this.�� = value;
    }

}
