package lesson_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Counter {

    public static void main(String[] args) throws IOException {
        //1. Прочитать данные из файла
        Path filePath = Path.of("counter");
        // проверяет существование файла (если файл существует, запускает if с действиями, если файла нет, то создает файл и добавляет в него значение)
        if (Files.exists(filePath)) {

            String content = Files.readString(filePath);

            //2. Произвести действия с данными файла
            int value = Integer.parseInt(content); // "1" -> 1
            value += 1;

            //3. Ответ записать в файл
            String newContent = String.valueOf(value); // 2 -> "2"
            Files.writeString(filePath, newContent);
        } else {
            Files.writeString(filePath, "0");
        }
    }
}
