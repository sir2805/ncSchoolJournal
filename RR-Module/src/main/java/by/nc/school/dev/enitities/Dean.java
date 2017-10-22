package by.nc.school.dev.enitities;

public class Dean extends User {

    public Dean(int id, String login, String password, String fullName) {
        super(id, login, password, fullName);
    }

    @Override
    public String toString() {
        return "Dean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
