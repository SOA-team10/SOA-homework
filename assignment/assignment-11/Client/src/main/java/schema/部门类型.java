
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;all>
 *         &lt;element name="��������" type="{http://www.nju.edu.cn/schema}������������"/>
 *         &lt;element name="���Ž���" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="���ŵ�ַ" type="{http://www.nju.edu.cn/schema}��ַ����"/>
 *       &lt;/all>
 *       &lt;attribute name="���ű��" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="��������" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {

})
public class �������� {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ������������ ��������;
    @XmlElement(required = true)
    protected String ���Ž���;
    @XmlElement(required = true)
    protected ��ַ���� ���ŵ�ַ;
    @XmlAttribute
    protected String ���ű��;
    @XmlAttribute
    protected String ��������;

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ������������ }
     *     
     */
    public ������������ get��������() {
        return ��������;
    }

    /**
     * ���ò����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ������������ }
     *     
     */
    public void set��������(������������ value) {
        this.�������� = value;
    }

    /**
     * ��ȡ���Ž������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���Ž���() {
        return ���Ž���;
    }

    /**
     * ���ò��Ž������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���Ž���(String value) {
        this.���Ž��� = value;
    }

    /**
     * ��ȡ���ŵ�ַ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��ַ���� }
     *     
     */
    public ��ַ���� get���ŵ�ַ() {
        return ���ŵ�ַ;
    }

    /**
     * ���ò��ŵ�ַ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��ַ���� }
     *     
     */
    public void set���ŵ�ַ(��ַ���� value) {
        this.���ŵ�ַ = value;
    }

    /**
     * ��ȡ���ű�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���ű��() {
        return ���ű��;
    }

    /**
     * ���ò��ű�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���ű��(String value) {
        this.���ű�� = value;
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��������() {
        return ��������;
    }

    /**
     * ���ò����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��������(String value) {
        this.�������� = value;
    }

}
