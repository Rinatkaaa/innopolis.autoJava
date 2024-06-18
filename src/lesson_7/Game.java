package lesson_7;

import lesson_6.game.*;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args) {

        List<Hero> squad = new ArrayList<>();
        List<Enemy> enemies = new ArrayList<>();

        squad.add(new Knight());
        squad.add(new Wizard());

        Enemy t = new Troll();

        for (Hero hero : squad) {
            hero.attack(t);
        }
    }
}
