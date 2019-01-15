package jpa.service;

import java.io.Serializable;
import java.util.List;

public interface Service<T, Id extends Serializable>  {
    void save(T t);

    T find(Id id);

    List<T> finaAll();

    void deleteById(int id);

    T update(T t);


}
