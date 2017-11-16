package by.nc.school.dev.enitities.factories;

import by.nc.school.dev.enitities.Dean;
import by.nc.school.dev.enitities.User;

public class DeanFactory extends AbstractUserFactory {

    public User createUser(int id, String fullName, int role, int groupNumber) {
        return new Dean(id, fullName, role);
    }
}
