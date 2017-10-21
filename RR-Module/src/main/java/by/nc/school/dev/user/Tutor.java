package by.nc.school.dev.user;

public class Tutor extends User {

    private int groupId;

    public Tutor(String login, String password, String fullName, int status, int groupId) {
        super(login, password, fullName, status);
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
}
