
package schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ScoreCategory�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ScoreCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ƽʱ�ɼ�"/>
 *     &lt;enumeration value="��ҵ�ɼ�"/>
 *     &lt;enumeration value="���гɼ�"/>
 *     &lt;enumeration value="��ĩ�ɼ�"/>
 *     &lt;enumeration value="�����ɼ�"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5f97\u5206\u6027\u8d28")
@XmlEnum
public enum ScoreCategory {

    ƽʱ�ɼ�,
    ��ҵ�ɼ�,
    ���гɼ�,
    ��ĩ�ɼ�,
    �����ɼ�;

    public String value() {
        return name();
    }

    public static ScoreCategory fromValue(String v) {
        return valueOf(v);
    }

}
