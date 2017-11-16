package by.nc.school.dev.enitities.factories;

import by.nc.school.dev.enitities.Curator;
import by.nc.school.dev.enitities.User;

public class CuratorFactory extends AbstractUserFactory {

    public User createUser(int id, String fullName, int role, int groupNumber) {
        return new Curator(id, fullName, role, groupNumber);
    }
}
