package by.nc.school.dev;

import by.nc.school.dev.enitities.User;
import by.nc.school.dev.services.ValidationService;

public class LoginController {

    public User login(String username, String password) {
        return new ValidationService().validate(username, password);
    }
}
