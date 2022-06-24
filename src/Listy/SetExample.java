package Listy;


        import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

        public class SetExample {

            public static void main(String[] args) {
                Set<Integer> set = new HashSet<>();
                set.add(1);
                set.add(2);
                set.add(3);
                set.add(1);
                set.add(2);
                for (Integer value : set) {
                    System.out.println(value);
                }
                Iterator<Integer> iterator = set.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                System.out.println(set);
            }
        }









