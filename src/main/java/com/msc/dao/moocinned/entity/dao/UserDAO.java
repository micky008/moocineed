package com.msc.dao.moocinned.entity.dao;

import com.msc.dao.daoproject.annotation.Name;
import com.msc.dao.daoproject.generic.DAO;
import com.msc.dao.daoproject.helper.SqlHelper;
import com.msc.dao.moocinned.entity.User;
import com.msc.dao.moocinned.entity.dao.view.UserView;
import com.msc.dao.moocinned.entity.dao.view.UserViewUltraLigtht;
import com.msc.dao.moocinned.helper.ConfigHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author micky
 */
public class UserDAO extends DAOSpecif<User> {

    public UserDAO() {
        super(DAO.getConnection());
    }

    public List<UserViewUltraLigtht> getAllView(Integer[] depts, Integer[] domaineType) throws SQLException {
        List<UserViewUltraLigtht> users = new ArrayList<>();
        String sql = "select id, url_photo from " + User.class.getAnnotation(Name.class).name();
        boolean and = false;
        if (depts != null || domaineType != null) {
            sql += " where ";
        }
        if (depts != null) {
            and = true;
            sql += " id_departement in ";
            sql += SqlHelper.toIn((Object[]) depts);
        }
        if (domaineType != null) {
            if (and) {
                sql += " and ";
            }
            sql += " domaine in ";
            sql += SqlHelper.toIn((Object[]) domaineType);
        }
        ResultSet rs = this.sendSql(sql);
        UserViewUltraLigtht uul;
        while (rs.next()) {
            uul = new UserViewUltraLigtht();
            uul.setUrlPhoto(ConfigHelper.getFolderUrlPhotos()+rs.getString(2));
            uul.setId(rs.getInt(1));
            users.add(uul);
        }
        rs.close();
        return users;
    }

    public UserViewUltraLigtht getUserPhone(Integer id) throws SQLException {
        ResultSet rs = this.sendSql("select id, telephone from " + User.class.getAnnotation(Name.class).name() + " where id =" + id);
        UserViewUltraLigtht uul = null;
        while (rs.next()) {
            uul = new UserViewUltraLigtht();
            uul.setUrlPhoto(rs.getString(2));
            uul.setId(rs.getInt(1));
        }
        rs.close();
        return uul;
    }

}
