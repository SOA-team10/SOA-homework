
package test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�������͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="��������">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ժϵ��λ"/>
 *     &lt;enumeration value="ֱ������"/>
 *     &lt;enumeration value="��������"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u90e8\u95e8\u7c7b\u578b")
@XmlEnum
public enum �������� {

    Ժϵ��λ,
    ֱ������,
    ��������;

    public String value() {
        return name();
    }

    public static �������� fromValue(String v) {
        return valueOf(v);
    }

}
