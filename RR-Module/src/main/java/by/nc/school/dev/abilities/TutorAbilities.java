package by.nc.school.dev.abilities;

import by.nc.school.dev.Mark;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.Subject;

public interface TutorAbilities extends StaffAbilities {
    void putMark(Student student, Mark mark, Subject subject);
    void getGroup();
    void getGroup(int groupId);
}
