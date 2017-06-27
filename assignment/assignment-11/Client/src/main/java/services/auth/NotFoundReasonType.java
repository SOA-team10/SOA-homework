/**
 * NotFoundReasonType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public class NotFoundReasonType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotFoundReasonType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _学号不存在 = "学号不存在";
    public static final java.lang.String _未找到输入学号的成绩 = "未找到输入学号的成绩";
    public static final java.lang.String _课程不存在 = "课程不存在";
    public static final java.lang.String _未找到输入课程的成绩 = "未找到输入课程的成绩";
    public static final NotFoundReasonType 学号不存在 = new NotFoundReasonType(_学号不存在);
    public static final NotFoundReasonType 未找到输入学号的成绩 = new NotFoundReasonType(_未找到输入学号的成绩);
    public static final NotFoundReasonType 课程不存在 = new NotFoundReasonType(_课程不存在);
    public static final NotFoundReasonType 未找到输入课程的成绩 = new NotFoundReasonType(_未找到输入课程的成绩);
    public java.lang.String getValue() { return _value_;}
    public static NotFoundReasonType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NotFoundReasonType enumeration = (NotFoundReasonType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NotFoundReasonType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotFoundReasonType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "NotFoundReasonType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
