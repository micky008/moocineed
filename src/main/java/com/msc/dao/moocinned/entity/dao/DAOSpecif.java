package com.msc.dao.moocinned.entity.dao;

import com.msc.dao.daoproject.generic.GenericDaoImpl;
import com.msc.dao.moocinned.entity.FormeJuridique;
import java.sql.Connection;

/**
 *
 * @author micky
 * @param <T>
 */
public abstract class DAOSpecif<T> extends GenericDaoImpl<T> {

    public DAOSpecif(Connection con) {
        super(con);
    }

    @Override
    protected Object convertFillObjectCustom(Class<?> clazz, Object o) {
        if (clazz == FormeJuridique.FORME_JURIDIQUE.class) {
            return FormeJuridique.FORME_JURIDIQUE.valueOf(o.toString());
        }
        return null;
    }

    @Override
    protected String convertLogicCustom(Class<?> type, Object o) {
        if (type == FormeJuridique.FORME_JURIDIQUE.class) {
            FormeJuridique.FORME_JURIDIQUE fj = (FormeJuridique.FORME_JURIDIQUE) o;
            if (null != fj) {
                switch (fj) {
                    case EI:
                        return "'EI'";
                    case EURL:
                        return "'EURL'";
                    case SARL:
                        return "'SARL'";
                    case SASU:
                        return "'SASU'";
                    default:
                        return "'EI'";
                }
            }
        }
        return null;
    }

}
