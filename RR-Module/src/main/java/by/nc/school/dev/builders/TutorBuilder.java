package by.nc.school.dev.builders;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.Tutor;
import by.nc.school.dev.user.User;

public class TutorBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Tutor(userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getStatus(),
                userDaoEntity.getGroupId());
    }
}
