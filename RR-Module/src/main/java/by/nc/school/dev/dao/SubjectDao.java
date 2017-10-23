package by.nc.school.dev.dao;

import by.nc.school.dev.dao.entities.SubjectDaoEntity;
import by.nc.school.dev.data.FakeSubjectGenerator;

import java.util.ArrayList;
import java.util.List;

public class SubjectDao extends BaseDao<SubjectDaoEntity> {

    public SubjectDao() {
        this.entities = new FakeSubjectGenerator().deserialize();
    }

    public List<SubjectDaoEntity> getAllSubjects() {
        return entities;
    }

    public List<SubjectDaoEntity> getSubjectsByTutorId(int tutorId) {
        List<SubjectDaoEntity>result = new ArrayList<>();
        for (SubjectDaoEntity entity : entities) {
            if (entity.getTutorId() == tutorId) {
                result.add(entity);
            }
        }
        return result;
    }

    public SubjectDaoEntity getSubjectBySubjectName(String subjectName) {
        for (SubjectDaoEntity entity : entities) {
            if (entity.getName().equals(subjectName)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public SubjectDaoEntity create(SubjectDaoEntity entity) {
        return null;
    }

    @Override
    public void update(SubjectDaoEntity entity) {

    }

    @Override
    public void delete(SubjectDaoEntity entity) {

    }
}
