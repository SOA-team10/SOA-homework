
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="������Ϣ����">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="depName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depType" type="{http://jw.nju.edu.cn/schema}��������"/>
 *         &lt;element name="depAddress" type="{http://jw.nju.edu.cn/schema}��ַ����"/>
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
public class ������Ϣ���� {

    @XmlElement(required = true)
    protected String depName;
    @XmlElement(required = true)
    protected �������� depType;
    @XmlElement(required = true)
    protected ��ַ���� depAddress;
    @XmlAttribute(name = "depId")
    protected Integer depId;

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
     *     {@link �������� }
     *     
     */
    public �������� getDepType() {
        return depType;
    }

    /**
     * ����depType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �������� }
     *     
     */
    public void setDepType(�������� value) {
        this.depType = value;
    }

    /**
     * ��ȡdepAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��ַ���� }
     *     
     */
    public ��ַ���� getDepAddress() {
        return depAddress;
    }

    /**
     * ����depAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��ַ���� }
     *     
     */
    public void setDepAddress(��ַ���� value) {
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
    public Integer getDepId() {
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
    public void setDepId(Integer value) {
        this.depId = value;
    }

}
