package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para coordenadasDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coordenadasDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coordenada1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coordenada2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordenadasDTO", propOrder = {
    "coordenada1",
    "coordenada2",
    "hash",
    "nroSerie"
})
public class CoordenadasDTO {

    protected String coordenada1;
    protected String coordenada2;
    protected String hash;
    protected String nroSerie;

    /**
     * Obtiene el valor de la propiedad coordenada1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordenada1() {
        return coordenada1;
    }

    /**
     * Define el valor de la propiedad coordenada1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordenada1(String value) {
        this.coordenada1 = value;
    }

    /**
     * Obtiene el valor de la propiedad coordenada2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordenada2() {
        return coordenada2;
    }

    /**
     * Define el valor de la propiedad coordenada2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordenada2(String value) {
        this.coordenada2 = value;
    }

    /**
     * Obtiene el valor de la propiedad hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSerie() {
        return nroSerie;
    }

    /**
     * Define el valor de la propiedad nroSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSerie(String value) {
        this.nroSerie = value;
    }

}
