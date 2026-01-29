package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para consultarCBUAliasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarCBUAliasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cbuAlias" type="{http://ws.transferencias.banelco.com/}cbuAliasDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarCBUAliasResponse", propOrder = {
    "cbuAlias"
})
public class ConsultarCBUAliasResponse {

    protected CbuAliasDTO cbuAlias;

    /**
     * Obtiene el valor de la propiedad cbuAlias.
     * 
     * @return
     *     possible object is
     *     {@link CbuAliasDTO }
     *     
     */
    public CbuAliasDTO getCbuAlias() {
        return cbuAlias;
    }

    /**
     * Define el valor de la propiedad cbuAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link CbuAliasDTO }
     *     
     */
    public void setCbuAlias(CbuAliasDTO value) {
        this.cbuAlias = value;
    }

}
