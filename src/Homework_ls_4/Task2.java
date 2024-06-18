package Homework_ls_4;

public class Task2 {
    public static void main(String[] args) {

        double[] numbers = new double[3];
        numbers[0] = Math.PI;
        String result = String.format("%.5f", numbers[0]);
        numbers[1] = Math.E;
        String result1 = String.format("%.5f", numbers[1]);
        numbers[2] = 1;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(numbers[2]);

    }
}
