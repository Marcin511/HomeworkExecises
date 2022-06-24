package oop;

import java.util.Optional;

public class OptionalEcercise {
    public static void main(String[] args) {
        Movie movie =  new Movie("interstellar",null,2011);
        Optional<Movie> optional = (Optional<Movie>) Optional.ofNullable(movie);
        optional.ifPresentOrElse((Movie m) -> {
            System.out.println(m.getTitle() + m.getDescription() + m.getYearOfRelease());
        },()-> {
            System.out.println("nie istnieje");
        });
    }
}
class Movie{
    String title;
    String description;
    int yearOfRelease;

    public Movie(String title, String description, int yearOfRelease) {
        this.title = title;
        this.description = description;
        this.yearOfRelease = yearOfRelease;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;

    }
}


