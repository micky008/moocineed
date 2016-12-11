package com.msc.dao.moocinned.controller;

import com.msc.dao.moocinned.entity.User;
import com.msc.dao.moocinned.entity.dao.UserDAO;
import com.msc.dao.moocinned.entity.dao.view.UserView;
import com.msc.dao.moocinned.entity.dao.view.UserViewUltraLigtht;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author micky
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Resource
public class UserController {

    @GET
    @Path("/all/{depts}/{domaineType}/{random}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserViewUltraLigtht> getAllClients(
            @PathParam("depts") Integer dept,
            @PathParam("domaineType") Integer domaineType,
            @PathParam("random") Boolean random
    ) throws SQLException {
        UserDAO udao = new UserDAO();
        Integer[] depts = null;
        Integer[] domaineTypes = null;
        if (dept > 0) {
            depts = new Integer[1];
            depts[0] = dept;
        }
        if (domaineType > 0) {
           domaineTypes = new Integer[1];
            domaineTypes[0] = domaineType;
        }
        
        List<UserViewUltraLigtht> us = udao.getAllView(depts, domaineTypes);
        if (random) {
            Collections.shuffle(us);
        }
        return us;
    }

    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserView getUserById(@PathParam("id") Integer id) {
        try {
            UserDAO udao = new UserDAO();
            UserView uv = new UserView();
            User uv2 = udao.getObjectById(id);
            uv.convert(uv2);
            return uv;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @GET
    @Path("/phone/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserViewUltraLigtht getUserPhone(@PathParam("id") Integer id) throws SQLException {
        UserDAO udao = new UserDAO();
        return udao.getUserPhone(id);

    }

}
