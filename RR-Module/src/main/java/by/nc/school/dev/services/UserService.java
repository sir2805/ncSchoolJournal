package by.nc.school.dev.services;

import by.nc.school.dev.dao.UserDaoEntity;
import by.nc.school.dev.user.*;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<Integer, UserBuilder> userBuilders = new HashMap<Integer, UserBuilder>();

    public UserService() {
        userBuilders.put(0, new StudentBuilder());
        userBuilders.put(1, new TutorBuilder());
        userBuilders.put(2, new DeanBuilder());
    }

    public User getUser(UserDaoEntity userDaoEntity) {
        int status = userDaoEntity.getStatus();
        if (status > 2) {
            throw new UnsupportedOperationException("Invalid status");
        } else {
            return userBuilders.get(status).createUser(userDaoEntity);
        }
    }
}
