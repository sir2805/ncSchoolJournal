package by.nc.school.dev.userservices;

import by.nc.school.dev.Group;
import by.nc.school.dev.Mark;
import by.nc.school.dev.Subject;
import by.nc.school.dev.SubjectJournal;
import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;

import java.util.List;
import java.util.Map;

public class MarkService {

    public List<Mark> getMarks(Student student, Subject subject, Group group) {
        Map<Subject, SubjectJournal> journal = group.getJournal();
        return journal.get(subject).getStudentMarks(student);
    }

    public Mark getExamMark(Student student, Subject subject, Group group) {

        return null;
    }

    public Map<Subject, List<Mark>> getAllmarks(Student student, Group group) {
        return null;
    }

    public void putMark(Tutor tutor, Mark mark, Subject subject, Student student, Group group) {
        Map<Subject, SubjectJournal> journal = group.getJournal();
        SubjectJournal subjectJournal = journal.get(subject);
        if (subjectJournal == null) {
            throw new RuntimeException("subjectJournal is null");
        }
        subjectJournal.getMarksList().get(student).add(mark);
        //TODO Dao integration
    }
}
