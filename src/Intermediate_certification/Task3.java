package Intermediate_certification;

public class Task3 {

    public static void main(String[] args) {
        // Создали массив
        int[] array = {1, 5, 7, 3, 2, 0, 4, 9, 6};

        // Объявляем и инициализируем две переменные с минимальным и максимальным значением
        int maxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;

        // Проходим по каждому элементу
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                // Если текущей элемент больше чем maxElement, то обновляем secondMaxElement и maxElement
                secondMaxElement = maxElement;
                maxElement = array[i];
                // Если текущий элементне равен maxElement, но больше чем secondMaxElement, то обновляем secondMaxElement значением текущего элемента
            } else if (array[i] > secondMaxElement && array[i] != maxElement) {
                secondMaxElement = array[i];
            }
        }
        // Вывод второго по величине значения в массиве
        System.out.println("Второй по величине элемент: " + secondMaxElement);
    }
}
