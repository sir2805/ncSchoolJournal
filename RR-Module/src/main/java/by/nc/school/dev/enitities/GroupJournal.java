package by.nc.school.dev.enitities;

import java.util.Map;

public class GroupJournal {

    private Map<Semester, GroupSemesterJournal>groupJournal;

    public GroupJournal(Map<Semester, GroupSemesterJournal> groupJournal) {
        this.groupJournal = groupJournal;
    }

    public Map<Semester, GroupSemesterJournal> getGroupJournal() {
        return groupJournal;
    }

    public void setGroupJournal(Map<Semester, GroupSemesterJournal> groupJournal) {
        this.groupJournal = groupJournal;
    }

    @Override
    public String toString() {
        return "GroupJournal{" +
                "groupJournal=" + groupJournal +
                '}';
    }
}
