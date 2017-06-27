
package schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CourseScoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourseScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="score" type="{http://jw.nju.edu.cn/schema}BJScoreType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="courseId" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="scoreType" type="{http://jw.nju.edu.cn/schema}BJScoreCategoryType" />
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
public class CourseScoreType {

    protected List<BJScoreType> score;
    @XmlAttribute(name = "courseId")
    protected String courseId;
    @XmlAttribute(name = "scoreType")
    protected BJScoreCategoryType scoreType;

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
     * For main, to add a new item, do as follows:
     * <pre>
     *    getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BJScoreType }
     * 
     * 
     */
    public List<BJScoreType> getScore() {
        if (score == null) {
            score = new ArrayList<BJScoreType>();
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
     *     {@link BJScoreCategoryType }
     *     
     */
    public BJScoreCategoryType getScoreType() {
        return scoreType;
    }

    /**
     * 设置scoreType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BJScoreCategoryType }
     *     
     */
    public void setScoreType(BJScoreCategoryType value) {
        this.scoreType = value;
    }

}
