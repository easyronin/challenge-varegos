package com.melof10.challengevaregos.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para titularidadDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="titularidadDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ctaDestino" type="{http://ws.transferencias.banelco.com/}cuentaDTO" minOccurs="0"/&gt;
 *         &lt;element name="cuits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fiidBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiidOrigenLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titularidadDTO", propOrder = {
    "ctaDestino",
    "cuits",
    "fiidBanco",
    "fiidOrigenLink",
    "nombreBanco",
    "nombreTitular"
})
@XmlSeeAlso({
    TitularidadExtendidoDTO.class
})
public class TitularidadDTO {

    protected CuentaDTO ctaDestino;
    @XmlElement(nillable = true)
    protected List<String> cuits;
    protected String fiidBanco;
    protected String fiidOrigenLink;
    protected String nombreBanco;
    protected String nombreTitular;

    /**
     * Obtiene el valor de la propiedad ctaDestino.
     * 
     * @return
     *     possible object is
     *     {@link CuentaDTO }
     *     
     */
    public CuentaDTO getCtaDestino() {
        return ctaDestino;
    }

    /**
     * Define el valor de la propiedad ctaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaDTO }
     *     
     */
    public void setCtaDestino(CuentaDTO value) {
        this.ctaDestino = value;
    }

    /**
     * Gets the value of the cuits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCuits() {
        if (cuits == null) {
            cuits = new ArrayList<String>();
        }
        return this.cuits;
    }

    /**
     * Obtiene el valor de la propiedad fiidBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiidBanco() {
        return fiidBanco;
    }

    /**
     * Define el valor de la propiedad fiidBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiidBanco(String value) {
        this.fiidBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad fiidOrigenLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiidOrigenLink() {
        return fiidOrigenLink;
    }

    /**
     * Define el valor de la propiedad fiidOrigenLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiidOrigenLink(String value) {
        this.fiidOrigenLink = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Define el valor de la propiedad nombreBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBanco(String value) {
        this.nombreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Define el valor de la propiedad nombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

}
