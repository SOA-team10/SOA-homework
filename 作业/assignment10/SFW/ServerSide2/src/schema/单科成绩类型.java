
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>���Ƴɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="���Ƴɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������" />
 *       &lt;attribute name="�÷�����" type="{http://jw.nju.edu.cn/schema}�ɼ���������" />
 *       &lt;attribute name="����" type="{http://jw.nju.edu.cn/schema}��������" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u79d1\u6210\u7ee9\u7c7b\u578b")
public class ���Ƴɼ����� implements Serializable{
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    protected String �γ̱��;
    @XmlAttribute
    protected �ɼ��������� �÷�����;
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
     *     {@link �ɼ��������� }
     *     
     */
    public �ɼ��������� get�÷�����() {
        return �÷�����;
    }

    /**
     * ���õ÷��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �ɼ��������� }
     *     
     */
    public void set�÷�����(�ɼ��������� value) {
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
