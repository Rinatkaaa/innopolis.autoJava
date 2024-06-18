package lesson_4;

public class ArraysObjects {
    public static void main(String[] args) {

        Track[] playlist = new Track[2];

        playlist[0] = new Track(274,"Daft Punk", "give Life Back to Music", 2013, new byte [10]);
        playlist[1] = new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]);
        System.out.println(playlist[0]);

    }
}
