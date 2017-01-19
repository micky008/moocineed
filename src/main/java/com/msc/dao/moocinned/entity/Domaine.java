package com.msc.dao.moocinned.entity;

import com.msc.dao.daoproject.annotation.Id;
import com.msc.dao.daoproject.annotation.Name;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author micky
 */
@Name(name = "domaine")
@XmlRootElement(name = "domaine")
public class Domaine {
    
    @Id
    private Integer id;
    private String domaine;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the domaine
     */
    public String getDomaine() {
        return domaine;
    }

    /**
     * @param domaine the domaine to set
     */
    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    
    
}
