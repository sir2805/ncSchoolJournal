package by.nc.school.dev.enitities;

public class Semester extends BaseEnitity {
    private int semesterNumber;

    public Semester(int id, int semesterNumber) {
        super(id);
        this.semesterNumber = semesterNumber;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }
}
