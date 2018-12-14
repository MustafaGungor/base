package com.mg.dao.impl;

import com.mg.entity.BaseEntity;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface IBaseDao<T extends BaseEntity> {
    T getId(int id);

    T create(T t);

    T update(T t);

    void delete(Integer id);

    List<T> getAllList();
}
