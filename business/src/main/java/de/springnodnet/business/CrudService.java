package de.springnodnet.business;

import java.util.List;

public interface CrudService<BaseEntity, T> {

    T findOne(Long id);

    List<T> findAll();

    T create(T t);

    void update(T t);

    void delete(Long id);

}
