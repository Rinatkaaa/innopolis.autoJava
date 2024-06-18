package lesson_6.interfaces;

import lesson_6.User;

public class PushNotifier implements Notifier{

    public void notifyUser(User user, String txt){
        System.out.println("Отправляем PUSH на устройство пользователю " + user.getName() + " : " + txt);
    }
}
