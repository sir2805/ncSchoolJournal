package by.nc.school.dev.abilities;

import by.nc.school.dev.user.Student;
import by.nc.school.dev.Subject;

public interface StaffAbilities {
    void getMarks(Subject subject, Student student);
    void getExamMark(Subject subject, Student student);
    void getAllmarks(Student student);
}
