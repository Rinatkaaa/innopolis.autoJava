package lesson_5;

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {

        String name = "Alex";
        int x = 10;

        Scanner sc = new Scanner(System.in);

        User usr = new User("Alex", 23, true, "+12312414", "mail.ru");
        usr.getOlder();
        System.out.println(usr.age);

    }
}
