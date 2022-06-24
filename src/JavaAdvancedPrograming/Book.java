package JavaAdvancedPrograming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    private String title;
    private String publishing;
    private int year;

    public Book(String title, String publishing, int year) {
        this.title = title;
        this.publishing = publishing;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Book validation(String title, String publishing, int year) throws BookValidationException {
        Pattern bookTitle;
        bookTitle = Pattern.compile(title);
        Matcher matcher = bookTitle.matcher("{2,}");
        boolean matches = matcher.matches();
        if (title.equals(null) || !matches) {
            throw new BookValidationException();
        }
        Pattern publishingName;
        publishingName = Pattern.compile(publishing);
        Matcher matcher1 = publishingName.matcher("{.}");
        boolean matches1 = matcher.matches();
        if (publishing.equals(null) || !matches1) {
            throw new BookValidationException();
        }
        if(year < 1900 || year > 2100){
            throw new BookValidationException();
        }
        return new Book(".", "cos", 2002);
    }

    public static void main(String[] args) throws BookValidationException {
        try {
            Book book1 = new Book(".", "cos", 2002);
            Book book2 = new Book("bac", "", 2002);
            Book book3 = new Book("bac", "dasda", 2102);
            book1.validation(".", "cos", 2001);
            book2.validation("bac", "", 2002);
            book3.validation("bac", "dasda", 2102);
        }catch (BookValidationException e ){
            System.out.println( " nie właściwie opisana ksiazka");
        }

    }
}
