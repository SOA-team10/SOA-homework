/**
 * NotFoundType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.auth;

public class NotFoundType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private services.auth.NotFoundReasonType notFoundReason;

    private java.lang.String notFoundId;

    public NotFoundType() {
    }

    public NotFoundType(
           services.auth.NotFoundReasonType notFoundReason,
           java.lang.String notFoundId) {
        this.notFoundReason = notFoundReason;
        this.notFoundId = notFoundId;
    }


    /**
     * Gets the notFoundReason value for this NotFoundType.
     * 
     * @return notFoundReason
     */
    public services.auth.NotFoundReasonType getNotFoundReason() {
        return notFoundReason;
    }


    /**
     * Sets the notFoundReason value for this NotFoundType.
     * 
     * @param notFoundReason
     */
    public void setNotFoundReason(services.auth.NotFoundReasonType notFoundReason) {
        this.notFoundReason = notFoundReason;
    }


    /**
     * Gets the notFoundId value for this NotFoundType.
     * 
     * @return notFoundId
     */
    public java.lang.String getNotFoundId() {
        return notFoundId;
    }


    /**
     * Sets the notFoundId value for this NotFoundType.
     * 
     * @param notFoundId
     */
    public void setNotFoundId(java.lang.String notFoundId) {
        this.notFoundId = notFoundId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotFoundType)) return false;
        NotFoundType other = (NotFoundType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notFoundReason==null && other.getNotFoundReason()==null) || 
             (this.notFoundReason!=null &&
              this.notFoundReason.equals(other.getNotFoundReason()))) &&
            ((this.notFoundId==null && other.getNotFoundId()==null) || 
             (this.notFoundId!=null &&
              this.notFoundId.equals(other.getNotFoundId())));
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
        if (getNotFoundReason() != null) {
            _hashCode += getNotFoundReason().hashCode();
        }
        if (getNotFoundId() != null) {
            _hashCode += getNotFoundId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotFoundType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "NotFoundType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notFoundReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "NotFoundReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "NotFoundReasonType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notFoundId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "NotFoundId"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
