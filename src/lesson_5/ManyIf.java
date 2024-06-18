package lesson_5;

import java.util.Scanner;

public class ManyIf {

    public static void main(String[] args) {

        String size = new Scanner(System.in).nextLine();
        if (size.equals("xs")) {
            System.out.println("->>>> 40-42");
        } else {
            if (size.equals("s")) {
                System.out.println("->>>> 44-46");
            } else {
                if (size.equals("m")) {
                    System.out.println("->>>> 48-50");
                } else {
                    if (size.equals("x")) {
                        System.out.println("->>>> 52-54");
                    } else {
                        System.out.println("->>>> 56-58");
                    }
                }
            }


            switch (size) {
                case "xs":
                    System.out.println("40-42");
                    break;
                case "s":
                    System.out.println("44-46");
                    break;
                case "m":
                    System.out.println("45-46");
                    break;
                default:
                    System.out.println("У нас нет таких размеров");
            }

        }
    }
}