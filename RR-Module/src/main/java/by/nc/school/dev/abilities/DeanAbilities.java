package by.nc.school.dev.abilities;


import by.nc.school.dev.*;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;
import by.nc.school.dev.user.User;

import java.util.List;

public interface DeanAbilities extends StaffAbilities {
    void addUser(User user);
    void deleteUser(User user);
    void addSubject(Subject subject, Group group);
    void createWorkPlan(List<Subject> subjects, Group group);
    void createGroup(List<Student> students, Tutor tutor);
}
