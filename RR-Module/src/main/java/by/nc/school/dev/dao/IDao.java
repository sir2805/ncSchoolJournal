package by.nc.school.dev.dao;

import by.nc.school.dev.dao.entities.BaseDaoEntity;

interface IDao<T extends BaseDaoEntity> {

    T get(int id);
    T create(T entity);
    void update(T entity);
    void delete(T entity);
}
