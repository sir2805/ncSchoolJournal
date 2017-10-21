package by.nc.school.dev.user;

public class Dean extends User {

    public Dean(String login, String password, String fullName, int status) {
        super(login, password, fullName, status);
    }

    @Override
    public String toString() {
        return "Dean{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
