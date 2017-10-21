package by.nc.school.dev.data;

import by.nc.school.dev.dao.GroupDaoEntity;
import by.nc.school.dev.dao.UserDaoEntity;

import java.io.*;
import java.util.*;

public class FakeGroupGenerator {

    private List<String> filepaths = new LinkedList<>();
    private final String filedir = "fakedb" + File.separator;
    private int groupSize = 4;

    public FakeGroupGenerator() {
        for (int i = 1; i <= groupSize; i++) {
            filepaths.add(filedir + "fakeGroup" + String.valueOf(i) + ".txt");
        }
    }

    @Override
    public String toString() {
        return "FakeGroupGenerator{" +
                "filepaths=" + filepaths +
                ", groupSize=" + groupSize +
                '}';
    }

    public void serialize() {

        List<UserDaoEntity> users = new FakeUserGenerator().deserialize();

        Map<Integer, List<Integer>> studentsInGroup = new HashMap<>();
        List<Integer> curators = new ArrayList<>();
        for (int i = 1; i <= groupSize; i++) {
            studentsInGroup.put(i, new ArrayList<>());
        }

        assert users != null;

        for (UserDaoEntity user : users) {
            if (user.getStatus() == 1) {
                studentsInGroup.get(user.getGroupId()).add(user.getId());
            } else if (user.getStatus() == 2) {
                if (curators.size() < groupSize) {
                    curators.add(user.getId());
                }
            }
        }

        for (Integer currentGroupNumber : studentsInGroup.keySet()) {
            try (FileOutputStream fos = new FileOutputStream(filepaths.get(currentGroupNumber - 1));
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                GroupDaoEntity groupDaoEntity = new GroupDaoEntity(currentGroupNumber,
                        studentsInGroup.get(currentGroupNumber), currentGroupNumber,
                        curators.get(currentGroupNumber - 1));
                oos.writeObject(groupDaoEntity);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<GroupDaoEntity> deserialize() {
        List<GroupDaoEntity> entities = new ArrayList<>();
        for (String groupPath : filepaths) {
            try (FileInputStream fis = new FileInputStream(groupPath);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                GroupDaoEntity groupDaoEntity = (GroupDaoEntity) ois.readObject();
                if (groupDaoEntity != null) {
                    entities.add(groupDaoEntity);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return entities;
    }
}
