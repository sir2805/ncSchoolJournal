package by.nc.school.dev.enitities;

public class Tutor extends User {

    public Tutor(int id, String login, String password, String fullName) {
        super(id, login, password, fullName);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
