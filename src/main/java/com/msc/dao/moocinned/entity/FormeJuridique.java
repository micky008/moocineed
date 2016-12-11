package com.msc.dao.moocinned.entity;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author micky
 */
public class FormeJuridique {

    @XmlType(name = "type")
    @XmlEnum
    @Produces(MediaType.APPLICATION_JSON)
    public enum FORME_JURIDIQUE {
        @XmlEnumValue(value = "SASU")
        SASU,
        @XmlEnumValue(value = "SARL")
        SARL,
        @XmlEnumValue(value = "EURL")
        EURL,
        @XmlEnumValue(value = "EI")
        EI
    
    }
    
    
}
