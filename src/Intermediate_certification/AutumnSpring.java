package Intermediate_certification;

import java.time.LocalDate;
import java.time.Month;

public class AutumnSpring implements CactusWateringDate {
    @Override
    public boolean getTimestamp(LocalDate date) {
        Month month = date.getMonth();
        return month == Month.SEPTEMBER || month == Month.OCTOBER || month == Month.NOVEMBER ||
                month == Month.MARCH || month == Month.APRIL || month == Month.MAY;
    }
}
