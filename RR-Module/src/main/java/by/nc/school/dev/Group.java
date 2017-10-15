package by.nc.school.dev;

import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;

import java.util.List;

public class Group {
    int groupNumber;
    int groupId;
    List<Student> students;
    Tutor curator;

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", groupId=" + groupId +
                ", students=" + students +
                ", curator=" + curator +
                '}';
    }
}
