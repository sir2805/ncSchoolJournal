package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;

public class StudentBuilder extends UserBuilder {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Student(userDaoEntity.getUsername(),
                           userDaoEntity.getPassword(),
                           userDaoEntity.getFullName(),
                           userDaoEntity.getGroupId());
    }
}
