package com.melof10.challengevaregos.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para getAgendaCBUExtendidoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgendaCBUExtendidoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agendaCBUExtendido" type="{http://ws.transferencias.banelco.com/}agendaCBUExtendidoDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAgendaCBUExtendidoResponse", propOrder = {
    "agendaCBUExtendido"
})
public class GetAgendaCBUExtendidoResponse {

    protected List<AgendaCBUExtendidoDTO> agendaCBUExtendido;

    /**
     * Gets the value of the agendaCBUExtendido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendaCBUExtendido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendaCBUExtendido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgendaCBUExtendidoDTO }
     * 
     * 
     */
    public List<AgendaCBUExtendidoDTO> getAgendaCBUExtendido() {
        if (agendaCBUExtendido == null) {
            agendaCBUExtendido = new ArrayList<AgendaCBUExtendidoDTO>();
        }
        return this.agendaCBUExtendido;
    }

}
