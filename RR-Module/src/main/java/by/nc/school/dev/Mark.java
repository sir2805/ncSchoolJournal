package by.nc.school.dev;

public class Mark {

    private int mark;
    private int priority;
    private int isExam;

    public Mark(int mark, int priority, int isExam) {

        this.mark = mark;
        this.priority = priority;
        this.isExam = isExam;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "mark=" + mark +
                ", priority=" + priority +
                ", isExam=" + isExam +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark mark1 = (Mark) o;

        if (mark != mark1.mark) return false;
        if (priority != mark1.priority) return false;
        return isExam == mark1.isExam;
    }

    @Override
    public int hashCode() {
        int result = mark;
        result = 31 * result + priority;
        result = 31 * result + isExam;
        return result;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getIsExam() {
        return isExam;
    }

    public void setIsExam(int isExam) {
        this.isExam = isExam;
    }
}
