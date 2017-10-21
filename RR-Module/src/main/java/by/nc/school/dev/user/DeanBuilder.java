package by.nc.school.dev.user;

import by.nc.school.dev.dao.UserDaoEntity;

public class DeanBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Dean(userDaoEntity.getUsername(),
                        userDaoEntity.getPassword(),
                        userDaoEntity.getFullName());
    }
}
