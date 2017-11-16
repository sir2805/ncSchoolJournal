package by.nc.school.dev.enitities.factories;

import by.nc.school.dev.enitities.User;

public abstract class AbstractUserFactory {

    public abstract User createUser(int id, String fullName, int role, int groupNumber);
}
