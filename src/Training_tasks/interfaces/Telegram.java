package Training_tasks.interfaces;

import java.util.Scanner;

public class Telegram implements MessengerApp {

    public void sendMessage(User user, String txt) {
        txt = new Scanner(System.in).nextLine();
        System.out.println(user.getName() + " отправляет сообщение в приложение Telegram: " + txt);
    }
}


