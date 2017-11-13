package by.nc.school.dev.enitities;

public class Person extends BaseEnitity {
    protected String fullName;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        return fullName != null ? fullName.hashCode() : 0;
    }

    public Person(int id, String fullName) {
        super(id);
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
