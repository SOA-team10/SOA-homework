/**
 * ’À∫≈»œ÷§¿‡–Õ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public class ’À∫≈»œ÷§¿‡–Õ  implements java.io.Serializable {
    private java.lang.String ” œ‰;

    private java.lang.String √‹¬Î;

    public ’À∫≈»œ÷§¿‡–Õ() {
    }

    public ’À∫≈»œ÷§¿‡–Õ(
           java.lang.String ” œ‰,
           java.lang.String √‹¬Î) {
           this.” œ‰ = ” œ‰;
           this.√‹¬Î = √‹¬Î;
    }


    /**
     * Gets the ” œ‰ value for this ’À∫≈»œ÷§¿‡–Õ.
     * 
     * @return ” œ‰
     */
    public java.lang.String get” œ‰() {
        return ” œ‰;
    }


    /**
     * Sets the ” œ‰ value for this ’À∫≈»œ÷§¿‡–Õ.
     * 
     * @param ” œ‰
     */
    public void set” œ‰(java.lang.String ” œ‰) {
        this.” œ‰ = ” œ‰;
    }


    /**
     * Gets the √‹¬Î value for this ’À∫≈»œ÷§¿‡–Õ.
     * 
     * @return √‹¬Î
     */
    public java.lang.String get√‹¬Î() {
        return √‹¬Î;
    }


    /**
     * Sets the √‹¬Î value for this ’À∫≈»œ÷§¿‡–Õ.
     * 
     * @param √‹¬Î
     */
    public void set√‹¬Î(java.lang.String √‹¬Î) {
        this.√‹¬Î = √‹¬Î;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ’À∫≈»œ÷§¿‡–Õ)) return false;
        ’À∫≈»œ÷§¿‡–Õ other = (’À∫≈»œ÷§¿‡–Õ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.” œ‰==null && other.get” œ‰()==null) || 
             (this.” œ‰!=null &&
              this.” œ‰.equals(other.get” œ‰()))) &&
            ((this.√‹¬Î==null && other.get√‹¬Î()==null) || 
             (this.√‹¬Î!=null &&
              this.√‹¬Î.equals(other.get√‹¬Î())));
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
        if (get” œ‰() != null) {
            _hashCode += get” œ‰().hashCode();
        }
        if (get√‹¬Î() != null) {
            _hashCode += get√‹¬Î().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(’À∫≈»œ÷§¿‡–Õ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "’À∫≈»œ÷§¿‡–Õ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("” œ‰");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "” œ‰"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("√‹¬Î");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "√‹¬Î"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
