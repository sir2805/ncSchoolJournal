package by.nc.school.dev.DAO;

interface IDao<T extends BaseDaoEntity> {

    // get by id
    void get(T entity);
    T create(T entity);
    void update(T entity);
    void delete(T entity);
}
