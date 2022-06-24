package Listy;

import java.util.HashMap;
import java.util.Map;

public class HashMapUhExample2 {
    public static void main(String[] args) {
        String input = "asdaffdsfbdfggdfsadasvdafkJCKHCNWEOIRVKLDSROIDSKNWEOINFIR";
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : input.toCharArray()) {
            if (map.containsKey(letter) && map.get(letter) == 1) {
                map.put(letter, map.get(letter) + 1);
                System.out.println(letter);

            } else {
                map.put(letter, 1);
            }
        }
        System.out.println(map);
    }
}