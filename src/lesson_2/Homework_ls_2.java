public class Homework_ls_2 {
    public static void main(String[] args) { // точка входа для выполняемой программы, это начальный и завершающий этапы управления программой

        String city = " Kazan ";
        int result = city.length(); //Возвращает длину строки
        System.out.println(result);

        boolean result2 = city.isEmpty(); //Проверка строки на пустоту
        System.out.println(result2);

        boolean result3 = city.isBlank(); //Проверка отсутствия символов
        System.out.println(result3);

        String result4 = city.substring(1,3); //Вывод элементов по индексу с номера по номер
        System.out.println(result4);

        int result5 = city.indexOf('z'); //Возвращает индекс первого вхождения указанного значения в строковый объект String , на котором он был вызван
        System.out.println(result5);

        int result6 = city.lastIndexOf('n'); // Если строка найдена – метод возвращает номер ее первого символа, если не найдена — возвращает -1
        System.out.println(result6);

        String result7 = city.toUpperCase(); //Меняет все буквы на верхний регистр,заглавные буквы
        System.out.println(result7);

        String result8 = city.toLowerCase(); //Меняет все буквы на строчные
        System.out.println(result8);

        String result9 = city.replace('a', 'e'); //Замена одного символа на другой
        System.out.println(result9);

        String result10 = "Привет, у меня всё хорошо!";
        System.out.println(result10.startsWith("Привет")); //Позволяет определить, начинается ли строка с символов указанных в скобках метода, возвращая, соответственно, true или false

        String result11 = "Привет, у меня всё хорошо!";
        System.out.println(result11.endsWith("хорошо")); //Позволяет определить, заканчивается ли строка символами указанными в скобках, возвращая, соответственно, true или false

        String result12 = city.repeat(2); //Повтор переменной
        System.out.println(result12);

        boolean result13 = city.contains("Ka"); //Позволяющий проверить, содержит ли String другую подстроку или нет. Возвращает логическое значение
        System.out.println(result13);

        String result14 = city.concat("Moscow"); // Склеивание строк
        System.out.println(result14);

        String result15 = city.trim(); //Встроенная функция, которая удаляет начальные и конечные пробелы.
        System.out.println(result15);

        boolean result16 = city.equals("Moscow"); //Применяют для сравнения объектов на равенство. Он возвращает true, если два объекта равны, и false, если они не равны.
        System.out.println(result16);

        String name = "rinat";
        int a = 12;

    }
}
