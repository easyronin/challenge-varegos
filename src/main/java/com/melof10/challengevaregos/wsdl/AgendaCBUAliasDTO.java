package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para agendaCBUAliasDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agendaCBUAliasDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuitCuil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propiedadDTO" type="{http://ws.transferencias.banelco.com/}propiedadDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agendaCBUAliasDTO", propOrder = {
    "alias",
    "cuitCuil",
    "descripcion",
    "propiedadDTO"
})
public class AgendaCBUAliasDTO {

    protected String alias;
    protected String cuitCuil;
    protected String descripcion;
    protected PropiedadDTO propiedadDTO;

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitCuil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitCuil() {
        return cuitCuil;
    }

    /**
     * Define el valor de la propiedad cuitCuil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitCuil(String value) {
        this.cuitCuil = value;
    }

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
     * Obtiene el valor de la propiedad propiedadDTO.
     * 
     * @return
     *     possible object is
     *     {@link PropiedadDTO }
     *     
     */
    public PropiedadDTO getPropiedadDTO() {
        return propiedadDTO;
    }

    /**
     * Define el valor de la propiedad propiedadDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link PropiedadDTO }
     *     
     */
    public void setPropiedadDTO(PropiedadDTO value) {
        this.propiedadDTO = value;
    }

}
