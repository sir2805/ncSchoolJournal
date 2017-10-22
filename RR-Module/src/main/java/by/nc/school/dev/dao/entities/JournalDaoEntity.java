package by.nc.school.dev.dao.entities;

public class JournalDaoEntity extends BaseDaoEntity {

    private int subjectId;
    private int studentId;
    private int mark;
    private boolean isExam;

    public JournalDaoEntity(int id, int subjectId, int studentId, int mark, boolean isExam) {
        super(id);
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.mark = mark;
        this.isExam = isExam;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean isExam() {
        return isExam;
    }
}
