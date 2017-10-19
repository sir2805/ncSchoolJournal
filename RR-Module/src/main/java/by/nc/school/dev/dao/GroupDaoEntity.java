package by.nc.school.dev.dao;

import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;

import java.util.List;

public class GroupDaoEntity extends BaseDaoEntity {

    private List<Student> students;
    private int groupId;
    private int groupNumber;
    private Tutor curator;

    public GroupDaoEntity(int id, List<Student> students, int groupId, int groupNumber, Tutor curator) {
        super(id);
        this.students = students;
        this.groupId = groupId;
        this.groupNumber = groupNumber;
        this.curator = curator;
    }

    @Override
    public String toString() {
        return "GroupDaoEntity{" +
                "students=" + students +
                ", groupId=" + groupId +
                ", groupNumber=" + groupNumber +
                ", curator=" + curator +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Tutor getCurator() {
        return curator;
    }
}
