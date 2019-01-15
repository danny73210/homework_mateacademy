package jpa.dao;

import org.apache.poi.ss.formula.functions.T;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao <T, Id extends Serializable> implements Dao<T, Id> {
    //@PersistenceContext
    private final EntityManager em;
    private final Class<T> tClass;

    public AbstractDao(EntityManager em, Class<T> tClass) {
        this.em = em;
        this.tClass = tClass;
    }

    @Override
    public T findOne(Id id) {
        em.getTransaction().begin();
        T t = em.find(tClass, id);
        em.getTransaction().commit();
        return t;
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("from " + tClass.getName()).getResultList();
    }

    @Override
    public void create(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    @Override
    public T update(T entity) {
        em.getTransaction().begin();
        entity = em.merge(entity);
        em.getTransaction().commit();
        return entity;

    }

    @Override
    public void delete(T entity) {
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public void deleteById(Id entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }
}
