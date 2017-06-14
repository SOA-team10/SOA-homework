
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>单科成绩类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单科成绩类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreType" type="{http://jw.nju.edu.cn/schema}得分性质"/>
 *         &lt;element name="scoreValue" type="{http://jw.nju.edu.cn/schema}分数类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u79d1\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "scoreType",
    "scoreValue"
})
public class 单科成绩类型 {

    @XmlElement(required = true)
    protected 得分性质 scoreType;
    protected int scoreValue;

    /**
     * 获取scoreType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 得分性质 }
     *     
     */
    public 得分性质 getScoreType() {
        return scoreType;
    }

    /**
     * 设置scoreType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 得分性质 }
     *     
     */
    public void setScoreType(得分性质 value) {
        this.scoreType = value;
    }

    /**
     * 获取scoreValue属性的值。
     * 
     */
    public int getScoreValue() {
        return scoreValue;
    }

    /**
     * 设置scoreValue属性的值。
     * 
     */
    public void setScoreValue(int value) {
        this.scoreValue = value;
    }

}
