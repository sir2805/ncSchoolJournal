package by.nc.school.dev.dao.entities;

public class SubjectJournalDaoEntity extends BaseDaoEntity {

    private int userId;
    private int markValue;
    private boolean markIsExam;

    public SubjectJournalDaoEntity(int id, int userId, int markValue, boolean markIsExam) {
        super(id);
        this.userId = userId;
        this.markValue = markValue;
        this.markIsExam = markIsExam;
    }

    @Override
    public String toString() {
        return "SubjectJournalDaoEntity{" +
                "userId=" + userId +
                ", markValue=" + markValue +
                ", markIsExam=" + markIsExam +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public int getMarkValue() {
        return markValue;
    }

    public boolean isMarkIsExam() {
        return markIsExam;
    }
}
