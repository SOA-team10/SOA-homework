
package schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>�ɼ��������͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="BJScoreCategoryType">
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
@XmlType(name = "\u6210\u7ee9\u6027\u8d28\u7c7b\u578b")
@XmlEnum
public enum BJScoreCategoryType implements Serializable{

    ƽʱ�ɼ�,
    ��ҵ�ɼ�,
    ���гɼ�,
    ��ĩ�ɼ�,
    �����ɼ�;

    public String value() {
        return name();
    }

    public static BJScoreCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
