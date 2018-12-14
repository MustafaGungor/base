package com.mg.service;

import com.mg.entity.BaseEntity;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface BaseService<T extends BaseEntity> {
    T add(T t);

    T update(T t);

    T delete(T t);

    T deleteById(int id);

    List<T> getAll();

    T findById(int id);

    List<T> findBySearch(String name);

    List<T> find(Object o);
}
