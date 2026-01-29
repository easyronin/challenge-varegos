package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para validarUsuarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarUsuarioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosUsuario" type="{http://ws.transferencias.banelco.com/}datosUsuarioDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarUsuarioResponse", propOrder = {
    "datosUsuario"
})
public class ValidarUsuarioResponse {

    protected DatosUsuarioDTO datosUsuario;

    /**
     * Obtiene el valor de la propiedad datosUsuario.
     * 
     * @return
     *     possible object is
     *     {@link DatosUsuarioDTO }
     *     
     */
    public DatosUsuarioDTO getDatosUsuario() {
        return datosUsuario;
    }

    /**
     * Define el valor de la propiedad datosUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosUsuarioDTO }
     *     
     */
    public void setDatosUsuario(DatosUsuarioDTO value) {
        this.datosUsuario = value;
    }

}
