package Intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class Winter implements CactusWateringDate {
    @Override
    public boolean getTimestamp(LocalDate date) {
        Month month = date.getMonth();
        return month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY;
    }
}
