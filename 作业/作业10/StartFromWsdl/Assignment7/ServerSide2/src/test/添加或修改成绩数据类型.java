
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��ӻ��޸ĳɼ��������� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��ӻ��޸ĳɼ���������">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������" />
 *       &lt;attribute name="����" type="{http://jw.nju.edu.cn/schema}��������" />
 *       &lt;attribute name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������" />
 *       &lt;attribute name="�÷�����" type="{http://jw.nju.edu.cn/schema}�÷�����" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6dfb\u52a0\u6216\u4fee\u6539\u6210\u7ee9\u6570\u636e\u7c7b\u578b")
public class ��ӻ��޸ĳɼ��������� {

    @XmlAttribute
    protected String ѧ��;
    @XmlAttribute
    protected Integer ����;
    @XmlAttribute
    protected String �γ̱��;
    @XmlAttribute
    protected test.�÷����� �÷�����;

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
     * ��ȡ�÷��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link test.�÷����� }
     *     
     */
    public test.�÷����� get�÷�����() {
        return �÷�����;
    }

    /**
     * ���õ÷��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link test.�÷����� }
     *     
     */
    public void set�÷�����(test.�÷����� value) {
        this.�÷����� = value;
    }

}
