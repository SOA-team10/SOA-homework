
package schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>����ѧ���ɼ��б����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="����ѧ���ɼ��б�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="����ɼ�" type="{http://jw.nju.edu.cn/schema}���Ƴɼ�����" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u4e2a\u5b66\u751f\u6210\u7ee9\u5217\u8868\u7c7b\u578b", propOrder = {

})
public class ����ѧ���ɼ��б����� implements Serializable{
    private static final long serialVersionUID = 1L;
    protected List<���Ƴɼ�����> ����ɼ�;
    @XmlAttribute
    protected String ѧ��;

    /**
     * Gets the value of the ����ɼ� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ����ɼ� property.
     * 
     * <p>
     * For main, to add a new item, do as follows:
     * <pre>
     *    get����ɼ�().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ���Ƴɼ����� }
     * 
     * 
     */
    public List<���Ƴɼ�����> get����ɼ�() {
        if (����ɼ� == null) {
            ����ɼ� = new ArrayList<���Ƴɼ�����>();
        }
        return this.����ɼ�;
    }

    public void set����ɼ�(List<���Ƴɼ�����> list){
        this.����ɼ�=list;
    }

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

}
