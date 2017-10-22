package by.nc.school.dev.enitities;

public class Tutor extends User {

    public Tutor(int id, String login, String password, String fullName) {
        super(id, login, password, fullName);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
