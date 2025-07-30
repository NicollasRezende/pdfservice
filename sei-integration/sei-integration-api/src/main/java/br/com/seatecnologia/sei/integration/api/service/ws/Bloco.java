/**
 * Bloco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.seatecnologia.sei.integration.api.service.ws;

public class Bloco  implements java.io.Serializable {
    private java.lang.String idBloco;

    private br.com.seatecnologia.sei.integration.api.service.ws.Unidade unidade;

    private br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuario;

    private java.lang.String descricao;

    private java.lang.String tipo;

    private java.lang.String estado;

    private java.lang.String sinPrioridade;

    private java.lang.String sinRevisao;

    private br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuarioAtribuicao;

    private br.com.seatecnologia.sei.integration.api.service.ws.Unidade[] unidadesDisponibilizacao;

    public Bloco() {
    }

    public Bloco(
           java.lang.String idBloco,
           br.com.seatecnologia.sei.integration.api.service.ws.Unidade unidade,
           br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuario,
           java.lang.String descricao,
           java.lang.String tipo,
           java.lang.String estado,
           java.lang.String sinPrioridade,
           java.lang.String sinRevisao,
           br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuarioAtribuicao,
           br.com.seatecnologia.sei.integration.api.service.ws.Unidade[] unidadesDisponibilizacao) {
           this.idBloco = idBloco;
           this.unidade = unidade;
           this.usuario = usuario;
           this.descricao = descricao;
           this.tipo = tipo;
           this.estado = estado;
           this.sinPrioridade = sinPrioridade;
           this.sinRevisao = sinRevisao;
           this.usuarioAtribuicao = usuarioAtribuicao;
           this.unidadesDisponibilizacao = unidadesDisponibilizacao;
    }


    /**
     * Gets the idBloco value for this Bloco.
     * 
     * @return idBloco
     */
    public java.lang.String getIdBloco() {
        return idBloco;
    }


    /**
     * Sets the idBloco value for this Bloco.
     * 
     * @param idBloco
     */
    public void setIdBloco(java.lang.String idBloco) {
        this.idBloco = idBloco;
    }


    /**
     * Gets the unidade value for this Bloco.
     * 
     * @return unidade
     */
    public br.com.seatecnologia.sei.integration.api.service.ws.Unidade getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this Bloco.
     * 
     * @param unidade
     */
    public void setUnidade(br.com.seatecnologia.sei.integration.api.service.ws.Unidade unidade) {
        this.unidade = unidade;
    }


    /**
     * Gets the usuario value for this Bloco.
     * 
     * @return usuario
     */
    public br.com.seatecnologia.sei.integration.api.service.ws.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Bloco.
     * 
     * @param usuario
     */
    public void setUsuario(br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the descricao value for this Bloco.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Bloco.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tipo value for this Bloco.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Bloco.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the estado value for this Bloco.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Bloco.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the sinPrioridade value for this Bloco.
     * 
     * @return sinPrioridade
     */
    public java.lang.String getSinPrioridade() {
        return sinPrioridade;
    }


    /**
     * Sets the sinPrioridade value for this Bloco.
     * 
     * @param sinPrioridade
     */
    public void setSinPrioridade(java.lang.String sinPrioridade) {
        this.sinPrioridade = sinPrioridade;
    }


    /**
     * Gets the sinRevisao value for this Bloco.
     * 
     * @return sinRevisao
     */
    public java.lang.String getSinRevisao() {
        return sinRevisao;
    }


    /**
     * Sets the sinRevisao value for this Bloco.
     * 
     * @param sinRevisao
     */
    public void setSinRevisao(java.lang.String sinRevisao) {
        this.sinRevisao = sinRevisao;
    }


    /**
     * Gets the usuarioAtribuicao value for this Bloco.
     * 
     * @return usuarioAtribuicao
     */
    public br.com.seatecnologia.sei.integration.api.service.ws.Usuario getUsuarioAtribuicao() {
        return usuarioAtribuicao;
    }


    /**
     * Sets the usuarioAtribuicao value for this Bloco.
     * 
     * @param usuarioAtribuicao
     */
    public void setUsuarioAtribuicao(br.com.seatecnologia.sei.integration.api.service.ws.Usuario usuarioAtribuicao) {
        this.usuarioAtribuicao = usuarioAtribuicao;
    }


    /**
     * Gets the unidadesDisponibilizacao value for this Bloco.
     * 
     * @return unidadesDisponibilizacao
     */
    public br.com.seatecnologia.sei.integration.api.service.ws.Unidade[] getUnidadesDisponibilizacao() {
        return unidadesDisponibilizacao;
    }


    /**
     * Sets the unidadesDisponibilizacao value for this Bloco.
     * 
     * @param unidadesDisponibilizacao
     */
    public void setUnidadesDisponibilizacao(br.com.seatecnologia.sei.integration.api.service.ws.Unidade[] unidadesDisponibilizacao) {
        this.unidadesDisponibilizacao = unidadesDisponibilizacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bloco)) return false;
        Bloco other = (Bloco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idBloco==null && other.getIdBloco()==null) || 
             (this.idBloco!=null &&
              this.idBloco.equals(other.getIdBloco()))) &&
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.sinPrioridade==null && other.getSinPrioridade()==null) || 
             (this.sinPrioridade!=null &&
              this.sinPrioridade.equals(other.getSinPrioridade()))) &&
            ((this.sinRevisao==null && other.getSinRevisao()==null) || 
             (this.sinRevisao!=null &&
              this.sinRevisao.equals(other.getSinRevisao()))) &&
            ((this.usuarioAtribuicao==null && other.getUsuarioAtribuicao()==null) || 
             (this.usuarioAtribuicao!=null &&
              this.usuarioAtribuicao.equals(other.getUsuarioAtribuicao()))) &&
            ((this.unidadesDisponibilizacao==null && other.getUnidadesDisponibilizacao()==null) || 
             (this.unidadesDisponibilizacao!=null &&
              java.util.Arrays.equals(this.unidadesDisponibilizacao, other.getUnidadesDisponibilizacao())));
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
        if (getIdBloco() != null) {
            _hashCode += getIdBloco().hashCode();
        }
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getSinPrioridade() != null) {
            _hashCode += getSinPrioridade().hashCode();
        }
        if (getSinRevisao() != null) {
            _hashCode += getSinRevisao().hashCode();
        }
        if (getUsuarioAtribuicao() != null) {
            _hashCode += getUsuarioAtribuicao().hashCode();
        }
        if (getUnidadesDisponibilizacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnidadesDisponibilizacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnidadesDisponibilizacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bloco.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "Bloco"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBloco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdBloco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Unidade"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Usuario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sinPrioridade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SinPrioridade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sinRevisao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SinRevisao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioAtribuicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UsuarioAtribuicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Usuario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadesDisponibilizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnidadesDisponibilizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Unidade"));
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
