package lesson_7;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();

        strings.add("Nikita");
        strings.add("Ринат");
        strings.add("Татьяна");
        strings.add("Алексей");
        strings.add("Вадим");
        strings.add("Саша");
        strings.add("Женя");
        strings.add("Галина");

        strings.remove("Женя");
        strings.add(1, "Ринат");

        for (String string : strings) {
            System.out.println(string.toUpperCase());
        }

        System.out.println(strings.size());

    }
}
