package by.nc.school.dev.builders;

import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.enitities.Dean;
import by.nc.school.dev.enitities.User;

public class DeanBuilder extends AbstractUserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Dean(userDaoEntity.getId(),
                userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName());
    }
}
