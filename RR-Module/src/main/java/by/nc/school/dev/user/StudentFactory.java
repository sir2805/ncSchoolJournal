package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.User;
import by.nc.school.dev.user.UserFactory;

public class StudentFactory extends UserFactory {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Student(userDaoEntity.getUsername(),
                           userDaoEntity.getPassword(),
                           userDaoEntity.getFullName(),
                           userDaoEntity.getGroupId());
    }
}
