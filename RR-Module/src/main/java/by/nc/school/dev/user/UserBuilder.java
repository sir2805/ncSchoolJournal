package by.nc.school.dev.user;

import by.nc.school.dev.dao.UserDaoEntity;

public abstract class UserBuilder {

    public abstract User createUser(UserDaoEntity userDaoEntity);
}
