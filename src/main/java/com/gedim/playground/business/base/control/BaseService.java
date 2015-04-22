package com.gedim.playground.business.base.control;

import com.gedim.playground.utility.TracingInterceptor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Interceptors(TracingInterceptor.class)
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class BaseService {

    private EntityManager entityManager;

    @PersistenceContext(name = "persistence/playground", unitName = "playground")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public List getAll(Class clazz) {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder()
                .createQuery();
        cq.select(cq.from(clazz));
        return getEntityManager().createQuery(cq).getResultList();
    }
}
