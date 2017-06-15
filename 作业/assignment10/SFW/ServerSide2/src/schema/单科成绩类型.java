
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>单科成绩类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单科成绩类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型" />
 *       &lt;attribute name="得分性质" type="{http://jw.nju.edu.cn/schema}成绩性质类型" />
 *       &lt;attribute name="分数" type="{http://jw.nju.edu.cn/schema}分数类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u79d1\u6210\u7ee9\u7c7b\u578b")
public class 单科成绩类型 implements Serializable{
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    protected String 课程编号;
    @XmlAttribute
    protected 成绩性质类型 得分性质;
    @XmlAttribute
    protected Integer 分数;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取得分性质属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 成绩性质类型 }
     *     
     */
    public 成绩性质类型 get得分性质() {
        return 得分性质;
    }

    /**
     * 设置得分性质属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 成绩性质类型 }
     *     
     */
    public void set得分性质(成绩性质类型 value) {
        this.得分性质 = value;
    }

    /**
     * 获取分数属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get分数() {
        return 分数;
    }

    /**
     * 设置分数属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set分数(Integer value) {
        this.分数 = value;
    }

}
