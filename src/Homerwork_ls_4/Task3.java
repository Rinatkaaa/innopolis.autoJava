package Homerwork_ls_4;

public class Task3 {
    public static void main(String[] args) {

        Movie[] films = new Movie[3];

        films[0] = new Movie("Кто Я", 8.5, "Триллер", "США", true);
        films[1] = new Movie("Платформа", 8.1, "Ужасы", "Испания", false);
        films[2] = new Movie("60 минут", 6.4, "Спорт", "Германия", false);


        for (int i = 0; i < 3; i++){
            String info = (films[i].country + " - " + films[i].oscar + " - " + films[i].name + " - " + films[i].genre + " - " + films[i].rating);
            System.out.println(info);
        }

    }
}
