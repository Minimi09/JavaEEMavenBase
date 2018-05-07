package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UserExamDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserExamDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserExamDAOImpl extends BaseDAOImpl<UserExamDO, Long> implements UserExamDAO {

    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager)
    {
        super.setEntityManager(entityManager);
    }

}
