package by.nc.school.dev.data;

import java.util.List;

public abstract class AbstractFakeGenerator<T>{

    protected final String filedir = "fakedb";
    public abstract void serialize();

    public abstract List<T> deserialize();
}
