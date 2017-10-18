package by.nc.school.dev.user;


public class Student extends User {

    private int groupId;

    public Student(String login, String password, String fullName, int groupId) {
        super(login, password, fullName);
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
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
}
