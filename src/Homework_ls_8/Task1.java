package Homework_ls_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {

    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(5);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        System.out.println(publishTime);
    }

}
