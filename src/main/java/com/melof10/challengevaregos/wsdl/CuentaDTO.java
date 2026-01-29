package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para cuentaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cuentaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="limite" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://ws.transferencias.banelco.com/}monedaDTO" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://ws.transferencias.banelco.com/}tipoCuentaDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuentaDTO", propOrder = {
    "descripcion",
    "disponible",
    "limite",
    "moneda",
    "numero",
    "numeroCBU",
    "saldo",
    "tipo"
})
public class CuentaDTO {

    protected String descripcion;
    protected Double disponible;
    protected Double limite;
    protected MonedaDTO moneda;
    protected String numero;
    protected String numeroCBU;
    protected Double saldo;
    protected TipoCuentaDTO tipo;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad disponible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisponible() {
        return disponible;
    }

    /**
     * Define el valor de la propiedad disponible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisponible(Double value) {
        this.disponible = value;
    }

    /**
     * Obtiene el valor de la propiedad limite.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimite() {
        return limite;
    }

    /**
     * Define el valor de la propiedad limite.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimite(Double value) {
        this.limite = value;
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
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCBU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCBU() {
        return numeroCBU;
    }

    /**
     * Define el valor de la propiedad numeroCBU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCBU(String value) {
        this.numeroCBU = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldo(Double value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link TipoCuentaDTO }
     *     
     */
    public TipoCuentaDTO getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCuentaDTO }
     *     
     */
    public void setTipo(TipoCuentaDTO value) {
        this.tipo = value;
    }

}
