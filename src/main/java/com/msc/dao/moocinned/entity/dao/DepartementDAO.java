package com.msc.dao.moocinned.entity.dao;

import com.msc.dao.daoproject.generic.DAO;
import com.msc.dao.moocinned.entity.Departement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author micky
 */
public class DepartementDAO extends DAOSpecif<Departement> {

    private static List<Departement> depts;

    public DepartementDAO() {
        super(DAO.getConnection());
    }

    @Override
    public List<Departement> getAll() throws SQLException {
        if (depts == null) {
            depts = super.getAll();
        }
        return depts;
    }

}
