
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>个人基本信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人基本信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://jw.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="phone" type="{http://jw.nju.edu.cn/schema}手机号类型"/>
 *         &lt;element name="native" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="department" type="{http://jw.nju.edu.cn/schema}部门信息类型"/>
 *       &lt;/all>
 *       &lt;attribute name="idCard" type="{http://jw.nju.edu.cn/schema}身份证号类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e2a\u4eba\u57fa\u672c\u4fe1\u606f\u7c7b\u578b", propOrder = {

})
public class 个人基本信息类型 {

    @XmlElement(namespace = "", required = true)
    protected String name;
    @XmlElement(namespace = "", required = true)
    protected 性别类型 sex;
    @XmlElement(namespace = "", required = true)
    protected String phone;
    @XmlElement(name = "native", namespace = "", required = true)
    protected String _native;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(namespace = "", required = true)
    protected 部门信息类型 department;
    @XmlAttribute(name = "idCard")
    protected String idCard;

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
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void setSex(性别类型 value) {
        this.sex = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取native属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNative() {
        return _native;
    }

    /**
     * 设置native属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNative(String value) {
        this._native = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门信息类型 }
     *     
     */
    public 部门信息类型 getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门信息类型 }
     *     
     */
    public void setDepartment(部门信息类型 value) {
        this.department = value;
    }

    /**
     * 获取idCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置idCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
    }

}
