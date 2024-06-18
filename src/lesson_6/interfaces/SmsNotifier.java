package lesson_6.interfaces;

import lesson_6.User;

public class SmsNotifier implements Notifier{

    public void notifyUser(User user, String txt) {
        System.out.println("Отправляем смс на номер " + user.getPhone() + " : " + txt);
    }
}
