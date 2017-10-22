package by.nc.school.dev.services;

import by.nc.school.dev.enitities.*;

import java.util.List;
import java.util.Map;

public class MarkService {

    public List<Mark> getMarks(Student student, Subject subject, GroupJournal groupJournal) {
        Map<Subject, SubjectJournal> journal = groupJournal.getJournal();
        return journal.get(subject).getStudentMarks(student);
    }

    public Mark getExamMark(Student student, Subject subject, GroupJournal groupJournal) {

        return null;
    }

    public Map<Subject, List<Mark>> getAllmarks(Student student, GroupJournal groupJournal) {
        return null;
    }

    public void putMark(Tutor tutor, Mark mark, Subject subject, Student student, GroupJournal groupJournal) {
        Map<Subject, SubjectJournal> journal = groupJournal.getJournal();
        SubjectJournal subjectJournal = journal.get(subject);
        if (subjectJournal == null) {
            throw new RuntimeException("subjectJournal is null");
        }
        subjectJournal.getMarksList().get(student).add(mark);
        //TODO dao integration
    }
}
