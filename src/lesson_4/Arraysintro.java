package lesson_4;

public class Arraysintro {
    public static void main(String[] args) {

        int[] marks = new int[10];

        String[] names = new String[5];

        names[0] = "Галина";
        names[1] = "Данила";
        names[2] = "Никита";
        names[3] = "Анна";
        names[4] = "Милана";

        long[] numbers = new long[10];

        System.out.println(names[1]);

        int[] a1 = new int[5];
        int[] a2 = new int[] {1, 2, 3, 4, 5, 6};
        int[] a3 = {1, 2, 3, 4, 5, 6, 7};

        String[] cities = {"Moscow", "Tokyo", "Berlin"};
        byte[] bytes = {8, 12, 20, 2, 0, 0, 10};
        char[] letters = new char[] {'a', 'b', 'c', 'd'};

        boolean[] values = new boolean[5];
        values[0] = true;
        values[1] = true;
        values[2] = false;
        values[3] = false;
        values[4] = true;


    }

}
