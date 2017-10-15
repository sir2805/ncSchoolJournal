package by.nc.school.dev.user;

import by.nc.school.dev.DAO.UserDaoEntity;

public class TutorFactory extends UserFactory {

    public User createUser(UserDaoEntity userDaoEntity) {
        return new Tutor(userDaoEntity.getUsername(),
                userDaoEntity.getPassword(),
                userDaoEntity.getFullName(),
                userDaoEntity.getGroupId());
    }
}
