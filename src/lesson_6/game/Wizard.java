package lesson_6.game;

public class Wizard implements Hero{

    public void attack(Enemy enemy) {
        System.out.println("Колдуем!");
        enemy.hurts(10);
    }
}
