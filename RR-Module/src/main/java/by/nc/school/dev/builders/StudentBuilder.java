package by.nc.school.dev.builders;

import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.enitities.Student;
import by.nc.school.dev.enitities.User;

public class StudentBuilder extends UserBuilder {

    public User build(UserDaoEntity userDaoEntity) {
        return new Student(userDaoEntity.getId(),
                userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getGroupNumber());
    }
}
