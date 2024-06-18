package lesson_6.game;

public class Knight implements Hero{

    public void attack(Enemy enemy) {
        System.out.println("Бум мечом");
        enemy.hurts(15);
    }
}
