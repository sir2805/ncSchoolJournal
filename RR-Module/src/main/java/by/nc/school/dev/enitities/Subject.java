package by.nc.school.dev.enitities;

public class Subject extends BaseEnitity {

    private String name;
    private Tutor tutor;

    public Subject(int id, String name, Tutor tutor) {
        super(id);
        this.name = name;
        this.tutor = tutor;
    }

    public String getName() {
        return name;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
