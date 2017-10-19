package by.nc.school.dev.user;

import by.nc.school.dev.dao.UserDaoEntity;

public class TutorBuilder extends UserBuilder {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Tutor(userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getGroupId());
    }
}
