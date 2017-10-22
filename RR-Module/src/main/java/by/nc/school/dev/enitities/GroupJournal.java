package by.nc.school.dev.enitities;

import java.util.Map;

public class GroupJournal {

    private Group group;
    private Map<Subject, GroupSubjectJournal> journal;

    public Map<Subject, GroupSubjectJournal> getJournal() {
        return journal;
    }

    public GroupJournal(Group group, Map<Subject, GroupSubjectJournal> journal) {
        this.group = group;
        this.journal = journal;
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
