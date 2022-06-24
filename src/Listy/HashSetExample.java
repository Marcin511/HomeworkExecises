package Listy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);
        int n = 12;
        Set<Integer> sum = new HashSet<>();
        for (Integer pairSum : list) {
            int diff = n - pairSum;
            if (sum.contains(diff)) {
                System.out.println(pairSum + " , " + diff);
            }
            sum.add(pairSum);
        }
    }

}