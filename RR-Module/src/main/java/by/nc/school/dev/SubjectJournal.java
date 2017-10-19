package by.nc.school.dev;

import by.nc.school.dev.user.Student;
import by.nc.school.dev.user.Tutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubjectJournal {

    private Map<Student, List<Mark>> marksList;
    private Tutor tutor;

    public Map<Student, List<Mark>> getMarksList() {
        return marksList;
    }

    public List<Mark> getStudentMarks(Student student) {
        return marksList.get(student);
    }

    public SubjectJournal(Map<Student, List<Mark>> marksList, Tutor tutor) {
        this.marksList = marksList;
        this.tutor = tutor;
    }

    public SubjectJournal(List<Student> students, Tutor tutor) {
        this.marksList = new HashMap<Student, List<Mark>>();
        for (Student student : students) {
            marksList.put(student, new ArrayList<Mark>());
        }
        this.tutor = tutor;
    }
}
