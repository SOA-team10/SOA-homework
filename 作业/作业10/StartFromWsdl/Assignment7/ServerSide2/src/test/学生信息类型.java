
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ����Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="courseList" type="{http://jw.nju.edu.cn/schema}�γ��б�����"/>
 *       &lt;/all>
 *       &lt;attribute name="studentId" use="required" type="{http://jw.nju.edu.cn/schema}ѧ������" />
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
public class ѧ����Ϣ���� {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected �γ��б����� courseList;
    @XmlAttribute(name = "studentId", required = true)
    protected String studentId;

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
     * ��ȡcourseList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ��б����� }
     *     
     */
    public �γ��б����� getCourseList() {
        return courseList;
    }

    /**
     * ����courseList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ��б����� }
     *     
     */
    public void setCourseList(�γ��б����� value) {
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
