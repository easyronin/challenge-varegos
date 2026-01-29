package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para consultarDatosTitularidadExtendidoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarDatosTitularidadExtendidoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titularidadExtendido" type="{http://ws.transferencias.banelco.com/}titularidadExtendidoDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarDatosTitularidadExtendidoResponse", propOrder = {
    "titularidadExtendido"
})
public class ConsultarDatosTitularidadExtendidoResponse {

    protected TitularidadExtendidoDTO titularidadExtendido;

    /**
     * Obtiene el valor de la propiedad titularidadExtendido.
     * 
     * @return
     *     possible object is
     *     {@link TitularidadExtendidoDTO }
     *     
     */
    public TitularidadExtendidoDTO getTitularidadExtendido() {
        return titularidadExtendido;
    }

    /**
     * Define el valor de la propiedad titularidadExtendido.
     * 
     * @param value
     *     allowed object is
     *     {@link TitularidadExtendidoDTO }
     *     
     */
    public void setTitularidadExtendido(TitularidadExtendidoDTO value) {
        this.titularidadExtendido = value;
    }

}
