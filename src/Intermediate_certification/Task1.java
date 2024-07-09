package Intermediate_certification;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Создание переменных и вычисление длины букв и пробелов
        int letter = 15;
        int space = 3;
        int letterLength = (letter / 3) * 62;
        int spaceLength = space * 12;
        int fenceLength = new Scanner(System.in).nextInt();

        if (letterLength + spaceLength <= fenceLength) {
            System.out.println("Надпись поместилась");
        } else {
            System.out.println("Надпись слишком длинная для забора");
        }

    }
}
