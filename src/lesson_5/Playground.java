package lesson_5;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {

        String secret = "qwerty";
        String pass = new Scanner(System.in).nextLine();

        if (pass.equals(secret)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

    }
}
