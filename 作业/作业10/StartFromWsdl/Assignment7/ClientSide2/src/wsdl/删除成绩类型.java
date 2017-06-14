
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>删除成绩类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="删除成绩类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="学号" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="课程编号" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="成绩性质类型" type="{http://wsdl/}成绩性质类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5220\u9664\u6210\u7ee9\u7c7b\u578b")
public class 删除成绩类型 {

    @XmlAttribute
    protected String 学号;
    @XmlAttribute
    protected String 课程编号;
    @XmlAttribute
    protected wsdl.成绩性质类型 成绩性质类型;

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
     * 获取成绩性质类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link wsdl.成绩性质类型 }
     *     
     */
    public wsdl.成绩性质类型 get成绩性质类型() {
        return 成绩性质类型;
    }

    /**
     * 设置成绩性质类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link wsdl.成绩性质类型 }
     *     
     */
    public void set成绩性质类型(wsdl.成绩性质类型 value) {
        this.成绩性质类型 = value;
    }

}
