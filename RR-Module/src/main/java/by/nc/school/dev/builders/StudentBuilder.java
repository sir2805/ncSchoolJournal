package by.nc.school.dev.builders;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.User;

public class StudentBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Student(userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getStatus(),
                userDaoEntity.getGroupId());
    }
}
