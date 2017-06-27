
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="部门性质" type="{http://www.nju.edu.cn/schema}部门性质类型"/>
 *         &lt;element name="部门介绍" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="部门地址" type="{http://www.nju.edu.cn/schema}地址类型"/>
 *       &lt;/all>
 *       &lt;attribute name="部门编号" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="部门名称" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {

})
public class 部门类型 {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 部门性质类型 部门性质;
    @XmlElement(required = true)
    protected String 部门介绍;
    @XmlElement(required = true)
    protected 地址类型 部门地址;
    @XmlAttribute
    protected String 部门编号;
    @XmlAttribute
    protected String 部门名称;

    /**
     * 获取部门性质属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门性质类型 }
     *     
     */
    public 部门性质类型 get部门性质() {
        return 部门性质;
    }

    /**
     * 设置部门性质属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门性质类型 }
     *     
     */
    public void set部门性质(部门性质类型 value) {
        this.部门性质 = value;
    }

    /**
     * 获取部门介绍属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门介绍() {
        return 部门介绍;
    }

    /**
     * 设置部门介绍属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门介绍(String value) {
        this.部门介绍 = value;
    }

    /**
     * 获取部门地址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 地址类型 }
     *     
     */
    public 地址类型 get部门地址() {
        return 部门地址;
    }

    /**
     * 设置部门地址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 地址类型 }
     *     
     */
    public void set部门地址(地址类型 value) {
        this.部门地址 = value;
    }

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门编号() {
        return 部门编号;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门编号(String value) {
        this.部门编号 = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门名称() {
        return 部门名称;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门名称(String value) {
        this.部门名称 = value;
    }

}
