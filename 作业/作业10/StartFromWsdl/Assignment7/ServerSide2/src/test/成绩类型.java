
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�ɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentId" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *         &lt;element name="studentScore" type="{http://jw.nju.edu.cn/schema}�÷�����"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "studentId",
    "studentScore"
})
public class �ɼ����� {

    @XmlElement(required = true)
    protected String studentId;
    protected int studentScore;

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
     * ��ȡstudentScore���Ե�ֵ��
     * 
     */
    public int getStudentScore() {
        return studentScore;
    }

    /**
     * ����studentScore���Ե�ֵ��
     * 
     */
    public void setStudentScore(int value) {
        this.studentScore = value;
    }

}
