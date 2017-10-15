package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;
import by.nc.school.dev.user.Dean;
import by.nc.school.dev.user.User;
import by.nc.school.dev.user.UserFactory;

public class DeanFactory extends UserFactory {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Dean(userDaoEntity.getUsername(),
                        userDaoEntity.getPassword(),
                        userDaoEntity.getFullName());
    }
}
