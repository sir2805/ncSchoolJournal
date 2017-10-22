package by.nc.school.dev.enitities;

import java.util.List;
import java.util.Map;

public class WorkPlan {

    private Map<Integer, List<Subject>> plan;

    public WorkPlan(Map<Integer, List<Subject>> plan) {
        this.plan = plan;
    }

    public Map<Integer, List<Subject>> getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "WorkPlan{" +
                "plan=" + plan +
                '}';
    }
}
