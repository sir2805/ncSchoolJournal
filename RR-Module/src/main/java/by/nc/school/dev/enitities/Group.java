package by.nc.school.dev.enitities;

import java.util.List;

public class Group extends BaseEntity {

    private int groupNumber;
    private List<Student> students;
    private Curator curator;

    public Group(int id, int groupNumber, List<Student> students, Curator curator, Semester currentSemester) {
        super(id);
        this.groupNumber = groupNumber;
        this.students = students;
        this.curator = curator;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", students=" + students +
                ", curator=" + curator +
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

}
