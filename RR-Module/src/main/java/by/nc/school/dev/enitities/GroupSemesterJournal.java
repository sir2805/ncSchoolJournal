package by.nc.school.dev.enitities;

import java.util.Map;

public class GroupSemesterJournal {

    private Group group;
    private Map<Subject, GroupSubjectJournal> journal;

    public Map<Subject, GroupSubjectJournal> getJournal() {
        return journal;
    }

    public GroupSemesterJournal(Group group, Map<Subject, GroupSubjectJournal> journal) {
        this.group = group;
        this.journal = journal;
    }

    @Override
    public String toString() {
        return "GroupSemesterJournal{" +
                "group=" + group +
                ", journal=" + journal +
                '}';
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setJournal(Map<Subject, GroupSubjectJournal> journal) {
        this.journal = journal;
    }
}
