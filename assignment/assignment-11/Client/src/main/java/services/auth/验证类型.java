/**
 * ��֤����.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public class ��֤����  implements java.io.Serializable {
    private java.lang.String ѧ��;

    private services.auth.Ȩ�޼��� Ȩ��;

    public ��֤����() {
    }

    public ��֤����(
           java.lang.String ѧ��,
           services.auth.Ȩ�޼��� Ȩ��) {
           this.ѧ�� = ѧ��;
           this.Ȩ�� = Ȩ��;
    }


    /**
     * Gets the ѧ�� value for this ��֤����.
     * 
     * @return ѧ��
     */
    public java.lang.String getѧ��() {
        return ѧ��;
    }


    /**
     * Sets the ѧ�� value for this ��֤����.
     * 
     * @param ѧ��
     */
    public void setѧ��(java.lang.String ѧ��) {
        this.ѧ�� = ѧ��;
    }


    /**
     * Gets the Ȩ�� value for this ��֤����.
     * 
     * @return Ȩ��
     */
    public services.auth.Ȩ�޼��� getȨ��() {
        return Ȩ��;
    }


    /**
     * Sets the Ȩ�� value for this ��֤����.
     * 
     * @param Ȩ��
     */
    public void setȨ��(services.auth.Ȩ�޼��� Ȩ��) {
        this.Ȩ�� = Ȩ��;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ��֤����)) return false;
        ��֤���� other = (��֤����) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ѧ��==null && other.getѧ��()==null) || 
             (this.ѧ��!=null &&
              this.ѧ��.equals(other.getѧ��()))) &&
            ((this.Ȩ��==null && other.getȨ��()==null) || 
             (this.Ȩ��!=null &&
              this.Ȩ��.equals(other.getȨ��())));
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
        if (getѧ��() != null) {
            _hashCode += getѧ��().hashCode();
        }
        if (getȨ��() != null) {
            _hashCode += getȨ��().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(��֤����.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "��֤����"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ѧ��");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "ѧ��"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("Ȩ��");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "Ȩ��"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "Ȩ�޼���"));
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
