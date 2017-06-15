
package schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>单个学生成绩列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单个学生成绩列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="单项成绩" type="{http://jw.nju.edu.cn/schema}单科成绩类型" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="学号" type="{http://jw.nju.edu.cn/schema}学号类型" />
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
public class 单个学生成绩列表类型 implements Serializable{
    private static final long serialVersionUID = 1L;
    protected List<单科成绩类型> 单项成绩;
    @XmlAttribute
    protected String 学号;

    /**
     * Gets the value of the 单项成绩 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 单项成绩 property.
     * 
     * <p>
     * For main, to add a new item, do as follows:
     * <pre>
     *    get单项成绩().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 单科成绩类型 }
     * 
     * 
     */
    public List<单科成绩类型> get单项成绩() {
        if (单项成绩 == null) {
            单项成绩 = new ArrayList<单科成绩类型>();
        }
        return this.单项成绩;
    }

    public void set单项成绩(List<单科成绩类型> list){
        this.单项成绩=list;
    }

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

}
