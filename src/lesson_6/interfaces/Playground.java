package lesson_6.interfaces;

import lesson_6.User;

import java.util.Scanner;

public class Playground {

    public static void main(String[] args) {

        User u1 = new User("Alex");
        u1.setBalance(100);
        u1.setPhone("89274887658");
        u1.setEmail("tataria88@mail.ru");

        User u2 = new User("Mark");
        u2.setBalance(50);
        u2.setEmail("tataria99@mail.ru");
        u2.setPhone("89272624251");

        User u3 = new User("Inna");
        u3.setBalance(200);
        u3.setEmail("tataria77@mail.ru");
        u3.setPhone("89273624514");

        BalanceService service = new BalanceService(new WatsAppNotifier());
        service.processUser(u1);
        service.processUser(u2);
        service.processUser(u3);

    }
}
