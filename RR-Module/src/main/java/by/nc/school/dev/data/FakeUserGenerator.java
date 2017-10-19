package by.nc.school.dev.data;

import by.nc.school.dev.dao.UserDaoEntity;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FakeUserGenerator {

    private static final String filepath = "fakeUserList.txt";
    private static final String[]logins = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "admin", "roskach"};

    public static void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream(filepath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Random random = new Random();
        int id = 1;
        for (String login : logins) {
            String password = login + "1";
            String username = login + " Name";
            int status = random.nextInt(3);
            int groupId;
            if (status == 0) {
                groupId = 0;
            } else {
                groupId = random.nextInt(5);
            }
            oos.writeObject(new UserDaoEntity(id, login, password, username, status, groupId));
            id++;
        }
        oos.writeObject(null);
        oos.flush();
        oos.close();
    }

    public static List<UserDaoEntity> deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filepath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<UserDaoEntity> entities = new LinkedList<UserDaoEntity>();
        UserDaoEntity userDaoEntity;
        while ((userDaoEntity = (UserDaoEntity) ois.readObject()) != null) {
            entities.add(userDaoEntity);
        }
        return entities;
    }
}
