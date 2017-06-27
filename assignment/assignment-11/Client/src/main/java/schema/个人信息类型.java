
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="������Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="���ڲ���" type="{http://www.nju.edu.cn/schema}��������"/>
 *         &lt;element name="��ͥסַ" type="{http://www.nju.edu.cn/schema}��ַ����"/>
 *         &lt;element name="���˼��" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {

})
public class ������Ϣ���� {

    @XmlElement(required = true)
    protected String ��������;
    @XmlElement(required = true)
    protected �������� ���ڲ���;
    @XmlElement(required = true)
    protected ��ַ���� ��ͥסַ;
    @XmlElement(required = true)
    protected String ���˼��;

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
     * ���ø����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��������(String value) {
        this.�������� = value;
    }

    /**
     * ��ȡ���ڲ������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �������� }
     *     
     */
    public �������� get���ڲ���() {
        return ���ڲ���;
    }

    /**
     * �������ڲ������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void set���ڲ���(�������� value) {
        this.���ڲ��� = value;
    }

    /**
     * ��ȡ��ͥסַ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��ַ���� }
     *     
     */
    public ��ַ���� get��ͥסַ() {
        return ��ͥסַ;
    }

    /**
     * ���ü�ͥסַ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��ַ���� }
     *     
     */
    public void set��ͥסַ(��ַ���� value) {
        this.��ͥסַ = value;
    }

    /**
     * ��ȡ���˼�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���˼��() {
        return ���˼��;
    }

    /**
     * ���ø��˼�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���˼��(String value) {
        this.���˼�� = value;
    }

}
