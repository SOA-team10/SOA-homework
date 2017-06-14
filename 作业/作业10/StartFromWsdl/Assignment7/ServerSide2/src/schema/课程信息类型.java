
package schema;

import javax.xml.bind.annotation.*;


/**
 * <p>课程信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreList" type="{http://jw.nju.edu.cn/schema}课程成绩信息类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="courseId" use="required" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="courseName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "scoreList"
})
public class 课程信息类型 {

    @XmlElement(required = true)
    protected 课程成绩信息类型 scoreList;
    @XmlAttribute(name = "courseId", required = true)
    protected String courseId;
    @XmlAttribute(name = "courseName", required = true)
    protected String courseName;

    /**
     * 获取scoreList属性的值。
     *
     * @return
     *     possible object is
     *     {@link 课程成绩信息类型 }
     *
     */
    public 课程成绩信息类型 getScoreList() {
        return scoreList;
    }

    /**
     * 设置scoreList属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link 课程成绩信息类型 }
     *
     */
    public void setScoreList(课程成绩信息类型 value) {
        this.scoreList = value;
    }

    /**
     * 获取courseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * 设置courseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
    }

    /**
     * 获取courseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 设置courseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

}
