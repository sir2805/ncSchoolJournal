package by.nc.school.dev.data;

import by.nc.school.dev.dao.UserDao;
import by.nc.school.dev.dao.entities.SubjectDaoEntity;
import by.nc.school.dev.dao.entities.UserDaoEntity;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FakeSubjectGenerator extends AbstractFakeGenerator<SubjectDaoEntity> {

    private final String filepath = filedir + File.separator + "fakeSubjects.txt";
    private final String[] subjectNames = {
            "Remedial Math",
            "Fundamental Math or Basic Math",
            "Mathematics",
            "Pre-Algebra",
            "Introduction to Algebra",
            "Algebra",
            "Geometry",
            "Trigonometry",
            "Statistics"};

    @Override
    public void serialize() {
        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            int id = 1;
            List<UserDaoEntity> tutors = new UserDao().getTutors();
            int tutorsPos = 0;
            for (String subjectName : subjectNames) {
                if (tutorsPos == tutors.size()) {
                    tutorsPos = 0;
                }
                SubjectDaoEntity subjectDaoEntity = new SubjectDaoEntity(id++, subjectName, tutors.get(tutorsPos++).getId());
                oos.writeObject(subjectDaoEntity);
            }
            oos.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SubjectDaoEntity> deserialize() {
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<SubjectDaoEntity> entities = new LinkedList<>();
            SubjectDaoEntity subjectDaoEntity;
            while ((subjectDaoEntity = (SubjectDaoEntity) ois.readObject()) != null) {
                entities.add(subjectDaoEntity);
            }
            return entities;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
