package lesson_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BookReader {

    public static void main(String[] args) throws IOException {
        Book book = new Book("12 стульев", 1927, "Е. Петров");

        Files.writeString(Path.of("book.txt"), book.toString());

        String string = Files.readString(Path.of("book.txt"));
        
    }
}
