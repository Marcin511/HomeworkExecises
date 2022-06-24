package Listy;

import java.util.HashMap;
import java.util.Map;

public class HashmapAnagram {
    public static boolean isAnagram(String input1, String input2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char letter : input1.toCharArray()) {
            int value = map1.getOrDefault(letter, 0);
            map1.put(letter, value + 1);
        }
        for (char letter : input2.toCharArray()) {
            int value = map2.getOrDefault(letter, 0);
            map2.put(letter, value + 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
        System.out.println(isAnagram("sailent","listen"));
        System.out.println(isAnagram("incest","insect"));
    }
}
