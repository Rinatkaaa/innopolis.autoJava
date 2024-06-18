package lesson_4;

public class Loops {
    public static void main(String[] args) {

        Student[] group = new Student[20];
        group[0] = new Student("Алена", "Швайка");
        group[1] = new Student("Анна", "");
        group[2] = new Student("Ринат", "Ганиев");

        group[0].isPresent = false;

        for (int i = 0; i < 3; i = i + 1) {
            String info = group[i].firstName + " " + group[i].lastName + " ----> " + group[i].isPresent;
            System.out.println(info);

            for (Student student : group) {
                String info1 = student.firstName + " " + student.lastName + " ----> " + student.isPresent;
                System.out.println(info1);
            }


        }

    }
}
