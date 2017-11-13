package by.nc.school.dev.enitities;

public class Tutor extends Person {

    public Tutor(int id, String fullName) {
        super(id, fullName);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
