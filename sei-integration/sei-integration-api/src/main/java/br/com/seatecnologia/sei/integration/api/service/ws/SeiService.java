/**
 * SeiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.seatecnologia.sei.integration.api.service.ws;

public interface SeiService extends javax.xml.rpc.Service {
    public java.lang.String getSeiPortServiceAddress();

    public br.com.seatecnologia.sei.integration.api.service.ws.SeiPortType getSeiPortService() throws javax.xml.rpc.ServiceException;

    public br.com.seatecnologia.sei.integration.api.service.ws.SeiPortType getSeiPortService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
