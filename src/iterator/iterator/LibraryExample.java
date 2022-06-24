package iterator.iterator;

public class LibraryExample {

    public static void main(String[] args) {
        Library bookCollection = new Library();
        bookCollection.addBook(new Book("test1", "test1", 1));
        bookCollection.addBook(new Book("test2", "test2", 2));
        bookCollection.addBook(new Book("test3", "test3", 3));

        BookCollectionIterator iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
