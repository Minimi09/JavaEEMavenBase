package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author jorge.lopez
 */
public class UserDAOImpl extends BaseDAOImpl<UserDO, Long> implements UserDAO {

    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager)
    {
        super.setEntityManager(entityManager);
    }

}