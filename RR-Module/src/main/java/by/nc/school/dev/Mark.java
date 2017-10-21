package by.nc.school.dev;

public class Mark {

    private int mark;
    private int isExam;

    public Mark(int mark, int isExam) {
        this.mark = mark;
        this.isExam = isExam;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "mark=" + mark +
                ", isExam=" + isExam +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark mark1 = (Mark) o;

        if (mark != mark1.mark) return false;
        return isExam == mark1.isExam;
    }

    @Override
    public int hashCode() {
        int result = mark;
        result = 31 * result + isExam;
        return result;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getIsExam() {
        return isExam;
    }

    public void setIsExam(int isExam) {
        this.isExam = isExam;
    }
}
