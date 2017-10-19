package by.nc.school.dev;

import by.nc.school.dev.data.FakeUserGenerator;
import by.nc.school.dev.user.User;
import by.nc.school.dev.services.ValidationService;

import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main( String[] args ) throws IOException {
        FakeUserGenerator.serialize();
        testValidation();
    }

    public static void testValidation() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input username ");
            String username = sc.nextLine();
            System.out.println("Input password ");
            String password = sc.nextLine();
            User currentUser = new ValidationService().validate(username, password);
            if (currentUser != null) {
                break;
            }
        }
    }
}
