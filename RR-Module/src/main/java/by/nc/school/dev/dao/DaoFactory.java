package by.nc.school.dev.dao;

interface IDaoFactory {

    UserDao getUserDao();
    GroupDao getGroupDao();
}

public class DaoFactory implements IDaoFactory {

    public UserDao getUserDao() {
        return new UserDao();
    }

    public GroupDao getGroupDao() {
        return new GroupDao();
    }
}
