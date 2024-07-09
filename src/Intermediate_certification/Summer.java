package Intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class Summer implements CactusWateringDate {
    @Override
    public boolean getTimestamp(LocalDate date) {
        Month month = date.getMonth();
        return month == Month.JUNE || month == Month.JULY || month == Month.AUGUST;
    }
}
