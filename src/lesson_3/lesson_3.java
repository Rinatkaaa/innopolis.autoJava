package lesson_3;

public class lesson_3 {
    public static void main(String[] args) {
        String name = "Ринат";

        // приводит содержимое строки к верхнему регистру
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();

        // проверка на пустоту и отсутствие символов
        boolean empty = " ".isEmpty();
        boolean blank = " ".isBlank();

        System.out.println("name = " + name);
        System.out.println("upperCaseName = " + upperCaseName);
        System.out.println("lowerCaseName = " + lowerCaseName);

        System.out.println("empty = " + empty);
        System.out.println( "blank = " + blank);



    }
}
