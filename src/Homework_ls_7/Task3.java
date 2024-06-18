package Homework_ls_7;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Кто Я", 8.5, "Триллер", "США", true));
        films.add(new Movie("Платформа", 8.1, "Ужасы", "Испания", false));
        films.add(new Movie("60 минут", 6.4, "Спорт", "Германия", false));

        System.out.println(films.get(1));


    }
}
