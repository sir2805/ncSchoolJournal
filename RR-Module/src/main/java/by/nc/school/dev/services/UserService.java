package by.nc.school.dev.services;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.*;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<Integer, UserBuilder> userBuilders = new HashMap<>();

    public UserService() {
        userBuilders.put(1, new StudentBuilder());
        userBuilders.put(2, new TutorBuilder());
        userBuilders.put(3, new DeanBuilder());
    }

    public User getUser(UserDaoEntity userDaoEntity) {
        int status = userDaoEntity.getStatus();
        if (status > 3 || status <= 0) {
            throw new UnsupportedOperationException("Invalid status");
        } else {
            return userBuilders.get(status).build(userDaoEntity);
        }
    }
}