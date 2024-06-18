package lesson_4;

public class GarageDemo {
    public static void main(String[] args) {

        Car mySuperCar = new Car("AAAA123", "BMW", "M5", "Yellow");

        Car[] garage = new Car[5];
        garage[0] = mySuperCar;
        garage[1] = mySuperCar;
        garage[2] = mySuperCar;
        garage[3] = mySuperCar;
        garage[4] = mySuperCar;


    }
}
