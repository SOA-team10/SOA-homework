
package schema;

import javax.xml.bind.annotation.*;


/**
 * <p>DepartmentInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DepartmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="depName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depType" type="{http://jw.nju.edu.cn/schema}DepartmentType"/>
 *         &lt;element name="depAddress" type="{http://jw.nju.edu.cn/schema}AddressType"/>
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
public class DepartmentInfoType {

    @XmlElement(required = true)
    protected String depName;
    @XmlElement(required = true)
    protected DepartmentType depType;
    @XmlElement(required = true)
    protected AddressType depAddress;
    @XmlAttribute(name = "depId")
    protected String depId;

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
     *     {@link DepartmentType }
     *     
     */
    public DepartmentType getDepType() {
        return depType;
    }

    /**
     * 设置depType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentType }
     *     
     */
    public void setDepType(DepartmentType value) {
        this.depType = value;
    }

    /**
     * 获取depAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDepAddress() {
        return depAddress;
    }

    /**
     * 设置depAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDepAddress(AddressType value) {
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
    public String getDepId() {
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
    public void setDepId(String value) {
        this.depId = value;
    }

}
