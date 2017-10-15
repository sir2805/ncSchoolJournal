package by.nc.school.dev.data;

import by.nc.school.dev.DAO.UserDaoEntity;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FakeUserGenerator {

    private static final String filepath = "fakeUserList.txt";

    private static final String[]logins = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "admin", "roskach"};

//    static final String[]passwords = {"aa", "bb", "cc", "admin", "roskach"};
//
//    static final String[]fullNames = {"Aaa", "Bbb", "Ccc", "Admin", "Roskach Roman"};
//
//    static final int[]statuses = {0, 0, 0, 2, 1};
//
//    static final int[]groupIds = {2, 2, 2, 0, 3};

    public static void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream(filepath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Random random = new Random();
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
            oos.writeObject(new UserDaoEntity(login, password, username, status, groupId));
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
