
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="depName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depType" type="{http://jw.nju.edu.cn/schema}部门类型"/>
 *         &lt;element name="depAddress" type="{http://jw.nju.edu.cn/schema}地址类型"/>
 *       &lt;/all>
 *       &lt;attribute name="depId" type="{http://jw.nju.edu.cn/schema}部门编号类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u4fe1\u606f\u7c7b\u578b", propOrder = {

})
public class 部门信息类型 {

    @XmlElement(required = true)
    protected String depName;
    @XmlElement(required = true)
    protected 部门类型 depType;
    @XmlElement(required = true)
    protected 地址类型 depAddress;
    @XmlAttribute(name = "depId")
    protected Integer depId;

    /**
     * 获取depName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepName() {
        return depName;
    }

    /**
     * 设置depName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepName(String value) {
        this.depName = value;
    }

    /**
     * 获取depType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门类型 }
     *     
     */
    public 部门类型 getDepType() {
        return depType;
    }

    /**
     * 设置depType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门类型 }
     *     
     */
    public void setDepType(部门类型 value) {
        this.depType = value;
    }

    /**
     * 获取depAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 地址类型 }
     *     
     */
    public 地址类型 getDepAddress() {
        return depAddress;
    }

    /**
     * 设置depAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 地址类型 }
     *     
     */
    public void setDepAddress(地址类型 value) {
        this.depAddress = value;
    }

    /**
     * 获取depId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepId() {
        return depId;
    }

    /**
     * 设置depId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepId(Integer value) {
        this.depId = value;
    }

}
