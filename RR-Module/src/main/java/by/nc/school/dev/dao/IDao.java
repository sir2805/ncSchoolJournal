package by.nc.school.dev.dao;

interface IDao<T extends BaseDaoEntity> {

    void get(int id);
    T create(T entity);
    void update(T entity);
    void delete(T entity);
}
