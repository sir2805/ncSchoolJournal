package by.nc.school.dev.user;

import by.nc.school.dev.Group;
import by.nc.school.dev.Subject;
import by.nc.school.dev.abilities.DeanAbilities;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;
import by.nc.school.dev.user.User;

import java.util.List;

public class Dean extends User implements DeanAbilities {

    public Dean(String login, String password, String fullName) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public void addUser(User user) {

    }

    public void deleteUser(User user) {

    }

    public void addSubject(Subject subject, Group group) {

    }

    public void createWorkPlan(List<Subject> subjects, Group group) {

    }

    public void createGroup(List<Student> students, Tutor tutor) {

    }

    public void getMarks(Subject subject, Student student) {

    }

    public void getExamMark(Subject subject, Student student) {

    }

    public void getAllmarks(Student student) {

    }
}
