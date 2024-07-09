package Intermediate_certification;

import java.util.Random;

public class Sensor {

    public int getHumidity() {
        // Генерация случайного числа от 0 до 100
        Random number = new Random();
        return number.nextInt(101);
    }
}
