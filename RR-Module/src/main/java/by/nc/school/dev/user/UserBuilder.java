package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;
import by.nc.school.dev.user.User;

public abstract class UserBuilder {

    public abstract User createUser(UserDaoEntity userDaoEntity);
}
