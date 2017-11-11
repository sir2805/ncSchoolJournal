package by.nc.school.dev.enitities;

import by.nc.school.dev.enitities.Student;
import by.nc.school.dev.enitities.Tutor;

import java.util.List;

public class Group {

    private int groupNumber;
    private List<Student> students;
    private Curator curator;
    private Semester currentSemester;

    public Group(int groupNumber, List<Student> students, Curator curator, Semester currentSemester) {
        this.groupNumber = groupNumber;
        this.students = students;
        this.curator = curator;
        this.currentSemester = currentSemester;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", students=" + students +
                ", curator=" + curator +
                ", currentSemester=" + currentSemester +
                '}';
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public Semester getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(Semester currentSemester) {
        this.currentSemester = currentSemester;
    }
}
