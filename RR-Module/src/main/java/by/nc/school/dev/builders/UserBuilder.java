package by.nc.school.dev.builders;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.User;

public abstract class UserBuilder {

    public abstract User build(UserDaoEntity userDaoEntity);
}
