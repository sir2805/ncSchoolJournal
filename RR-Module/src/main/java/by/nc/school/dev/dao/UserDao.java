package by.nc.school.dev.dao;

import by.nc.school.dev.Role;
import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.data.FakeUserGenerator;

import java.util.ArrayList;
import java.util.List;

public class UserDao extends BaseDao<UserDaoEntity> {

    public UserDao() {
        this.entities = new FakeUserGenerator().deserialize();
    }

    public UserDaoEntity getUserByUserName(String userName) {
        for (UserDaoEntity entity : entities) {
            if (userName.equals(entity.getUsername())) {
                return entity;
            }
        }
        return null;
    }

    public UserDaoEntity getUserByFullName(String fullName) {
        for (UserDaoEntity entity : entities) {
            if (fullName.equals(entity.getFullName())) {
                return entity;
            }
        }
        return null;
    }

    public List<UserDaoEntity> getTutors() {
        List<UserDaoEntity> result = new ArrayList<>();
        for (UserDaoEntity entity : entities) {
            if (entity.getStatus() == Role.TUTOR || entity.getStatus() == Role.CURATOR) {
                result.add(entity);
            }
        }
        return result;
    }

    public UserDaoEntity create(UserDaoEntity entity) {
        return null;
    }

    public void update(UserDaoEntity entity) {
        UserDaoEntity oldEntity = get(entity.getId());
        entities.remove(oldEntity);
        entities.add(entity);
    }

    public void delete(UserDaoEntity entity) {
        entities.remove(entity);
    }
}
