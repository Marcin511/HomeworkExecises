package GenericType;

public interface Generator<T> {
    T generate();
}
class BookGenerator implements Generator<Book>{

    @Override
    public Book generate() {
        return new Book (1,"test");
    }
}
class MovieGenerator implements Generator<Movie>{

    @Override
    public Movie generate() {
        return new Movie(0, "test1");
    }
}
class GeneratorExample {
    public static void main(String[] args) {
        Generator<Movie> movieGenerator = new MovieGenerator();
        Generator<Book> bookGenerator = new BookGenerator();
        System.out.println(movieGenerator.generate());
        System.out.println(bookGenerator.generate());
    }
}