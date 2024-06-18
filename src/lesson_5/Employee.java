package lesson_5;

public class Employee {

   private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void up(double rate){
        if (rate >= 1){
            this.salary = this.salary * rate;
        }

    }

    public String getName(){
        return this.name;
    }

    public String changeName(String newName){
        this.name = newName;
        return newName;
    }

    public double getSalary(){
        return  this.salary;
    }

    public void down(double rate) {
        if (rate > 0.5) {
            rate = 0.5;
        }

        if (rate < 0){
            rate = 0;
        }

        this.salary = this.salary * (1- rate);
    }


}
