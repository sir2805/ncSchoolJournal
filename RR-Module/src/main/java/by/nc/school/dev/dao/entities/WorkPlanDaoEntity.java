package by.nc.school.dev.dao.entities;

public class WorkPlanDaoEntity extends BaseDaoEntity {
    private int groupNumber;
    private int subjectId;

    public WorkPlanDaoEntity(int id, int groupNumber, int subjectId) {
        super(id);
        this.groupNumber = groupNumber;
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkPlanDaoEntity)) return false;

        WorkPlanDaoEntity that = (WorkPlanDaoEntity) o;

        if (groupNumber != that.groupNumber) return false;
        return subjectId == that.subjectId;
    }

    @Override
    public int hashCode() {
        int result = groupNumber;
        result = 31 * result + subjectId;
        return result;
    }

    @Override
    public String toString() {
        return "WorkPlanDaoEntity{" +
                "groupNumber=" + groupNumber +
                ", subjectId=" + subjectId +
                '}';
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getSubjectId() {
        return subjectId;
    }
}
