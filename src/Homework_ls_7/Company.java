package Homework_ls_7;

import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private int year;
    private List<String> nameFilms;

    public Company(String name, int year, List<String> nameFilms) {
        this.name = name;
        this.year = year;
        this.nameFilms = nameFilms;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return year == company.year && Objects.equals(name, company.name) && Objects.equals(nameFilms, company.nameFilms);
    }


    public int hashCode() {
        return Objects.hash(name, year, nameFilms);
    }


    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", movies=" + nameFilms +
                '}';
    }
}
