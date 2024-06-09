package Homework_ls_5;

public class MyProgram {

    public static void main(String[] args) {
        Car car = new Car("Mazda", 0);
        System.out.println(car.getCurrentSpeed());

        car.speedUp(25);
        System.out.println(car.getCurrentSpeed());

        car.breeak();
        System.out.println(car.getCurrentSpeed());

        car.breeak();
        System.out.println(car.getCurrentSpeed());

        car.breeak();
        System.out.println(car.getCurrentSpeed());
    }
}
