
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="courseList" type="{http://jw.nju.edu.cn/schema}课程列表类型"/>
 *       &lt;/all>
 *       &lt;attribute name="studentId" use="required" type="{http://jw.nju.edu.cn/schema}学号类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {

})
public class 学生信息类型 {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected 课程列表类型 courseList;
    @XmlAttribute(name = "studentId", required = true)
    protected String studentId;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取courseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程列表类型 }
     *     
     */
    public 课程列表类型 getCourseList() {
        return courseList;
    }

    /**
     * 设置courseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程列表类型 }
     *     
     */
    public void setCourseList(课程列表类型 value) {
        this.courseList = value;
    }

    /**
     * 获取studentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置studentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentId(String value) {
        this.studentId = value;
    }

}
