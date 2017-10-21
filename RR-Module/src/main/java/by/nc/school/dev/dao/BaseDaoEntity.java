package by.nc.school.dev.dao;

import java.io.Serializable;

abstract public class BaseDaoEntity implements Serializable {

    private int id;

    public BaseDaoEntity(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseDaoEntity{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}
