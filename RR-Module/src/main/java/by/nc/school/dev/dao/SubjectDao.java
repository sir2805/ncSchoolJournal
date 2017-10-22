package by.nc.school.dev.dao;

import by.nc.school.dev.dao.entities.SubjectDaoEntity;
import by.nc.school.dev.data.FakeSubjectGenerator;

import java.util.ArrayList;
import java.util.List;

public class SubjectDao extends BaseDao<SubjectDaoEntity> {

    private List<SubjectDaoEntity> entities;

    public SubjectDao() {
        this.entities = new FakeSubjectGenerator().deserialize();
    }

    @Override
    public SubjectDaoEntity get(int id) {
        for (SubjectDaoEntity entity : entities) {
            if (id == entity.getId()) {
                return entity;
            }
        }
        return null;
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
