package by.nc.school.dev.enitities;

public abstract class BaseEnitity {
    protected int id;

    public BaseEnitity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
