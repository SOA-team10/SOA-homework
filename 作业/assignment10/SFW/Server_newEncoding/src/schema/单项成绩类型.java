
package schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>IndividualScoreItemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IndividualScoreItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scoreType" type="{http://jw.nju.edu.cn/schema}ScoreCategory"/>
 *         &lt;element name="scoreValue" type="{http://jw.nju.edu.cn/schema}��������"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u9879\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "scoreType",
    "scoreValue"
})
public class IndividualScoreItemType implements Serializable{
    private static final long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ScoreCategory scoreType;
    protected int scoreValue;

    /**
     * ��ȡscoreType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ScoreCategory }
     *     
     */
    public ScoreCategory getScoreType() {
        return scoreType;
    }

    /**
     * ����scoreType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreCategory }
     *     
     */
    public void setScoreType(ScoreCategory value) {
        this.scoreType = value;
    }

    /**
     * ��ȡscoreValue���Ե�ֵ��
     * 
     */
    public int getScoreValue() {
        return scoreValue;
    }

    /**
     * ����scoreValue���Ե�ֵ��
     * 
     */
    public void setScoreValue(int value) {
        this.scoreValue = value;
    }

}
