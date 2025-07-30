/**
 * Anotacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.seatecnologia.sei.integration.api.service.ws;

public class Anotacao  implements java.io.Serializable {
    private java.lang.String protocoloProcedimento;

    private java.lang.String descricao;

    private java.lang.String sinPrioridade;

    public Anotacao() {
    }

    public Anotacao(
           java.lang.String protocoloProcedimento,
           java.lang.String descricao,
           java.lang.String sinPrioridade) {
           this.protocoloProcedimento = protocoloProcedimento;
           this.descricao = descricao;
           this.sinPrioridade = sinPrioridade;
    }


    /**
     * Gets the protocoloProcedimento value for this Anotacao.
     * 
     * @return protocoloProcedimento
     */
    public java.lang.String getProtocoloProcedimento() {
        return protocoloProcedimento;
    }


    /**
     * Sets the protocoloProcedimento value for this Anotacao.
     * 
     * @param protocoloProcedimento
     */
    public void setProtocoloProcedimento(java.lang.String protocoloProcedimento) {
        this.protocoloProcedimento = protocoloProcedimento;
    }


    /**
     * Gets the descricao value for this Anotacao.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Anotacao.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the sinPrioridade value for this Anotacao.
     * 
     * @return sinPrioridade
     */
    public java.lang.String getSinPrioridade() {
        return sinPrioridade;
    }


    /**
     * Sets the sinPrioridade value for this Anotacao.
     * 
     * @param sinPrioridade
     */
    public void setSinPrioridade(java.lang.String sinPrioridade) {
        this.sinPrioridade = sinPrioridade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Anotacao)) return false;
        Anotacao other = (Anotacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocoloProcedimento==null && other.getProtocoloProcedimento()==null) || 
             (this.protocoloProcedimento!=null &&
              this.protocoloProcedimento.equals(other.getProtocoloProcedimento()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.sinPrioridade==null && other.getSinPrioridade()==null) || 
             (this.sinPrioridade!=null &&
              this.sinPrioridade.equals(other.getSinPrioridade())));
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
        if (getProtocoloProcedimento() != null) {
            _hashCode += getProtocoloProcedimento().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getSinPrioridade() != null) {
            _hashCode += getSinPrioridade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Anotacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "Anotacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloProcedimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProtocoloProcedimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sinPrioridade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SinPrioridade"));
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
