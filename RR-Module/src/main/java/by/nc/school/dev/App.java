package by.nc.school.dev;

import by.nc.school.dev.data.FakeGroupGenerator;
import by.nc.school.dev.data.FakeSubjectGenerator;
import by.nc.school.dev.data.FakeUserGenerator;
import by.nc.school.dev.enitities.Tutor;
import by.nc.school.dev.enitities.User;

import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main( String[] args ) throws IOException {
        new FakeUserGenerator().serialize();
        new FakeSubjectGenerator().serialize();
        FakeGroupGenerator fakeGroupGenerator = new FakeGroupGenerator();
        fakeGroupGenerator.serialize();
        System.out.println(fakeGroupGenerator.deserialize());
//        testValidation();
    }

    public static void testValidation() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input username ");
            String username = sc.nextLine();
            System.out.println("Input password ");
            String password = sc.nextLine();
            User currentUser = new LoginController().login(username, password);
            if (currentUser != null) {
                System.out.println(Tutor.class.equals(currentUser.getClass()));
                break;
            }
        }
    }
}