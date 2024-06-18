package Homework_ls_7;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> films1 = new ArrayList<>();
        films1.add("Человек паук");
        films1.add("Железный человек");
        films1.add("Чёрная пантера");

        List<String> films2 = new ArrayList<>();
        films2.add("Бетмен");
        films2.add("Джокер");
        films2.add("Харли Квин");

        List<String> films3 = new ArrayList<>();
        films3.add("Время");
        films3.add("Стекло");
        films3.add("Царь болота");

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Marvel", 1990, films1));
        companies.add(new Company("DC", 2000, films2));
        companies.add(new Company("Universal", 2010, films3));

        for (Company company : companies) {  // Можно ещё через форич вывести, только так смог вывести, чет по красивее не получается
            System.out.println(company);
        }


    }
}
