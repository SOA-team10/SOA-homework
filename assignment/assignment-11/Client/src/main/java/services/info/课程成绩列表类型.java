
package services.info;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ̳ɼ��б����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ̳ɼ��б�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="�γ̳ɼ�" type="{http://jw.nju.edu.cn/schema}�γ̳ɼ�����" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868\u7c7b\u578b")
public class �γ̳ɼ��б����� {

    protected List<�γ̳ɼ�����> �γ̳ɼ�;

    /**
     * Gets the value of the �γ̳ɼ� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the �γ̳ɼ� property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get�γ̳ɼ�().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link �γ̳ɼ����� }
     * 
     * 
     */
    public List<�γ̳ɼ�����> get�γ̳ɼ�() {
        if (�γ̳ɼ� == null) {
            �γ̳ɼ� = new ArrayList<�γ̳ɼ�����>();
        }
        return this.�γ̳ɼ�;
    }

}
