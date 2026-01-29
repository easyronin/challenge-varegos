package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para datosUsuarioDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosUsuarioDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primerLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="requiereCambioPIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="requierePIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="requiereTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://ws.transferencias.banelco.com/}usuarioDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosUsuarioDTO", propOrder = {
    "primerLogin",
    "requiereCambioPIN",
    "requierePIN",
    "requiereTC",
    "usuario"
})
public class DatosUsuarioDTO {

    protected Boolean primerLogin;
    protected Boolean requiereCambioPIN;
    protected Boolean requierePIN;
    protected Boolean requiereTC;
    protected UsuarioDTO usuario;

    /**
     * Obtiene el valor de la propiedad primerLogin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimerLogin() {
        return primerLogin;
    }

    /**
     * Define el valor de la propiedad primerLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimerLogin(Boolean value) {
        this.primerLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad requiereCambioPIN.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiereCambioPIN() {
        return requiereCambioPIN;
    }

    /**
     * Define el valor de la propiedad requiereCambioPIN.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiereCambioPIN(Boolean value) {
        this.requiereCambioPIN = value;
    }

    /**
     * Obtiene el valor de la propiedad requierePIN.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequierePIN() {
        return requierePIN;
    }

    /**
     * Define el valor de la propiedad requierePIN.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequierePIN(Boolean value) {
        this.requierePIN = value;
    }

    /**
     * Obtiene el valor de la propiedad requiereTC.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiereTC() {
        return requiereTC;
    }

    /**
     * Define el valor de la propiedad requiereTC.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiereTC(Boolean value) {
        this.requiereTC = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioDTO }
     *     
     */
    public UsuarioDTO getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioDTO }
     *     
     */
    public void setUsuario(UsuarioDTO value) {
        this.usuario = value;
    }

}
