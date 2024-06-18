package lesson_5;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;

    public User(String myName, int myAge, boolean status, String myPhone, String myEmail){
        name = myName;
        age = myAge;
        isOnline = status;
        phone = myPhone;
        email = myEmail;
        rating = 5.0;

    }

    public void getOlder(){
        System.out.println("Сегодня я стал старше");
        age = age + 1;
    }

}
