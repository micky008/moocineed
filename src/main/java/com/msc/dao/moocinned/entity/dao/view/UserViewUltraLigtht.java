package com.msc.dao.moocinned.entity.dao.view;

import com.msc.dao.daoproject.annotation.Id;
import com.msc.dao.daoproject.annotation.Name;
import com.msc.dao.moocinned.entity.User;

/**
 *
 * @author micky
 */
@Name(name = "user")
public class UserViewUltraLigtht {

    @Id
    private Integer id;
    private String urlPhoto;

    

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

    public UserViewUltraLigtht convert(User user) {
        this.setId(user.getId());
        this.setUrlPhoto(user.getUrlPhoto());
        return this;
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



}
