package lesson_3;

public class Playground {
    public static void main(String[] args) {

        int count = 1;
        int divider = 10;
        String city = "Moscow";

        User user1 = new User("Alex",17, true, "8800553535", "tataria99@mail.ru");
        System.out.println(user1.name + user1.age + " " + user1.rating);

        User user2 = new User("Mike", 48, false, "3125263473", "tataria99@mail.ru");
        System.out.println(user2.name + user2.age + " " + user2.rating);

        Smartphone iphone = new Smartphone();
        iphone.brand = "iphone";
        iphone.color = "yellow";
        iphone.hddGb = 256;
        System.out.println(iphone.hddGb);

        Car car1 = new Car("Lada","2107", 1.3, 2024, 150000, "green");
        System.out.println(car1.brand + car1.model + " " + car1.year);


    }
}
