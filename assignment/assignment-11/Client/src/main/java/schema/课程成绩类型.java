
package schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ̳ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ̳ɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="�ɼ�" type="{http://jw.nju.edu.cn/schema}�ɼ�����" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="�γ̱��" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="�ɼ�����" type="{http://jw.nju.edu.cn/schema}�ɼ���������" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "\u6210\u7ee9"
})
public class �γ̳ɼ����� {

    protected List<�ɼ�����> �ɼ�;
    @XmlAttribute
    protected String �γ̱��;
    @XmlAttribute
    protected �ɼ��������� �ɼ�����;

    /**
     * Gets the value of the �ɼ� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the �ɼ� property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get�ɼ�().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link �ɼ����� }
     * 
     * 
     */
    public List<�ɼ�����> get�ɼ�() {
        if (�ɼ� == null) {
            �ɼ� = new ArrayList<�ɼ�����>();
        }
        return this.�ɼ�;
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
     * ��ȡ�ɼ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �ɼ��������� }
     *     
     */
    public �ɼ��������� get�ɼ�����() {
        return �ɼ�����;
    }

    /**
     * ���óɼ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �ɼ��������� }
     *     
     */
    public void set�ɼ�����(�ɼ��������� value) {
        this.�ɼ����� = value;
    }

}
