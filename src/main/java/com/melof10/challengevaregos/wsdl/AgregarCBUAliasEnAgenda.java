package com.melof10.challengevaregos.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para agregarCBUAliasEnAgenda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarCBUAliasEnAgenda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://ws.transferencias.banelco.com/}usuarioDTO" minOccurs="0"/&gt;
 *         &lt;element name="terminal" type="{http://ws.transferencias.banelco.com/}terminalDTO" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://ws.transferencias.banelco.com/}agendaCBUAliasDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarCBUAliasEnAgenda", propOrder = {
    "usuario",
    "terminal",
    "item"
})
public class AgregarCBUAliasEnAgenda {

    protected UsuarioDTO usuario;
    protected TerminalDTO terminal;
    protected AgendaCBUAliasDTO item;

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
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link AgendaCBUAliasDTO }
     *     
     */
    public AgendaCBUAliasDTO getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendaCBUAliasDTO }
     *     
     */
    public void setItem(AgendaCBUAliasDTO value) {
        this.item = value;
    }

}
