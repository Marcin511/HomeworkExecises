package iterator.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public BookCollectionIterator createIterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements BookCollectionIterator {
        private int position = -1;

        @Override
        public boolean hasNext() {
            if ((position + 1) < books.size()) {
                return true;
            } else {
                return false;
            }
        }
        @Override
        public Book next() {
            return books.get(++position);
        }
    }
}
