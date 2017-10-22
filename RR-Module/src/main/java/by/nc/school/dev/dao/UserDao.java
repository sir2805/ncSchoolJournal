package by.nc.school.dev.dao;

import by.nc.school.dev.Status;
import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.data.FakeUserGenerator;

import java.util.ArrayList;
import java.util.List;

public class UserDao extends BaseDao<UserDaoEntity> {

    private List<UserDaoEntity> entities;

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

    public List<UserDaoEntity> getTutors() {
        List<UserDaoEntity> result = new ArrayList<>();
        for (UserDaoEntity entity : entities) {
            if (entity.getStatus() == Status.TUTOR) {
                result.add(entity);
            }
        }
        return result;
    }

    public UserDaoEntity get(int id) {
        for (UserDaoEntity entity : entities) {
            if (id == entity.getId()) {
                return entity;
            }
        }
        return null;
    }

    public UserDaoEntity create(UserDaoEntity entity) {
        return entity;
    }

    public void update(UserDaoEntity entity) {

    }

    public void delete(UserDaoEntity entity) {

    }
}
