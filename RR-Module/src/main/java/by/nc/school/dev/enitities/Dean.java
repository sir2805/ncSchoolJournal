package by.nc.school.dev.enitities;

public class Dean extends Person {

    public Dean(int id, String fullName) {
        super(id, fullName);
    }

    @Override
    public String toString() {
        return "Dean{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
