package Homework_ls_4;

public class Task6 {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "Ринат";
        names[1] = "Алексей";
        names[2] = "Богдан";
        names[3] = "Анжелика";
        names[4] = "Вика";
        names[5] = "Дмитрий";
        names[6] = "Евгений";
        names[7] = "Артур";
        names[8] = "Александр";
        names[9] = "Владимир";

        for (int i = 0; i < 3; i = i + 1){
            String top = names[i];
            System.out.println(top);
        }
    }
}
