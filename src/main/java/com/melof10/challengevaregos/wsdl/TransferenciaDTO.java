package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para transferenciaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferenciaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cbuEnAgenda" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coordenadas" type="{http://ws.transferencias.banelco.com/}coordenadasDTO" minOccurs="0"/&gt;
 *         &lt;element name="cuentaDestino" type="{http://ws.transferencias.banelco.com/}cuentaDTO" minOccurs="0"/&gt;
 *         &lt;element name="cuentaOrigen" type="{http://ws.transferencias.banelco.com/}cuentaDTO" minOccurs="0"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://ws.transferencias.banelco.com/}monedaDTO" minOccurs="0"/&gt;
 *         &lt;element name="propiedad" type="{http://ws.transferencias.banelco.com/}propiedadDTO" minOccurs="0"/&gt;
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titularidad" type="{http://ws.transferencias.banelco.com/}titularidadDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferenciaDTO", propOrder = {
    "cbuEnAgenda",
    "codConcepto",
    "coordenadas",
    "cuentaDestino",
    "cuentaOrigen",
    "documento",
    "importe",
    "moneda",
    "propiedad",
    "referencia",
    "titularidad"
})
public class TransferenciaDTO {

    protected Boolean cbuEnAgenda;
    protected String codConcepto;
    protected CoordenadasDTO coordenadas;
    protected CuentaDTO cuentaDestino;
    protected CuentaDTO cuentaOrigen;
    protected String documento;
    protected Double importe;
    protected MonedaDTO moneda;
    protected PropiedadDTO propiedad;
    protected String referencia;
    protected TitularidadDTO titularidad;

    /**
     * Obtiene el valor de la propiedad cbuEnAgenda.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCbuEnAgenda() {
        return cbuEnAgenda;
    }

    /**
     * Define el valor de la propiedad cbuEnAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCbuEnAgenda(Boolean value) {
        this.cbuEnAgenda = value;
    }

    /**
     * Obtiene el valor de la propiedad codConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConcepto() {
        return codConcepto;
    }

    /**
     * Define el valor de la propiedad codConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConcepto(String value) {
        this.codConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad coordenadas.
     * 
     * @return
     *     possible object is
     *     {@link CoordenadasDTO }
     *     
     */
    public CoordenadasDTO getCoordenadas() {
        return coordenadas;
    }

    /**
     * Define el valor de la propiedad coordenadas.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordenadasDTO }
     *     
     */
    public void setCoordenadas(CoordenadasDTO value) {
        this.coordenadas = value;
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
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
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
     * Obtiene el valor de la propiedad propiedad.
     * 
     * @return
     *     possible object is
     *     {@link PropiedadDTO }
     *     
     */
    public PropiedadDTO getPropiedad() {
        return propiedad;
    }

    /**
     * Define el valor de la propiedad propiedad.
     * 
     * @param value
     *     allowed object is
     *     {@link PropiedadDTO }
     *     
     */
    public void setPropiedad(PropiedadDTO value) {
        this.propiedad = value;
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

    /**
     * Obtiene el valor de la propiedad titularidad.
     * 
     * @return
     *     possible object is
     *     {@link TitularidadDTO }
     *     
     */
    public TitularidadDTO getTitularidad() {
        return titularidad;
    }

    /**
     * Define el valor de la propiedad titularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link TitularidadDTO }
     *     
     */
    public void setTitularidad(TitularidadDTO value) {
        this.titularidad = value;
    }

}
