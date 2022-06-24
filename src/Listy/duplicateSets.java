package Listy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateSets {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        int counter = 0;
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);
        Set<Integer> set = new HashSet<>();
        for(Integer value : values) {

            if (set.contains(value)) {
                counter++;

            }
            set.add(value);
        }System.out.println("values" + values);
        System.out.println("set" + set);
        System.out.println(counter);

    }
}

