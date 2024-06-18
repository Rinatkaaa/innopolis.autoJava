package Training_tasks.interfaces;

import java.util.Scanner;

public class Client {

    private MessengerApp messengerApp;
    private String txt;

    public Client(MessengerApp messengerApp) {
        this.messengerApp = messengerApp;
    }

    public void processUser(User user) {
        messengerApp.sendMessage(user, "");
    }

}
