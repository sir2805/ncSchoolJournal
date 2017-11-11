package by.nc.school.dev.dao;

import by.nc.school.dev.enitities.BaseEnitity;

interface IDao<T extends BaseEnitity> {

    T get(int id);
    T create(T entity);
    void update(T entity);
    void delete(T entity);
}
