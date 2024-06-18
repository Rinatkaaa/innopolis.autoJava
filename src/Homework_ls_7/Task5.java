package Homework_ls_7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player(1, "Ринат", true));
        players.add(new Player(2, "Алексей", true));
        players.add(new Player(3, "Иван", true));
        players.add(new Player(4, "Андрей", true));
        players.add(new Player(5, "Мария", true));
        players.add(new Player(6, "Евгения", true));
        players.add(new Player(7, "Дмитрий", true));
        players.add(new Player(8, "Вика", true));
        players.add(new Player(9, "Анжелика", true));
        players.add(new Player(10, "Рената", true));

        // Проверка на добавление дубликата
        players.add(new Player(2, "Алексей", true));

        for (Player player : players) {
            System.out.println(player); // Почему выводится список в разброс?
        }

    }
}
