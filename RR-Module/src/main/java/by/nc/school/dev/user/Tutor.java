package by.nc.school.dev.user;

import by.nc.school.dev.Mark;
import by.nc.school.dev.Subject;
import by.nc.school.dev.abilities.TutorAbilities;

public class Tutor extends User implements TutorAbilities {

    private int groupId;

    public Tutor(String login, String password, String fullName, int groupId) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "group = " + groupId +
                ", login = '" + login + '\'' +
                ", password = '" + password + '\'' +
                ", full name = '" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tutor)) return false;
        if (!super.equals(o)) return false;

        Tutor tutor = (Tutor) o;

        return groupId == tutor.groupId;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + groupId;
        return result;
    }

    public void putMark(Student student, Mark mark, Subject subject) {

    }

    public void getGroup() {

    }

    public void getGroup(int groupId) {

    }

    public void getMarks(Subject subject, Student student) {

    }

    public void getExamMark(Subject subject, Student student) {

    }

    public void getAllmarks(Student student) {

    }
}
