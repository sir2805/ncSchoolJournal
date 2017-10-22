package by.nc.school.dev.services;

import by.nc.school.dev.Status;
import by.nc.school.dev.builders.*;
import by.nc.school.dev.dao.entities.UserDaoEntity;
import by.nc.school.dev.enitities.*;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<Integer, UserBuilder> userBuilders = new HashMap<>();

    public UserService() {
        userBuilders.put(Status.STUDENT, new StudentBuilder());
        userBuilders.put(Status.TUTOR, new TutorBuilder());
        userBuilders.put(Status.CURATOR, new CuratorBuilder());
        userBuilders.put(Status.DEAN, new DeanBuilder());
    }

    public User getUser(UserDaoEntity userDaoEntity) {
        int status = userDaoEntity.getStatus();
        if (status > 4 || status <= 0) {
            throw new UnsupportedOperationException("Invalid status");
        } else {
            return userBuilders.get(status).build(userDaoEntity);
        }
    }
}