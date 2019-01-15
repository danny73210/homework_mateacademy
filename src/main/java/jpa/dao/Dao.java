package jpa.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao <T, Id extends Serializable> {
    T findOne(final Id id);

    List<T> findAll();

    void create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final Id entityId);
}
