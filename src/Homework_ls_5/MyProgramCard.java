package Homework_ls_5;

public class MyProgramCard {

    public static void main(String[] args) {
        Card card = new Card("4276 6200 3341 5039", "03/27", 254, "1661");
        card.cipher();

        card.setPinCode();
    }
}
