package Listy;

import java.util.*;

public class Movie {
    private String title;
    private String director;
    private int realiseYear;

    public Movie(String title, String director, int realiseYear) {
        this.title = title;
        this.director = director;
        this.realiseYear = realiseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return realiseYear == movie.realiseYear && Objects.equals(title, movie.title) && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, realiseYear);
    }
}
class MovieList{
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("interslllar","Cristofer Nolan",2011));
        list.add(new Movie("interslllar","Cristofer Nolan",2011));
        System.out.println(list.size());
        Set<Movie> movieSet = new HashSet<>();
        movieSet.add(new Movie("batman","Nolan",2008));
        movieSet.add(new Movie("batman","Nolan",2008));
        movieSet.add(new Movie("interslllar","Cristofer Nolan",2011));
        movieSet.add(new Movie("interslllar","Cristofer Nolan",2011));

        System.out.println(movieSet.size());

    }


}
