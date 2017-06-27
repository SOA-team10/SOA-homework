/**
 * 验证类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public class 验证类型  implements java.io.Serializable {
    private java.lang.String 学号;

    private services.auth.权限级别 权限;

    public 验证类型() {
    }

    public 验证类型(
           java.lang.String 学号,
           services.auth.权限级别 权限) {
           this.学号 = 学号;
           this.权限 = 权限;
    }


    /**
     * Gets the 学号 value for this 验证类型.
     * 
     * @return 学号
     */
    public java.lang.String get学号() {
        return 学号;
    }


    /**
     * Sets the 学号 value for this 验证类型.
     * 
     * @param 学号
     */
    public void set学号(java.lang.String 学号) {
        this.学号 = 学号;
    }


    /**
     * Gets the 权限 value for this 验证类型.
     * 
     * @return 权限
     */
    public services.auth.权限级别 get权限() {
        return 权限;
    }


    /**
     * Sets the 权限 value for this 验证类型.
     * 
     * @param 权限
     */
    public void set权限(services.auth.权限级别 权限) {
        this.权限 = 权限;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 验证类型)) return false;
        验证类型 other = (验证类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.学号==null && other.get学号()==null) || 
             (this.学号!=null &&
              this.学号.equals(other.get学号()))) &&
            ((this.权限==null && other.get权限()==null) || 
             (this.权限!=null &&
              this.权限.equals(other.get权限())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get学号() != null) {
            _hashCode += get学号().hashCode();
        }
        if (get权限() != null) {
            _hashCode += get权限().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(验证类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "验证类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("学号");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("权限");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "权限"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "权限级别"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
