package iterator.iterator;

public class Book {
    private final String title;
    private final String author;
    private final int yearOfRelease;

    public Book(String title, String author, int yearOfRelease) {
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
