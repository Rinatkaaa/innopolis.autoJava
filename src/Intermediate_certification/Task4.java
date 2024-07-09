package Intermediate_certification;

import java.util.Random;
import java.util.Scanner;


public class Task4 {

    // Подсмотрел оформление в интернете, так как не знал как правильнее сделать, через несколько классов или как сейчас
    public static void main(String[] args) {
        // Создаем объекты Scanner и Random для чтения ввода пользователя и случайного выбора компьютера
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // В массиве options хранятся возможные варианты выбора
        String[] options = {"К", "Н", "Б"};
        // Инициализируем переменные для хранения очков пользователя и компьютера.
        int userScore = 0;
        int computerScore = 0;

        // Цикл for на 5 раундов, в каждом из которых:
        //Пользователь вводит свой выбор.
        //Компьютер делает случайный выбор.
        //Результат раунда сравнивается и добавляются соответствующие очки.
        //Отображается текущий счет
        for (int round = 1; round <= 5; round++) {
            System.out.println("Раунд " + round);
            System.out.println("Введите ваш выбор (К-камень, Н-ножницы, Б-бумага): ");
            String userChoice = scanner.next().toUpperCase();

            while (!userChoice.equals("К") && !userChoice.equals("Н") && !userChoice.equals("Б")) {
                System.out.println("Неверный выбор. Пожалуйста, введите К, Н или Б: ");
                userChoice = scanner.next().toUpperCase();
            }

            String computerChoice = options[random.nextInt(3)];
            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Ничья!");
            } else if ((userChoice.equals("К") && computerChoice.equals("Н")) ||
                    (userChoice.equals("Н") && computerChoice.equals("Б")) ||
                    (userChoice.equals("Б") && computerChoice.equals("К"))) {
                int roundPoints = calculatePoints(userChoice);
                userScore += roundPoints;
                System.out.println("Вы выиграли этот раунд! Получено баллов: " + roundPoints);
            } else {
                int roundPoints = calculatePoints(computerChoice);
                computerScore += roundPoints;
                System.out.println("Компьютер выиграл этот раунд! Получено баллов: " + roundPoints);
            }

            System.out.println("Счет после " + round + " раунд(а): Пользователь " + userScore + " - Компьютер " + computerScore);
            System.out.println();
        }

        // Выводится итоговый счет и объявляется победитель
        System.out.println("Итоговый счет: Пользователь " + userScore + " - Компьютер " + computerScore);

        if (userScore > computerScore) {
            System.out.println("Вы победили!");
        } else if (userScore < computerScore) {
            System.out.println("Компьютер победил!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }

    private static int calculatePoints(String choice) {
        switch (choice) {
            case "К":
                return 1;
            case "Н":
                return 2;
            case "Б":
                return 5;
            default:
                return 0;
        }
    }
}

