
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>��ӻ��޸ĳɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��ӻ��޸ĳɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ѧ��" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="����" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="�γ̱��" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="�ɼ���������" type="{http://wsdl/}�ɼ���������" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6dfb\u52a0\u6216\u4fee\u6539\u6210\u7ee9\u7c7b\u578b")
public class ��ӻ��޸ĳɼ����� implements Serializable{

    @XmlAttribute
    protected String ѧ��;
    @XmlAttribute
    protected Integer ����;
    @XmlAttribute
    protected String �γ̱��;
    @XmlAttribute
    protected wsdl.�ɼ��������� �ɼ���������;

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setѧ��(String value) {
        this.ѧ�� = value;
    }

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get����() {
        return ����;
    }

    /**
     * ���÷������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set����(Integer value) {
        this.���� = value;
    }

    /**
     * ��ȡ�γ̱�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ̱��() {
        return �γ̱��;
    }

    /**
     * ���ÿγ̱�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ̱��(String value) {
        this.�γ̱�� = value;
    }

    /**
     * ��ȡ�ɼ������������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link wsdl.�ɼ��������� }
     *     
     */
    public wsdl.�ɼ��������� get�ɼ���������() {
        return �ɼ���������;
    }

    /**
     * ���óɼ������������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link wsdl.�ɼ��������� }
     *     
     */
    public void set�ɼ���������(wsdl.�ɼ��������� value) {
        this.�ɼ��������� = value;
    }

}
