package Listy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class HashMapUhExecise2 {
    public static void main(String[] args) {
        int [] tab = new int[]{10,8,15,12,6,20,1};
        Map<Integer,Integer> map = new TreeMap<>();
        int i = 0;
        for(int value: tab){
            int v = map.getOrDefault(value,0);
                map.put(value, i);
                i++;
        }
        int ranking = 1;
        for(int value1: map.values()){
           tab[value1]  = ranking++;
        }

        System.out.println(Arrays.toString(tab));
    }

}
