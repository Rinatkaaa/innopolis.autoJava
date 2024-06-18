package Homework_ls_7;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> affairs = new ArrayList<>();

        affairs.add("Проснуться");
        affairs.add("Умыться");
        affairs.add("Покушать");
        affairs.add("Сделать зарядку");
        affairs.add("Погулять");

        for (int i = 0; i < affairs.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + affairs.get(i));
        }

    }
}
