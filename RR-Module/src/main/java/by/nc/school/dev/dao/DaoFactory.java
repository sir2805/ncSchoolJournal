package by.nc.school.dev.dao;

interface IDaoFactory {

    UserDao getUserDao();
}

public class DaoFactory implements IDaoFactory {

    public UserDao getUserDao() {
        return new UserDao();
    }
}
