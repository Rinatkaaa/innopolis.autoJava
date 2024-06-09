package Homework_ls_5;

import java.util.Scanner;

public class Card {
    private String number;
    private String beforeDate;
    private int ccv;
    private String pinCode;

    public Card(String number, String beforeDate, int ccv, String pinCode) {
        this.number = number;
        this.beforeDate = beforeDate;
        this.ccv = ccv;
        this.pinCode = pinCode;
    }

    public void cipher() {
        String s = this.number;
        System.out.println("**** **** **** " + s.substring(s.length() - 4));
    }

    public void setPinCode() {
        Scanner card = new Scanner(System.in);
        String numberCode = card.nextLine();
        if (numberCode.equals(this.pinCode)) {
            System.out.println(this.number);
        } else {
            System.out.println("Неверный пинкод");
        }
    }

    public String getNumber() {
        return this.number;
    }

    public String getBeforeDate() {
        return this.beforeDate;
    }

    public int getCcv() {
        return this.ccv;
    }

    public String getPinCode() {
        return this.pinCode;
    }
}

