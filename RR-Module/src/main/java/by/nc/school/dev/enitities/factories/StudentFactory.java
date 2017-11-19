package by.nc.school.dev.enitities.factories;

import by.nc.school.dev.enitities.Student;
import by.nc.school.dev.enitities.User;

/**
 * Created by User on 19.11.2017.
 */
public class StudentFactory extends AbstractUserFactory {
    @Override
    public User createUser(int id, String fullName, int role, int groupNumber) {
        return new Student(id, fullName, role, groupNumber);
    }
}
