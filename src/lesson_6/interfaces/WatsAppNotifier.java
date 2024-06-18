package lesson_6.interfaces;

import lesson_6.User;

public class WatsAppNotifier implements Notifier {

    public void notifyUser(User user, String txt) {
        System.out.println("Уведомляем по WA: " + txt);
    }
}
