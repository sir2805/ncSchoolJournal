package by.nc.school.dev.dao;

import by.nc.school.dev.data.FakeUserGenerator;

import java.io.IOException;
import java.util.List;

public class UserDao extends BaseDao<UserDaoEntity> {

    private List<UserDaoEntity> entities;

    public UserDaoEntity findUserByUserName(String userName) {
        if (entities == null) {
            entities = new FakeUserGenerator().deserialize();
        }
        for (UserDaoEntity entity : entities) {
            if (userName.equals(entity.getUsername())) {
                return entity;
            }
        }
        return null;
    }

    public UserDaoEntity get(int id) {
        if (entities == null) {
            entities = new FakeUserGenerator().deserialize();
        }
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
