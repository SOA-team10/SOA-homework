
package services.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentType" type="{http://jw.nju.edu.cn/schema}学生类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addInfoType", propOrder = {
    "studentType"
})
public class AddInfoType {

    @XmlElement(required = true)
    protected 学生类型 studentType;

    /**
     * 获取studentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生类型 }
     *     
     */
    public 学生类型 getStudentType() {
        return studentType;
    }

    /**
     * 设置studentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生类型 }
     *     
     */
    public void setStudentType(学生类型 value) {
        this.studentType = value;
    }

}
