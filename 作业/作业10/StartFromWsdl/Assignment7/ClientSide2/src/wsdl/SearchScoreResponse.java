
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>searchScoreResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="searchScoreResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://wsdl/}单个学生成绩列表类型" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchScoreResponse", propOrder = {
    "_return"
})
public class SearchScoreResponse {

    @XmlElement(name = "return")
    protected 单个学生成绩列表类型 _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 单个学生成绩列表类型 }
     *     
     */
    public 单个学生成绩列表类型 getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 单个学生成绩列表类型 }
     *     
     */
    public void setReturn(单个学生成绩列表类型 value) {
        this._return = value;
    }

}
