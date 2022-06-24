package GenericType;

//<T> == <T extends Object>
public class ItemCollection<T extends Item> {

    private T[] items;

    public ItemCollection(T[] items) {
        this.items = items;
    }

    public T addItem(T item) {
        for (int i=0;i<items.length;i++) {
            if (items[i] == null) {
                items[i] = item;
                return item;
            }
        }
        return null;
    }

    public T remove(int id) {
        for (int i=0;i<items.length;i++) {
            if (items[i].getId() == id) {
                T item = items[i];
                items[i] = null;
                return item;
            }
        }
        return null;
    }
    public static <T extends Item> void show(T t) {
        System.out.println("ID: " + t.getId());
        System.out.println(t);
    }
    public static void showElements(ItemCollection<? extends Item> itemCollection){
        for(Item item : itemCollection.items)
        System.out.println(item);

    }

    public static void main(String[] args) {

        //ItemCollection<String> == String nie pochodzi od klasy Item
        ItemCollection<Book> bookItemCollection =
                new ItemCollection<>(new Book[2]);
        bookItemCollection.addItem(new Book(1, "harry Potter"));

        ItemCollection<Movie> movieItemCollection =
                new ItemCollection<>(new Movie[2]);
        movieItemCollection.addItem(new Movie(1, "Star Wars"));

    }

}
