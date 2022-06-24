package GenericType;
import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Raspberry");
        stringList.add("Strawberry");
        stringList.add("Lemon");
        stringList.add("Mint");
        stringList.add("Milk");
        for (int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        stringList.remove("Strawberry");
        stringList.remove("Mint");
        System.out.println("After remove: ");
        for (String item : stringList) {
            System.out.println(item);
        }
    }
}