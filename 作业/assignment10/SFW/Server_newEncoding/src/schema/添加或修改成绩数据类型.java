
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>AddOrModifyScoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddOrModifyScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="学号" type="{http://jw.nju.edu.cn/schema}StudentIdType" />
 *       &lt;attribute name="分数" type="{http://jw.nju.edu.cn/schema}分数类型" />
 *       &lt;attribute name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="ScoreCategory" type="{http://jw.nju.edu.cn/schema}BJScoreCategoryType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6dfb\u52a0\u6216\u4fee\u6539\u6210\u7ee9\u6570\u636e\u7c7b\u578b")
public class AddOrModifyScoreType implements Serializable{
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    protected String 学号;
    @XmlAttribute
    protected Integer 分数;
    @XmlAttribute
    protected String 课程编号;
    @XmlAttribute
//    protected String ScoreCategory;
        protected BJScoreCategoryType ScoreCategory;

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

    /**
     * 获取分数属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get分数() {
        return 分数;
    }

    /**
     * 设置分数属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set分数(Integer value) {
        this.分数 = value;
    }

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取ScoreCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BJScoreCategoryType }
     *     
     */
    public BJScoreCategoryType getScoreCategory() {
        return ScoreCategory;
    }
//    public String getScoreCategory(){
//        return ScoreCategory;
//    }

    /**
     * 设置ScoreCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BJScoreCategoryType }
     *     
     */
    public void setScoreCategory(BJScoreCategoryType value) {
        this.ScoreCategory = value;
    }
//    public void setScoreCategory(String value){
//        this.ScoreCategory=value;
//    }

}
