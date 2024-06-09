package Homework_ls_5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4_if {

    public static void main(String[] args) {
        String password = new Scanner(System.in).nextLine();
        if (password.length() >= 8) {
            if (password.matches("(?=.*[a-z])(?=.*[0-9]).{8,}")) {
                if (password.matches("(?=.*[a-z])(?=.*[!@#$%^&*№]).{8,}")) {
                    System.out.println("Пароль принят");
                } else {
                    System.out.println("Пароль должен содержать минимум один символ");
                }
            } else {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else {
            System.out.println("Пароль не менее 8 символов");
        }


    }
}
