
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ������ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ������">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ѧ��" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}������Ϣ"/>
 *         &lt;element name="�γ̳ɼ��б�" type="{http://jw.nju.edu.cn/schema}�γ̳ɼ��б�����"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u4e2a\u4eba\u4fe1\u606f",
    "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868"
})
public class ѧ������ {

    @XmlElement(required = true)
    protected String ѧ��;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected ������Ϣ���� ������Ϣ;
    @XmlElement(required = true)
    protected �γ̳ɼ��б����� �γ̳ɼ��б�;

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
     * ��ȡ������Ϣ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ������Ϣ���� }
     *     
     */
    public ������Ϣ���� get������Ϣ() {
        return ������Ϣ;
    }

    /**
     * ���ø�����Ϣ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ������Ϣ���� }
     *     
     */
    public void set������Ϣ(������Ϣ���� value) {
        this.������Ϣ = value;
    }

    /**
     * ��ȡ�γ̳ɼ��б����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public �γ̳ɼ��б����� get�γ̳ɼ��б�() {
        return �γ̳ɼ��б�;
    }

    /**
     * ���ÿγ̳ɼ��б����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public void set�γ̳ɼ��б�(�γ̳ɼ��б����� value) {
        this.�γ̳ɼ��б� = value;
    }

}
