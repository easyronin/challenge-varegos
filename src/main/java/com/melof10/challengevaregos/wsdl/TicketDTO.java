package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para ticketDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ticketDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bancoDestino" type="{http://ws.transferencias.banelco.com/}bancoDTO" minOccurs="0"/&gt;
 *         &lt;element name="concepto" type="{http://ws.transferencias.banelco.com/}conceptoDTO" minOccurs="0"/&gt;
 *         &lt;element name="cuentaDestino" type="{http://ws.transferencias.banelco.com/}cuentaDTO" minOccurs="0"/&gt;
 *         &lt;element name="cuentaOrigen" type="{http://ws.transferencias.banelco.com/}cuentaDTO" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hostOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://ws.transferencias.banelco.com/}monedaDTO" minOccurs="0"/&gt;
 *         &lt;element name="nroControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketDTO", propOrder = {
    "bancoDestino",
    "concepto",
    "cuentaDestino",
    "cuentaOrigen",
    "fecha",
    "hostOnline",
    "importe",
    "moneda",
    "nroControl",
    "nroTransaccion",
    "referencia"
})
public class TicketDTO {

    protected BancoDTO bancoDestino;
    protected ConceptoDTO concepto;
    protected CuentaDTO cuentaDestino;
    protected CuentaDTO cuentaOrigen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Boolean hostOnline;
    protected Double importe;
    protected MonedaDTO moneda;
    protected String nroControl;
    protected String nroTransaccion;
    protected String referencia;

    /**
     * Obtiene el valor de la propiedad bancoDestino.
     * 
     * @return
     *     possible object is
     *     {@link BancoDTO }
     *     
     */
    public BancoDTO getBancoDestino() {
        return bancoDestino;
    }

    /**
     * Define el valor de la propiedad bancoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link BancoDTO }
     *     
     */
    public void setBancoDestino(BancoDTO value) {
        this.bancoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link ConceptoDTO }
     *     
     */
    public ConceptoDTO getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptoDTO }
     *     
     */
    public void setConcepto(ConceptoDTO value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaDestino.
     * 
     * @return
     *     possible object is
     *     {@link CuentaDTO }
     *     
     */
    public CuentaDTO getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Define el valor de la propiedad cuentaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaDTO }
     *     
     */
    public void setCuentaDestino(CuentaDTO value) {
        this.cuentaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link CuentaDTO }
     *     
     */
    public CuentaDTO getCuentaOrigen() {
        return cuentaOrigen;
    }

    /**
     * Define el valor de la propiedad cuentaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaDTO }
     *     
     */
    public void setCuentaOrigen(CuentaDTO value) {
        this.cuentaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad hostOnline.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostOnline() {
        return hostOnline;
    }

    /**
     * Define el valor de la propiedad hostOnline.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostOnline(Boolean value) {
        this.hostOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporte(Double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link MonedaDTO }
     *     
     */
    public MonedaDTO getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link MonedaDTO }
     *     
     */
    public void setMoneda(MonedaDTO value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad nroControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroControl() {
        return nroControl;
    }

    /**
     * Define el valor de la propiedad nroControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroControl(String value) {
        this.nroControl = value;
    }

    /**
     * Obtiene el valor de la propiedad nroTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTransaccion() {
        return nroTransaccion;
    }

    /**
     * Define el valor de la propiedad nroTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTransaccion(String value) {
        this.nroTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

}
