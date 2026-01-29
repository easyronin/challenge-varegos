package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para transferirConDatosOriginante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferirConDatosOriginante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://ws.transferencias.banelco.com/}usuarioDTO" minOccurs="0"/&gt;
 *         &lt;element name="terminal" type="{http://ws.transferencias.banelco.com/}terminalDTO" minOccurs="0"/&gt;
 *         &lt;element name="transferencia" type="{http://ws.transferencias.banelco.com/}transferenciaDTO" minOccurs="0"/&gt;
 *         &lt;element name="datosOriginante" type="{http://ws.transferencias.banelco.com/}datosOriginanteDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferirConDatosOriginante", propOrder = {
    "usuario",
    "terminal",
    "transferencia",
    "datosOriginante"
})
public class TransferirConDatosOriginante {

    protected UsuarioDTO usuario;
    protected TerminalDTO terminal;
    protected TransferenciaDTO transferencia;
    protected DatosOriginanteDTO datosOriginante;

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

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     * @return
     *     possible object is
     *     {@link TerminalDTO }
     *     
     */
    public TerminalDTO getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalDTO }
     *     
     */
    public void setTerminal(TerminalDTO value) {
        this.terminal = value;
    }

    /**
     * Obtiene el valor de la propiedad transferencia.
     * 
     * @return
     *     possible object is
     *     {@link TransferenciaDTO }
     *     
     */
    public TransferenciaDTO getTransferencia() {
        return transferencia;
    }

    /**
     * Define el valor de la propiedad transferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferenciaDTO }
     *     
     */
    public void setTransferencia(TransferenciaDTO value) {
        this.transferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad datosOriginante.
     * 
     * @return
     *     possible object is
     *     {@link DatosOriginanteDTO }
     *     
     */
    public DatosOriginanteDTO getDatosOriginante() {
        return datosOriginante;
    }

    /**
     * Define el valor de la propiedad datosOriginante.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosOriginanteDTO }
     *     
     */
    public void setDatosOriginante(DatosOriginanteDTO value) {
        this.datosOriginante = value;
    }

}
