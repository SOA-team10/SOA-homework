
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ̳ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ̳ɼ�����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="score" type="{http://jw.nju.edu.cn/schema}�ɼ�����"/>
 *       &lt;/sequence>
 *       &lt;attribute name="courseId" type="{http://jw.nju.edu.cn/schema}�γ̱������" />
 *       &lt;attribute name="scoreType" type="{http://jw.nju.edu.cn/schema}�ɼ���������" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "score"
})
public class �γ̳ɼ����� {

    protected List<�ɼ�����> score;
    @XmlAttribute(name = "courseId")
    protected String courseId;
    @XmlAttribute(name = "scoreType")
    protected �ɼ��������� scoreType;

    /**
     * Gets the value of the score property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link �ɼ����� }
     * 
     * 
     */
    public List<�ɼ�����> getScore() {
        if (score == null) {
            score = new ArrayList<�ɼ�����>();
        }
        return this.score;
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
     * ��ȡscoreType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �ɼ��������� }
     *     
     */
    public �ɼ��������� getScoreType() {
        return scoreType;
    }

    /**
     * ����scoreType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �ɼ��������� }
     *     
     */
    public void setScoreType(�ɼ��������� value) {
        this.scoreType = value;
    }

}
