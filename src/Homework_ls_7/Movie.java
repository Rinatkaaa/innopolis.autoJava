package Homework_ls_7;

import java.util.Objects;

public class Movie {
    private String name;
    private double rating;
    private String genre;
    private String country;
    private boolean oscar;


    public Movie(String name, double rating, String genre, String country, boolean oscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(rating, movie.rating) == 0 && oscar == movie.oscar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }


    public int hashCode() {
        return Objects.hash(name, rating, genre, country, oscar);
    }


    @Override
    public java.lang.String toString() {
        return "String{" +
                "name=" + name +
                ", rating=" + rating +
                ", genre=" + genre +
                ", country=" + country +
                ", oscar=" + oscar +
                '}';
    }
}

