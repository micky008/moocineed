package com.msc.dao.moocinned.controller;

import com.msc.dao.moocinned.entity.Departement;
import com.msc.dao.moocinned.entity.User;
import com.msc.dao.moocinned.entity.dao.DepartementDAO;
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
@Path("/dept")
@Produces(MediaType.APPLICATION_JSON)
@Resource
public class DepartementController {

    @GET
    @Path("/all/{dept}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Departement> getAllDepartement(  @PathParam("depts") String dept) throws SQLException {
        DepartementDAO ddao = new DepartementDAO();
        return ddao.getAll();
    }

    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Departement getDepartementById(  @PathParam("id") Integer id) throws SQLException {
        DepartementDAO ddao = new DepartementDAO();
        return ddao.getObjectById(id);
    }
    
}
