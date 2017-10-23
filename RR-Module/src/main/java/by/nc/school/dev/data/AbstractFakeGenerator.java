package by.nc.school.dev.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFakeGenerator<T>{

    protected final String filedir = "fakedb";
    protected String filepath;

    public abstract void serialize();

    public List<T> deserialize() {
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<T> entities = new ArrayList<>();
            T entity;
            while ((entity = (T) ois.readObject()) != null) {
                entities.add(entity);
            }
            return entities;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
