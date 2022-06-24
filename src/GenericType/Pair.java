package GenericType;

public class Pair <K,V>{
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K first(){
        return first;
        }
    public V second() {
        return second;
    }


    public static void main(String[] args) {
        Pair<String,String> pair =  new Pair<>("test","test1");
        System.out.println(pair.first());
        System.out.println(pair.second());

    }
}
