
package schema;

import javax.xml.bind.annotation.*;


/**
 * <p>�γ���Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ���Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreList" type="{http://jw.nju.edu.cn/schema}�γ̳ɼ���Ϣ����"/>
 *       &lt;/sequence>
 *       &lt;attribute name="courseId" use="required" type="{http://jw.nju.edu.cn/schema}�γ̱������" />
 *       &lt;attribute name="courseName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "scoreList"
})
public class �γ���Ϣ���� {

    @XmlElement(required = true)
    protected �γ̳ɼ���Ϣ���� scoreList;
    @XmlAttribute(name = "courseId", required = true)
    protected String courseId;
    @XmlAttribute(name = "courseName", required = true)
    protected String courseName;

    /**
     * ��ȡscoreList���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link �γ̳ɼ���Ϣ���� }
     *
     */
    public �γ̳ɼ���Ϣ���� getScoreList() {
        return scoreList;
    }

    /**
     * ����scoreList���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link �γ̳ɼ���Ϣ���� }
     *
     */
    public void setScoreList(�γ̳ɼ���Ϣ���� value) {
        this.scoreList = value;
    }

    /**
     * ��ȡcourseId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * ����courseId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
    }

    /**
     * ��ȡcourseName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * ����courseName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

}
