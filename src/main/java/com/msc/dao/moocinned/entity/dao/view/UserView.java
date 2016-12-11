package com.msc.dao.moocinned.entity.dao.view;

import com.msc.dao.moocinned.entity.User;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author micky
 */
@XmlRootElement(name = "User")
public class UserView {

    private Integer id;

    private String adresse;
    private String email;

    private String nom;
    private String prenom;
    private String raisonSocial;
    private String urlPhoto;
    private Integer idDepartement;
    
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
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the raisonSocial
     */
    public String getRaisonSocial() {
        return raisonSocial;
    }

    /**
     * @param raisonSocial the raisonSocial to set
     */
    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    /**
     * @return the urlPhoto
     */
    public String getUrlPhoto() {
        return urlPhoto;
    }

    /**
     * @param urlPhoto the urlPhoto to set
     */
    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public void convert(User user) {
        this.adresse = user.getAdresse();
        this.email = user.getEmail();
        this.id = user.getId();
        this.nom = user.getNom();
        this.prenom = user.getPrenom();
        this.raisonSocial = user.getRaisonSociale();
        this.urlPhoto = user.getUrlPhoto();
        this.idDepartement = user.getIdDepartement();
    }

    /**
     * @return the idDepartement
     */
    public Integer getIdDepartement() {
        return idDepartement;
    }

    /**
     * @param idDepartement the idDepartement to set
     */
    public void setIdDepartement(Integer idDepartement) {
        this.idDepartement = idDepartement;
    }

}
