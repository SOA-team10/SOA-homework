
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>学生列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="student" type="{http://jw.nju.edu.cn/schema}学生信息类型"/>
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
public class 学生列表类型 {

    protected List<学生信息类型> student;

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
     * {@link 学生信息类型 }
     *
     *
     */
    public List<学生信息类型> getStudent() {
        if (student == null) {
            student = new ArrayList<学生信息类型>();
        }
        return this.student;
    }

}
