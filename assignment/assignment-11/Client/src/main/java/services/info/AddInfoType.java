
package services.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addInfoType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="addInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentType" type="{http://jw.nju.edu.cn/schema}ѧ������"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addInfoType", propOrder = {
    "studentType"
})
public class AddInfoType {

    @XmlElement(required = true)
    protected ѧ������ studentType;

    /**
     * ��ȡstudentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ѧ������ }
     *     
     */
    public ѧ������ getStudentType() {
        return studentType;
    }

    /**
     * ����studentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ѧ������ }
     *     
     */
    public void setStudentType(ѧ������ value) {
        this.studentType = value;
    }

}
