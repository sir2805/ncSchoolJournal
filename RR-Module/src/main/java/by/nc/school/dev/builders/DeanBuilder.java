package by.nc.school.dev.builders;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.Dean;
import by.nc.school.dev.user.User;

public class DeanBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Dean(userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getStatus());
    }
}
