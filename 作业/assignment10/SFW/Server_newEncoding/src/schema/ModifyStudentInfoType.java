
package schema;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ModifyStudentInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ModifyStudentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentId" type="{http://jw.nju.edu.cn/schema}StudentIdType"/>
 *         &lt;element name="idCard" type="{http://jw.nju.edu.cn/schema}���֤������" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://jw.nju.edu.cn/schema}GenderType" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://jw.nju.edu.cn/schema}�ֻ�������" minOccurs="0"/>
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
     * ��ȡstudentId���Ե�ֵ��
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
     * ����studentId���Ե�ֵ��
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
     * ��ȡidCard���Ե�ֵ��
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
     * ����idCard���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡbirthday���Ե�ֵ��
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
     * ����birthday���Ե�ֵ��
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
     * ��ȡnative���Ե�ֵ��
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
     * ����native���Ե�ֵ��
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
     * ��ȡsex���Ե�ֵ��
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
     * ����sex���Ե�ֵ��
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
     * ��ȡphone���Ե�ֵ��
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
     * ����phone���Ե�ֵ��
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
     * ��ȡdepartment���Ե�ֵ��
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
     * ����department���Ե�ֵ��
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
     * ��ȡcheckInYear���Ե�ֵ��
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
     * ����checkInYear���Ե�ֵ��
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
