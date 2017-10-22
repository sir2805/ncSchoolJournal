package by.nc.school.dev.data;

import by.nc.school.dev.dao.entities.UserDaoEntity;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FakeUserGenerator extends AbstractFakeGenerator<UserDaoEntity> {

    private final String filepath = filedir + File.separator + "fakeUsers.txt";
    private String[]logins = {
            "Patrice" ,
            "Collene" ,
            "Carlita" ,
            "Moises" ,
            "Collin" ,
            "Meg" ,
            "Domenic" ,
            "Hugo" ,
            "Rana" ,
            "Delicia" ,
            "Karla" ,
            "Marylouise" ,
            "Edda" ,
            "Georgiann" ,
            "Drucilla" ,
            "Brunilda" ,
            "Tristan" ,
            "Echo" ,
            "Felicitas" ,
            "Joan" ,
            "Vilma" ,
            "Dannette" ,
            "Donald" ,
            "Jeannie" ,
            "Terina" ,
            "Christiane" ,
            "Rasheeda" ,
            "Bibi" ,
            "Tracey" ,
            "Lottie" ,
            "Jeannetta" ,
            "Mellissa" ,
            "Sabra" ,
            "Glennie" ,
            "Andreas" ,
            "Drusilla" ,
            "Myra" ,
            "Carletta" ,
            "Roxy" ,
            "Niesha" ,
            "Lavon" ,
            "Elvin" ,
            "Vera" ,
            "Miranda" ,
            "Carleen" ,
            "Tessie" ,
            "Jeremy" ,
            "Libbie" ,
            "Valda" ,
            "Dulce" ,
            "aaa", "bbb", "ccc", "ddd", "admin", "roskach",
    };

    public void serialize() {
        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Random random = new Random();
            int id = 1;
            for (String login : logins) {
                String password = login + "1";
                String username = login + " Name";
                int status = 1;
                int groupId;
                groupId = random.nextInt(4) + 1;
                switch (login) {
                    case "admin":
                    case "roskach":
                        status = 3;
                        groupId = 0;
                        break;
                    case "aaa":
                        status = 2;
                        groupId = 1;
                        break;
                    case "bbb":
                        status = 2;
                        groupId = 2;

                        break;
                    case "ccc":
                        status = 2;
                        groupId = 3;

                        break;
                    case "ddd":
                        status = 2;
                        groupId = 4;
                        break;
                }
                oos.writeObject(new UserDaoEntity(id, login, password, username, status, groupId));
                id++;
            }
            oos.writeObject(null);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<UserDaoEntity> deserialize() {
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<UserDaoEntity> entities = new LinkedList<>();
            UserDaoEntity userDaoEntity;
            while ((userDaoEntity = (UserDaoEntity) ois.readObject()) != null) {
                entities.add(userDaoEntity);
            }
            return entities;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
