package by.nc.school.dev;

import by.nc.school.dev.data.FakeGroupGenerator;
import by.nc.school.dev.data.FakeSubjectGenerator;
import by.nc.school.dev.data.FakeUserGenerator;
import by.nc.school.dev.enitities.Subject;
import by.nc.school.dev.enitities.Tutor;
import by.nc.school.dev.enitities.User;
import by.nc.school.dev.services.SubjectService;
import by.nc.school.dev.services.UserService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class App {

    private static User currentUser;
    public static void main( String[] args ) throws IOException {
        new FakeUserGenerator().serialize();
        new FakeSubjectGenerator().serialize();
        FakeGroupGenerator fakeGroupGenerator = new FakeGroupGenerator();
        fakeGroupGenerator.serialize();
        System.out.println(fakeGroupGenerator.deserialize());
        displaySubjects();
//        testValidation();
//        testUsernameChange();
    }

    private static void displaySubjects() {
        List<Subject> subjects = new SubjectService().getAllSubjects();
        for (Subject subject : subjects) {
            System.out.println(subject.getName() + "  " + subject.getTutor().getFullName());
        }
    }

    private static void testUsernameChange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new username ");
        String newUsername = sc.nextLine();
        UserService userService = new UserService();
        userService.changeUsername(currentUser, newUsername);
        System.out.println(currentUser);
    }


    private static void testValidation() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input username ");
            String username = sc.nextLine();
            System.out.println("Input password ");
            String password = sc.nextLine();
            currentUser = new LoginController().login(username, password);
            if (currentUser != null) {
                System.out.println(Tutor.class.equals(currentUser.getClass()));
                break;
            }
        }
    }
}