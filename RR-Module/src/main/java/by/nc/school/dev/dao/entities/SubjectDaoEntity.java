package by.nc.school.dev.dao.entities;

public class SubjectDaoEntity extends BaseDaoEntity {

    private String name;
    private int tutorId;

    public SubjectDaoEntity(int id, String name, int tutorId) {
        super(id);
        this.name = name;
        this.tutorId = tutorId;
    }

    public String getName() {
        return name;
    }

    public int getTutorId() {
        return tutorId;
    }

    @Override
    public String toString() {
        return "SubjectDaoEntity{" +
                "name='" + name + '\'' +
                ", tutorId=" + tutorId +
                '}';
    }
}
