
package schema;

import javax.xml.bind.annotation.*;


/**
 * <p>DepartmentInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
 *       &lt;attribute name="depId" type="{http://jw.nju.edu.cn/schema}���ű������" />
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
     * ��ȡdepName���Ե�ֵ��
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
     * ����depName���Ե�ֵ��
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
     * ��ȡdepType���Ե�ֵ��
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
     * ����depType���Ե�ֵ��
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
     * ��ȡdepAddress���Ե�ֵ��
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
     * ����depAddress���Ե�ֵ��
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
     * ��ȡdepId���Ե�ֵ��
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
     * ����depId���Ե�ֵ��
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
