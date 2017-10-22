package by.nc.school.dev.enitities;

import by.nc.school.dev.enitities.Student;
import by.nc.school.dev.enitities.Tutor;

import java.util.List;

public class Group {

    private int groupNumber;
    private List<Student> students;
    private Curator curator;

    public Group(int groupNumber, List<Student> students, Curator curator) {
        this.groupNumber = groupNumber;
        this.students = students;
        this.curator = curator;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public int getGroupNumber() {
        return groupNumber;
    }


    public List<Student> getStudents() {
        return students;
    }

    public Tutor getCurator() {
        return curator;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", students=" + students +
                ", curator=" + curator +
                '}';
    }
}
