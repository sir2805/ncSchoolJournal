package by.nc.school.dev.data;

import by.nc.school.dev.dao.entities.SubjectDaoEntity;
import by.nc.school.dev.dao.entities.WorkPlanDaoEntity;

import java.io.*;
import java.util.List;
import java.util.Random;

public class FakeWorkPlanGenerator extends AbstractFakeGenerator <WorkPlanDaoEntity> {

    public FakeWorkPlanGenerator() {
        this.filepath = filedir + File.separator + "fakeWorkPlan.txt";
    }

    @Override
    public void serialize() {
        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            List<SubjectDaoEntity> subjectDaoEntities = new FakeSubjectGenerator().deserialize();
            Random random = new Random();
            for (SubjectDaoEntity subjectDaoEntity : subjectDaoEntities) {
                int subjectId = subjectDaoEntity.getId();
                int groupNumber = random.nextInt(4) + 1;
                oos.writeObject(new WorkPlanDaoEntity((int)System.currentTimeMillis(), groupNumber, subjectId));
            }
            oos.writeObject(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
