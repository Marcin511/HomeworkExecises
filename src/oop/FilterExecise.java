package oop;

import java.util.Arrays;
import java.util.List;

public class FilterExecise {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(12,13,16);
        number.stream().filter((Integer parity)->{
            return parity % 2 == 0;
        }).forEach((Integer parity1)->{
            System.out.println(parity1);
        });
    }
}
