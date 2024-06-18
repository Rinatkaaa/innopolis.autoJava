package lesson_5;

import java.util.Scanner;

public class LogicOperations {

    public static void main(String[] args) {

        boolean haveMony = true;
        boolean haveCard = false;

        System.out.println( haveMony || haveCard);

        String username = "Alex";
        String password = "qwerty";

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String pass = scanner.nextLine();

        if ( username.equals(login) && password.equals(pass)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

    }
}
