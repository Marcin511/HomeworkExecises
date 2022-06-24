package Listy;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        int [] tab = new int[]{2,8,7,2,2,5,2,3,1,2,2};
        Map<Integer,Integer> map = new HashMap<>();
        Map.Entry<Integer,Integer> max = null;
        int counter = 0;
        for (int input: tab){
            if (map.containsKey(input) && map.get(input)<=tab.length/2) {
                counter++;
                map.put(input, counter);

            }else{
                map.put(input, 1);
            }
        }for(Map.Entry<Integer,Integer> maximum : map.entrySet())
            if(max==null) {
                max = maximum;
            }else if(maximum.getValue() > max.getValue()){
                max = maximum;
            }
        System.out.println(map);
        System.out.println(max);
    }
}
