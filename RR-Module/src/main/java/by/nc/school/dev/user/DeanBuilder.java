package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;

public class DeanBuilder extends UserBuilder {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Dean(userDaoEntity.getUsername(),
                        userDaoEntity.getPassword(),
                        userDaoEntity.getFullName());
    }
}
