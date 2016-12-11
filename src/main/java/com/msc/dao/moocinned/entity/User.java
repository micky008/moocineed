package com.msc.dao.moocinned.entity;

import com.msc.dao.daoproject.annotation.Id;
import com.msc.dao.daoproject.annotation.Name;
import com.msc.dao.daoproject.annotation.PrimaryKey;
import com.msc.dao.daoproject.annotation.StaticField;
import com.msc.dao.moocinned.entity.FormeJuridique.FORME_JURIDIQUE;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author micky
 */
@Name(name = "user")
@XmlRootElement(name = "User")
public class User {

    @Id
    @PrimaryKey
    private Integer id;

    private String adresse;
    private String adresseSiege;
    private Date dateCreation;
    private String descr;
    private Integer domaine;
    private String email;
    private FORME_JURIDIQUE formeJuridique;

    private String nom;
    private Integer nombreSalaries;
    private String prenom;
    private String raisonSociale;
    private String siren;
    private String urlVideo;
    private String urlPhoto;
    private Integer idDepartement;
    private String telephone;
    
    @StaticField
    private Departement departement;
    
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
     * @return the adresseSiege
     */
    public String getAdresseSiege() {
        return adresseSiege;
    }

    /**
     * @param adresseSiege the adresseSiege to set
     */
    public void setAdresseSiege(String adresseSiege) {
        this.adresseSiege = adresseSiege;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the descr
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr the descr to set
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * @return the domaine
     */
    public Integer getDomaine() {
        return domaine;
    }

    /**
     * @param domaine the domaine to set
     */
    public void setDomaine(Integer domaine) {
        this.domaine = domaine;
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
     * @return the formeJuridque
     */
    public FORME_JURIDIQUE getFormeJuridique() {
        return formeJuridique;
    }

    /**
     * @param formeJuridque the formeJuridque to set
     */
    public void setFormeJuridique(FORME_JURIDIQUE formeJuridque) {
        this.formeJuridique = formeJuridque;
    }

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
     * @return the nombreSalaries
     */
    public Integer getNombreSalaries() {
        return nombreSalaries;
    }

    /**
     * @param nombreSalaries the nombreSalaries to set
     */
    public void setNombreSalaries(Integer nombreSalaries) {
        this.nombreSalaries = nombreSalaries;
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
    public String getRaisonSociale() {
        return raisonSociale;
    }

    /**
     * @param raisonSocial the raisonSocial to set
     */
    public void setRaisonSociale(String raisonSocial) {
        this.raisonSociale = raisonSocial;
    }

    /**
     * @return the siren
     */
    public String getSiren() {
        return siren;
    }

    /**
     * @param siren the siren to set
     */
    public void setSiren(String siren) {
        this.siren = siren;
    }

    /**
     * @return the urlVideo
     */
    public String getUrlVideo() {
        return urlVideo;
    }

    /**
     * @param urlVideo the urlVideo to set
     */
    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
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
//        try {
//            departement = (new DepartementDAO().getObjectById(idDepartement));
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public Departement getDepartement(){return departement;}
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getPrenom());
        sb.append(" ");
        sb.append(this.getNom());
        sb.append(" ");
        sb.append(this.getAdresse());
        sb.append(" ");
        sb.append(this.getAdresseSiege());
        sb.append(" ");
        sb.append(this.getDateCreation());
        sb.append(" ");
        sb.append(this.getDescr());
        sb.append(" ");
        sb.append(this.getDomaine());
        sb.append(" ");
        sb.append(this.getEmail());
        sb.append(" ");
        sb.append(this.getFormeJuridique());
        sb.append(" ");
        sb.append(this.getNombreSalaries());
        sb.append(" ");
        sb.append(this.getRaisonSociale());
        sb.append(" ");
        sb.append(this.getSiren());
        sb.append(" ");
        sb.append(this.getUrlPhoto());
        sb.append(" ");
        sb.append(this.getUrlVideo());
        sb.append(" ");
        sb.append(this.getIdDepartement());
        sb.append(" ");
        return sb.toString();
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



}
