package Intermediate_certification;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Task2 {

    public static void main(String[] args) {
        LocalDate dateOfLastWatering = LocalDate.now().minus(15, ChronoUnit.DAYS);
        CactusWatering cactusWatering = new CactusWatering(dateOfLastWatering);
        cactusWatering.IrrigationCheck();
    }
}
