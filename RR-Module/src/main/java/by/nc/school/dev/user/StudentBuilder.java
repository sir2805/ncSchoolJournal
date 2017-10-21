package by.nc.school.dev.user;

import by.nc.school.dev.dao.UserDaoEntity;

public class StudentBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Student(userDaoEntity.getUsername(),
                           userDaoEntity.getPassword(),
                           userDaoEntity.getFullName(),
                           userDaoEntity.getGroupId());
    }
}
