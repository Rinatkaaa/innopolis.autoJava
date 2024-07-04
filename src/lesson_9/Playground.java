package lesson_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Playground {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("students.txt");
        Files.delete(filePath);
    try {
        Files.writeString(filePath, "Ринат Ганиев", StandardOpenOption.APPEND);
        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);
    } catch (Exception ex){
        System.out.println("Мы не смогли записать данные");
    }

        System.out.println("Конец");

         List<String> s = Files.readAllLines(filePath);
        System.out.println(s);
    }
}
