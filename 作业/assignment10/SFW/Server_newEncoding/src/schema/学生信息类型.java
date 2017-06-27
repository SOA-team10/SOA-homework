
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>StudentInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StudentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="checkInYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element ref="{http://jw.nju.edu.cn/schema}personInfo"/>
 *         &lt;element name="courseList" type="{http://jw.nju.edu.cn/schema}CourseListType"/>
 *       &lt;/all>
 *       &lt;attribute name="studentId" use="required" type="{http://jw.nju.edu.cn/schema}StudentIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {

})
public class StudentInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar checkInYear;
    @XmlElement(required = true)
    protected PersonalBasicInfoType personInfo;
    @XmlElement(required = true)
    protected CourseListType courseList;
    @XmlAttribute(name = "studentId", required = true)
    protected String studentId;

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
     * ��ȡpersonInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PersonalBasicInfoType }
     *     
     */
    public PersonalBasicInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * ����personInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalBasicInfoType }
     *     
     */
    public void setPersonInfo(PersonalBasicInfoType value) {
        this.personInfo = value;
    }

    /**
     * ��ȡcourseList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CourseListType }
     *     
     */
    public CourseListType getCourseList() {
        return courseList;
    }

    /**
     * ����courseList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CourseListType }
     *     
     */
    public void setCourseList(CourseListType value) {
        this.courseList = value;
    }

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

}
