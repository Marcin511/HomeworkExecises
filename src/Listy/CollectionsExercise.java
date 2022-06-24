package Listy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] tab =  new int[]{1,5,2,2,2,5,5,4};
        for(int i = 0 ; i< tab.length ; i++) {
            list.add(tab[i]);
        }
        int k = 3;
        Set<Integer> diffrence = new HashSet<>();
        for (Integer pairDiff : list) {
            int diff = pairDiff - k;
            int diff1 = pairDiff + k;
            if (diffrence.contains(diff)) {
                System.out.println(pairDiff + " , " + diff);
            }else if(diffrence.contains(diff1)){
                System.out.println(pairDiff + " , " + diff1);
            }
            diffrence.add(pairDiff);
        }
    }
    static class Pair{
        private int first;
        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
    }
}


