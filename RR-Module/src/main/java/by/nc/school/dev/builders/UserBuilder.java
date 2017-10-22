package by.nc.school.dev.builders;

import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.enitities.User;

public abstract class UserBuilder {

    public abstract User build(UserDaoEntity userDaoEntity);
}
