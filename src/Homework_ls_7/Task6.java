package Homework_ls_7;

import java.util.*;
import java.util.stream.Collectors;


public class Task6 {

    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1, "Ринат", true), 0);
        points.put(new Player(2, "Алексей", true), 0);
        points.put(new Player(3, "Иван", true), 0);
        points.put(new Player(4, "Андрей", true), 0);
        points.put(new Player(5, "Мария", true), 0);
        points.put(new Player(6, "Евгения", true), 0);
        points.put(new Player(7, "Дмитрий", true), 0);
        points.put(new Player(8, "Вика", true), 0);
        points.put(new Player(9, "Анжелика", true), 0);
        points.put(new Player(10, "Рената", true), 0);

        points.replace(new Player(4, "Андрей", true), 0, 10);
        points.replace(new Player(7, "Дмитрий", true), 0, 12);
        points.replace(new Player(8, "Вика", true), 0, 11);
        points.replace(new Player(9, "Анжелика", true), 0, 13);
        points.replace(new Player(10, "Рената", true), 0, 5);

        List<Map.Entry<Player, Integer>> sortedPlayers = new ArrayList<>(points.entrySet()); // Это всё подглядел в интернете, хотелось бы узнать про это побольше на консультации
        sortedPlayers.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Выводим 3 лучших игроков
        System.out.println("Три лучших игрока турнира:");
        for (int i = 0; i < 3 && i < sortedPlayers.size(); i++) {
            Map.Entry<Player, Integer> entry = sortedPlayers.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue() + " очков");

            }
        }
    }



