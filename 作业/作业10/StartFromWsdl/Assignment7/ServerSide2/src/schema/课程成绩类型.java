
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>课程成绩类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程成绩类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="score" type="{http://jw.nju.edu.cn/schema}成绩类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="courseId" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="scoreType" type="{http://jw.nju.edu.cn/schema}成绩性质类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "score"
})
public class 课程成绩类型 {

    protected List<成绩类型> score;
    @XmlAttribute(name = "courseId")
    protected String courseId;
    @XmlAttribute(name = "scoreType")
    protected 成绩性质类型 scoreType;

    /**
     * Gets the value of the score property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScore().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 成绩类型 }
     *
     *
     */
    public List<成绩类型> getScore() {
        if (score == null) {
            score = new ArrayList<成绩类型>();
        }
        return this.score;
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
     * 获取scoreType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 成绩性质类型 }
     *     
     */
    public 成绩性质类型 getScoreType() {
        return scoreType;
    }

    /**
     * 设置scoreType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 成绩性质类型 }
     *     
     */
    public void setScoreType(成绩性质类型 value) {
        this.scoreType = value;
    }

}
