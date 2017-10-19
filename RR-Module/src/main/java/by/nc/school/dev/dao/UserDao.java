package by.nc.school.dev.dao;

import by.nc.school.dev.data.FakeUserGenerator;

import java.io.IOException;
import java.util.List;

public class UserDao extends BaseDao<UserDaoEntity> {

    public UserDaoEntity findUserByUserName(String userName) {
        try {
            List<UserDaoEntity> entities =  FakeUserGenerator.deserialize();
            for (UserDaoEntity entity : entities) {
                if (userName.equals(entity.getUsername())) {
                    return entity;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void get(int id) {

    }

    public UserDaoEntity create(UserDaoEntity entity) {
        return entity;
    }

    public void update(UserDaoEntity entity) {

    }

    public void delete(UserDaoEntity entity) {

    }
}
