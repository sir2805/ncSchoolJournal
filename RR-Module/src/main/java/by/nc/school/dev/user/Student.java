package by.nc.school.dev.user;

import by.nc.school.dev.Subject;
import by.nc.school.dev.abilities.StudentAbilities;

public class Student extends User implements StudentAbilities {

    private int groupId;

    public Student(String login, String password, String fullName, int groupId) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group = " + groupId +
                ", login = '" + login + '\'' +
                ", password = '" + password + '\'' +
                ", full name = '" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return groupId == student.groupId;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + groupId;
        return result;
    }

    public void getMarks(Subject subject) {

    }

    public void getExamMark(Subject subject) {

    }

    public void getAllmarks() {

    }

    public void getGroup() {

    }
}
