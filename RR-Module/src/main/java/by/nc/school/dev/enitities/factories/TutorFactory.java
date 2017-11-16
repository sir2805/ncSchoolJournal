package by.nc.school.dev.enitities.factories;

import by.nc.school.dev.enitities.User;
import by.nc.school.dev.enitities.Tutor;

public class TutorFactory extends AbstractUserFactory {

    public User createUser(int id, String fullName, int role, int groupNumber) {
        return new Tutor(id, fullName, groupNumber);
    }
}
