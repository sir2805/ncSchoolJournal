package by.nc.school.dev.enitities;

import java.util.List;
import java.util.Map;

public class WorkPlan {

    private Map<Integer, List<Subject>> plan;
    private Semester semester;

    public WorkPlan(Map<Integer, List<Subject>> plan, Semester semester) {
        this.plan = plan;
        this.semester = semester;
    }

    public Semester getSemester() {
        return semester;
    }

    public Map<Integer, List<Subject>> getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "WorkPlan{" +
                "plan=" + plan +
                ", semester=" + semester +
                '}';
    }
}
