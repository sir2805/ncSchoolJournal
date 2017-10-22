package by.nc.school.dev.services;

import by.nc.school.dev.builders.SubjectBuilder;
import by.nc.school.dev.dao.DaoFactory;
import by.nc.school.dev.dao.SubjectDao;
import by.nc.school.dev.dao.entities.SubjectDaoEntity;
import by.nc.school.dev.enitities.Subject;
import by.nc.school.dev.enitities.Tutor;

import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    public List<Subject> getTutorSubjects(Tutor tutor) {
        List<Subject> result = new ArrayList<>();
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        int tutorId = tutor.getId();
        List<SubjectDaoEntity> daoEntities = new DaoFactory().getSubjectDao().getSubjectsByTutorId(tutorId);
        for (SubjectDaoEntity entity : daoEntities) {
            result.add(subjectBuilder.build(entity));
        }
        return result;
    }

    public List<Subject> getAllSubjects() {
        List<Subject> result = new ArrayList<>();
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        List<SubjectDaoEntity> daoEntities = new DaoFactory().getSubjectDao().getAllSubjects();
        for (SubjectDaoEntity entity : daoEntities) {
            result.add(subjectBuilder.build(entity));
        }
        return result;
    }
}
