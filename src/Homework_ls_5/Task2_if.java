package Homework_ls_5;

import java.util.Random;

public class Task2_if {

    public static void main(String[] args) {
        int age = 24;
        if (age % 2 == 0 && age % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else {
            if (age % 2 > 0 && age % 3 == 0) {
                System.out.println("Нечетное число. Кратно трем");
            } else {
                System.out.println("Число не подходит под условия");
            }
        }

    }
}

