package com.msc.dao.moocinned.entity.dao;

import com.msc.dao.daoproject.generic.DAO;
import com.msc.dao.moocinned.entity.Domaine;

/**
 *
 * @author micky
 */
public class DomaineDAO extends DAOSpecif<Domaine> {

    public DomaineDAO() {
        super(DAO.getConnection());
    }

}
