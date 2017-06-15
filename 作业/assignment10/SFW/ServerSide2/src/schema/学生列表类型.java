
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ѧ���б����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ���б�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="student" type="{http://jw.nju.edu.cn/schema}ѧ����Ϣ����"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u5217\u8868\u7c7b\u578b", propOrder = {
    "student"
})
public class ѧ���б����� {

    protected List<ѧ����Ϣ����> student;

    /**
     * Gets the value of the student property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the student property.
     *
     * <p>
     * For main, to add a new item, do as follows:
     * <pre>
     *    getStudent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ѧ����Ϣ���� }
     *
     *
     */
    public List<ѧ����Ϣ����> getStudent() {
        if (student == null) {
            student = new ArrayList<ѧ����Ϣ����>();
        }
        return this.student;
    }

}
