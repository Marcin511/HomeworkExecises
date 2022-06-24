package Listy;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        String input = "AABCDDBBBEA";
        Map<Character, Integer> map = new HashMap<>();
        Map.Entry<Character,Integer> max = null;
        for (char letter : input.toCharArray()) {
            if (map.containsKey(letter) && map.get(letter) >=1) {
                map.put(letter, map.get(letter) + 1);
           } else {
                map.put(letter, 1);
            }
        }for(Map.Entry<Character,Integer> maximum : map.entrySet())
            if(max==null) {
                max = maximum;
            }else if(maximum.getValue() > max.getValue()){
                max = maximum;
            }
        System.out.println(map);
        System.out.println(max);
    }
}

