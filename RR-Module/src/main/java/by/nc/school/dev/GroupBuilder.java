package by.nc.school.dev;

import by.nc.school.dev.dao.GroupDaoEntity;
import by.nc.school.dev.dao.UserDao;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.StudentBuilder;
import by.nc.school.dev.user.Tutor;
import by.nc.school.dev.user.TutorBuilder;

import java.util.ArrayList;
import java.util.List;

public class GroupBuilder {

    public Group build(GroupDaoEntity groupDaoEntity) {
        UserDao userDao = new UserDao();
        List<Student> students = new ArrayList<>();
        StudentBuilder studentBuilder = new StudentBuilder();
        for (Integer studentId : groupDaoEntity.getStudentsIds()) {
            students.add((Student) studentBuilder.build(userDao.get(studentId)));
        }
        Tutor curator = (Tutor) new TutorBuilder().build(userDao.get(groupDaoEntity.getCuratorId()));
        int groupId = groupDaoEntity.getId();
        int groupNumber = groupDaoEntity.getGroupNumber();
        return new Group(groupNumber, groupId, students, curator);
    }
}
