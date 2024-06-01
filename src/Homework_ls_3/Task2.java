package Homework_ls_3;

public class Task2 {
    public static void main(String[] args) {

        Flat apartment = new Flat();
        apartment.location = "Kazan";
        apartment.parking = true;
        apartment.price = 10000000;
        apartment.rooms = 3;
        apartment.size = 54.5;
        apartment.soundproofing = false;
        apartment.windows = "plastics";

        System.out.println(apartment.location + " " + apartment.parking + " " + apartment.price + " " + apartment.rooms);

    }
}
