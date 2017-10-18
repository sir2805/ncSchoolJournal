package by.nc.school.dev;

import by.nc.school.dev.user.User;
import by.nc.school.dev.userservices.ValidationService;

public class LoginController {

    public static User login(String username, String password) {
        return new ValidationService().validate(username, password);
    }
}
