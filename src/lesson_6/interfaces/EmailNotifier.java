package lesson_6.interfaces;

import lesson_6.User;

public class EmailNotifier implements Notifier{

    public void notifyUser(User user, String txt){
        System.out.println("Отправляем E-mail на адрес " + user.getEmail() + " : " + txt);
    }
}
