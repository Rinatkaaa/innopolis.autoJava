package Training_tasks.interfaces;

public class Playground {

    public static void main(String[] args) {

        User user1 = new User("Rinat");
        User user2 = new User("Alex");

        Client client = new Client(new Telegram());
        client.processUser(user1);
        client.processUser(user2);


    }
}
