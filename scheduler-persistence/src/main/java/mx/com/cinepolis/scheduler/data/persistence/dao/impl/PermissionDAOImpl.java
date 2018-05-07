package mx.com.cinepolis.scheduler.data.persistence.dao.impl;

import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.PermissionDO;
import mx.com.cinepolis.scheduler.data.persistence.dao.PermissionDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PermissionDAOImpl  extends BaseDAOImpl<PermissionDO, Long> implements PermissionDAO
{

    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager)
    {
        super.setEntityManager(entityManager);
    }

}
