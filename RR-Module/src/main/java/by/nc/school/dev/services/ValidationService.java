package by.nc.school.dev.services;

import by.nc.school.dev.dao.DaoFactory;
import by.nc.school.dev.dao.UserDao;
import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.User;

public class ValidationService {

    public User validate(String username, String password) {
        DaoFactory factory = new DaoFactory();
        UserDao userDao = factory.getUserDao();
        UserDaoEntity entity = userDao.findUserByUserName(username);
        User currentUser = null;
        if (entity == null) {
            System.out.println("username doesn't exist");
        } else if (!entity.getPassword().equals(password)) {
            System.out.println("incorrect password");
        } else {
            currentUser = new UserService().getUser(entity);
            System.out.println("validation successful. Welcome " + currentUser.getFullName());
        }
        return currentUser;
    }
}
