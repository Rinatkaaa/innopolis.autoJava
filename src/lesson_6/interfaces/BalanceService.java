package lesson_6.interfaces;

import lesson_6.User;

public class BalanceService {

    private Notifier notifier;

    public BalanceService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void processUser(User user){
        notifier.notifyUser(user, "Ваш баланс выше 0!");
    }
}
