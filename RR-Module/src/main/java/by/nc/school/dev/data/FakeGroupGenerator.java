package by.nc.school.dev.data;

import by.nc.school.dev.Role;
import by.nc.school.dev.dao.entities.GroupDaoEntity;
import by.nc.school.dev.dao.entities.UserDaoEntity;

import java.io.*;
import java.util.*;

public class FakeGroupGenerator extends AbstractFakeGenerator<GroupDaoEntity>{

    public FakeGroupGenerator() {
        this.filepath = filedir + File.separator + "fakeGroups.txt";
    }

    @Override
    public void serialize() {

        List<UserDaoEntity> users = new FakeUserGenerator().deserialize();
        assert users != null;

        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            int curId = 1;
            Map<Integer, UserDaoEntity> tutors = new HashMap<>();
            for (UserDaoEntity entity : users) {
                if (entity.getStatus() == Role.TUTOR || entity.getStatus() == Role.CURATOR) {
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
}
