
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>����ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="����ɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="�γ̱��" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="�÷�����" type="{http://wsdl/}�÷�����" />
 *       &lt;attribute name="����" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u9879\u6210\u7ee9\u7c7b\u578b")
public class ����ɼ����� {

    @XmlAttribute
    protected String �γ̱��;
    @XmlAttribute
    protected wsdl.�÷����� �÷�����;
    @XmlAttribute
    protected Integer ����;

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
     * ��ȡ�÷��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link wsdl.�÷����� }
     *     
     */
    public wsdl.�÷����� get�÷�����() {
        return �÷�����;
    }

    /**
     * ���õ÷��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link wsdl.�÷����� }
     *     
     */
    public void set�÷�����(wsdl.�÷����� value) {
        this.�÷����� = value;
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

}
