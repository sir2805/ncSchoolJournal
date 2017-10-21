package by.nc.school.dev.dao;


import java.util.List;

public class GroupDaoEntity extends BaseDaoEntity {

    private List<Integer> students;
    private int groupNumber;
    private int curatorId;

    public GroupDaoEntity(int id, List<Integer> students, int groupNumber, int curatorId) {
        super(id);
        this.students = students;
        this.groupNumber = groupNumber;
        this.curatorId = curatorId;
    }

    @Override
    public String toString() {
        return super.toString() + "GroupDaoEntity{" +
                "students=" + students +
                ", groupNumber=" + groupNumber +
                ", curatorId=" + curatorId +
                '}';
    }

    public List<Integer> getStudentsIds() {
        return students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getCuratorId() {
        return curatorId;
    }
}
