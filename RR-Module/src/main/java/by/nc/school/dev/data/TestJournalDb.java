package by.nc.school.dev.data;

import by.nc.school.dev.dao.entities.JournalDaoEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestJournalDb {

    private final String filedir = "fakedb";
    private final String filepath = filedir + File.separator + "testJournal.txt";

    public void serialize(List<JournalDaoEntity> entities) {
        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (JournalDaoEntity entity : entities) {
                oos.writeObject(entity);
            }
            oos.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<JournalDaoEntity> deserialize() {
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<JournalDaoEntity> entities = new ArrayList<>();
            JournalDaoEntity journalDaoEntity;
            while ((journalDaoEntity = (JournalDaoEntity) ois.readObject()) != null) {
                entities.add(journalDaoEntity);
            }
            return entities;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
