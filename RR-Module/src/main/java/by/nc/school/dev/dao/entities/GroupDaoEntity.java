package by.nc.school.dev.dao.entities;

public class GroupDaoEntity extends BaseDaoEntity {

    private int studentsId;
    private int groupNumber;
    private int curatorId;

    public GroupDaoEntity(int id, int studentsId, int groupNumber, int curatorId) {
        super(id);
        this.studentsId = studentsId;
        this.groupNumber = groupNumber;
        this.curatorId = curatorId;
    }

    @Override
    public String toString() {
        return super.toString() + "GroupDaoEntity{" +
                "studentsId=" + studentsId +
                ", groupNumber=" + groupNumber +
                ", curatorId=" + curatorId +
                '}';
    }

    public int getStudentsId() {
        return studentsId;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getCuratorId() {
        return curatorId;
    }
}
