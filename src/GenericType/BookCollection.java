package GenericType;

public class BookCollection {

    private Book[] books = new Book[2];

    public Book addBook(Book book) {
        for (int i=0;i<books.length;i++) {
            if (books[i] == null) {
                books[i] = book;
                return book;
            }
        }
        return null;
    }
}
