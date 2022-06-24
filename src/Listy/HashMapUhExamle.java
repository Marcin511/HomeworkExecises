package Listy;

import java.util.HashMap;
import java.util.Map;

public class HashMapUhExamle {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("Polska", 38);
        map.put("Niemcy",81);
        map.put("USA",251);
        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
       Map.Entry<String,Integer> max = null;
        for(Map.Entry<String,Integer> country : map.entrySet()){
            if(max == null) {
                max = country;
            }else if( max.getValue() < country.getValue()){

            }
        }
        System.out.println(max);


        }
    }

