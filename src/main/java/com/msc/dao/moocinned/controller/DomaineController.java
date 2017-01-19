package com.msc.dao.moocinned.controller;

import com.msc.dao.moocinned.entity.Domaine;
import com.msc.dao.moocinned.entity.dao.DomaineDAO;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author micky
 */
@Path("/domaine")
@Produces(MediaType.APPLICATION_JSON)
@Resource
public class DomaineController {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Domaine> getAllDomaine( ) throws SQLException {
        DomaineDAO ddao = new DomaineDAO();
        return ddao.getAll();
    }

}
