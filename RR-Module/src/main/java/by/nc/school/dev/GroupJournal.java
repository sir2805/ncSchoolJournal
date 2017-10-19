package by.nc.school.dev;

import java.util.Map;

public class GroupJournal {

    private Group group;
    private Map<Subject, SubjectJournal> journal;

    public Map<Subject, SubjectJournal> getJournal() {
        return journal;
    }

    public GroupJournal(Group group, Map<Subject, SubjectJournal> journal) {
        this.group = group;
        this.journal = journal;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
