
package services.info;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotFoundReasonType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="NotFoundReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ѧ�Ų�����"/>
 *     &lt;enumeration value="δ�ҵ�����ѧ�ŵĳɼ�"/>
 *     &lt;enumeration value="�γ̲�����"/>
 *     &lt;enumeration value="δ�ҵ�����γ̵ĳɼ�"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotFoundReasonType")
@XmlEnum
public enum NotFoundReasonType {

    ѧ�Ų�����,
    δ�ҵ�����ѧ�ŵĳɼ�,
    �γ̲�����,
    δ�ҵ�����γ̵ĳɼ�;

    public String value() {
        return name();
    }

    public static NotFoundReasonType fromValue(String v) {
        return valueOf(v);
    }

}
