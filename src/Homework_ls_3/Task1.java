package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner numberCard = new Scanner(System.in); // вариант через скан
        String s = numberCard.nextLine();
        System.out.println("**** **** **** " + s.substring(s.length() - 4));

        String numberCard2 = "1234 5678 9012 3456"; // обычный вариант
        String numberCard3 = "1234567890123456";
        System.out.println("**** **** **** " + numberCard2.substring(numberCard2.length() - 4));
        System.out.println("**** **** **** " + numberCard3.substring(numberCard3.length() - 4));

    }
}
