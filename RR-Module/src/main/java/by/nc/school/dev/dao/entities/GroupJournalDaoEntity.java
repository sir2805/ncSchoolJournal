package by.nc.school.dev.dao.entities;

public class GroupJournalDaoEntity extends BaseDaoEntity {

    private int groupId;
    private int subjectId;
    private int subjectJournalId;

    public GroupJournalDaoEntity(int id, int groupId, int subjectId, int subjectJournalId) {
        super(id);
        this.groupId = groupId;
        this.subjectId = subjectId;
        this.subjectJournalId = subjectJournalId;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getSubjectJournalId() {
        return subjectJournalId;
    }
}
