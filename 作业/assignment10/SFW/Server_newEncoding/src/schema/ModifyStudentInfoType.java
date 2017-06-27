
package schema;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ModifyStudentInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ModifyStudentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentId" type="{http://jw.nju.edu.cn/schema}StudentIdType"/>
 *         &lt;element name="idCard" type="{http://jw.nju.edu.cn/schema}身份证号类型" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://jw.nju.edu.cn/schema}GenderType" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://jw.nju.edu.cn/schema}手机号类型" minOccurs="0"/>
 *         &lt;element name="department" type="{http://jw.nju.edu.cn/schema}DepartmentInfoType" minOccurs="0"/>
 *         &lt;element name="checkInYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="course" type="{http://jw.nju.edu.cn/schema}CourseInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4fee\u6539\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "studentId",
    "idCard",
    "name",
    "birthday",
    "_native",
    "sex",
    "phone",
    "department",
    "checkInYear",
    "course"
})
public class ModifyStudentInfoType {

    @XmlElement(required = true)
    protected String studentId;
    protected String idCard;
    protected String name;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "native")
    protected String _native;
    protected GenderType sex;
    protected String phone;
    protected DepartmentInfoType department;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar checkInYear;
    protected List<CourseInfoType> course;

    /**
     * 获取studentId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置studentId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStudentId(String value) {
        this.studentId = value;
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
     * 获取sex属性的值。
     *
     * @return
     *     possible object is
     *     {@link test.GenderType }
     *
     */
    public GenderType getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link test.GenderType }
     *
     */
    public void setSex(GenderType value) {
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
     * 获取department属性的值。
     *
     * @return
     *     possible object is
     *     {@link DepartmentInfoType }
     *
     */
    public DepartmentInfoType getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DepartmentInfoType }
     *
     */
    public void setDepartment(DepartmentInfoType value) {
        this.department = value;
    }

    /**
     * 获取checkInYear属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCheckInYear() {
        return checkInYear;
    }

    /**
     * 设置checkInYear属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCheckInYear(XMLGregorianCalendar value) {
        this.checkInYear = value;
    }

    /**
     * Gets the value of the course property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseInfoType }
     *
     *
     */
    public List<CourseInfoType> getCourse() {
        if (course == null) {
            course = new ArrayList<CourseInfoType>();
        }
        return this.course;
    }

}
