package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner numberCard = new Scanner(System.in);
        String s = numberCard.nextLine();
        System.out.println("**** **** **** " + s.substring(s.length() - 4));

    }
}
