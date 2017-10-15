package by.nc.school.dev.DAO;

interface IDaoFactory {

    UserDao getUserDao();
}

public class DaoFactory implements IDaoFactory {

    public UserDao getUserDao() {
        return new UserDao();
    }
}
