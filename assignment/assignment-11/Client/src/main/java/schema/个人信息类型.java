
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>个人信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="个人姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="所在部门" type="{http://www.nju.edu.cn/schema}部门类型"/>
 *         &lt;element name="家庭住址" type="{http://www.nju.edu.cn/schema}地址类型"/>
 *         &lt;element name="个人简介" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {

})
public class 个人信息类型 {

    @XmlElement(required = true)
    protected String 个人姓名;
    @XmlElement(required = true)
    protected 部门类型 所在部门;
    @XmlElement(required = true)
    protected 地址类型 家庭住址;
    @XmlElement(required = true)
    protected String 个人简介;

    /**
     * 获取个人姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get个人姓名() {
        return 个人姓名;
    }

    /**
     * 设置个人姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set个人姓名(String value) {
        this.个人姓名 = value;
    }

    /**
     * 获取所在部门属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门类型 }
     *     
     */
    public 部门类型 get所在部门() {
        return 所在部门;
    }

    /**
     * 设置所在部门属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门类型 }
     *     
     */
    public void set所在部门(部门类型 value) {
        this.所在部门 = value;
    }

    /**
     * 获取家庭住址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 地址类型 }
     *     
     */
    public 地址类型 get家庭住址() {
        return 家庭住址;
    }

    /**
     * 设置家庭住址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 地址类型 }
     *     
     */
    public void set家庭住址(地址类型 value) {
        this.家庭住址 = value;
    }

    /**
     * 获取个人简介属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get个人简介() {
        return 个人简介;
    }

    /**
     * 设置个人简介属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set个人简介(String value) {
        this.个人简介 = value;
    }

}
