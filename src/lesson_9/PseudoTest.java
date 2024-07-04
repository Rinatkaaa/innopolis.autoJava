package lesson_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PseudoTest {

    public static void main(String[] args) throws IOException {
        String url = "";
        String user = "";
        String pass = "";

        List<String> props = Files.readAllLines(Path.of("src/resources/testdata.yaml"));

        for (String prop : props) {
            String[] split = prop.split(": ");

            switch (split[0]) {
                case "url":
                    url = split[1];
                    break;
                case "user":
                    user = split[1];
                    break;
                case "pass":
                    pass = split[1];
                    break;
                default:
                    System.out.println("Неизвестное значение " + split[0] + ": " + split[1]);
            }

        }
        // open url
        System.out.println("Открываем страницу " + url);
        // type username in
        System.out.println("Вводим логин " + user);
        // type password in
        System.out.println("Вводим пароль " + pass);
    }
}
