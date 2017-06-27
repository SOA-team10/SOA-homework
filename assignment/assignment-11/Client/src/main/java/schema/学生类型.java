
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}个人信息"/>
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}课程成绩列表类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u4e2a\u4eba\u4fe1\u606f",
    "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868"
})
public class 学生类型 {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected 个人信息类型 个人信息;
    @XmlElement(required = true)
    protected 课程成绩列表类型 课程成绩列表;

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
     * 获取个人信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 个人信息类型 }
     *     
     */
    public 个人信息类型 get个人信息() {
        return 个人信息;
    }

    /**
     * 设置个人信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 个人信息类型 }
     *     
     */
    public void set个人信息(个人信息类型 value) {
        this.个人信息 = value;
    }

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public 课程成绩列表类型 get课程成绩列表() {
        return 课程成绩列表;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public void set课程成绩列表(课程成绩列表类型 value) {
        this.课程成绩列表 = value;
    }

}
