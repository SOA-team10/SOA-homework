
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>地址类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="地址类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="国家" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="省直辖市" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="区县" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="街道" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5730\u5740\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema")
public class 地址类型 {

    @XmlElement(required = true)
    protected String 国家;
    @XmlElement(required = true)
    protected String 省直辖市;
    @XmlElement(required = true)
    protected String 区县;
    @XmlElement(required = true)
    protected String 街道;
    @XmlElement(required = true)
    protected String 号;

    /**
     * 获取国家属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get国家() {
        return 国家;
    }

    /**
     * 设置国家属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set国家(String value) {
        this.国家 = value;
    }

    /**
     * 获取省直辖市属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get省直辖市() {
        return 省直辖市;
    }

    /**
     * 设置省直辖市属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set省直辖市(String value) {
        this.省直辖市 = value;
    }

    /**
     * 获取区县属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get区县() {
        return 区县;
    }

    /**
     * 设置区县属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set区县(String value) {
        this.区县 = value;
    }

    /**
     * 获取街道属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get街道() {
        return 街道;
    }

    /**
     * 设置街道属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set街道(String value) {
        this.街道 = value;
    }

    /**
     * 获取号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get号() {
        return 号;
    }

    /**
     * 设置号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set号(String value) {
        this.号 = value;
    }

}
