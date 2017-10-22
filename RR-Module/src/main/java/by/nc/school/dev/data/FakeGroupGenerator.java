package by.nc.school.dev.data;

import by.nc.school.dev.dao.entities.GroupDaoEntity;
import by.nc.school.dev.dao.entities.UserDaoEntity;

import java.io.*;
import java.util.*;

public class FakeGroupGenerator extends AbstractFakeGenerator<GroupDaoEntity>{

    private final String filepath = filedir + File.separator + "fakeGroups.txt";

    public void serialize() {

        List<UserDaoEntity> users = new FakeUserGenerator().deserialize();
        assert users != null;

        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            int curId = 1;
            Map<Integer, UserDaoEntity> tutors = new HashMap<>();
            for (UserDaoEntity entity : users) {
                if (entity.getStatus() == 2) {
                    tutors.put(entity.getGroupNumber(), entity);
                }
            }
            for (UserDaoEntity entity : users) {
                if (entity.getStatus() == 1) {
                    int studentId = entity.getId();
                    int groupNumber = entity.getGroupNumber();
                    int curatorId = tutors.get(groupNumber).getId();
                    GroupDaoEntity groupDaoEntity = new GroupDaoEntity(curId++, studentId, groupNumber, curatorId);
                    oos.writeObject(groupDaoEntity);
                }
            }
            oos.writeObject(null);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<GroupDaoEntity> deserialize() {
        List<GroupDaoEntity> entities = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            GroupDaoEntity groupDaoEntity;
            while ((groupDaoEntity = (GroupDaoEntity) ois.readObject()) != null) {
                entities.add(groupDaoEntity);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return entities;
    }
}
