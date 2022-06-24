package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EcerciseMap2 {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        names = Arrays.asList(10,200,300);
        names.stream().map((Integer number) -> {

            return number+10;

        }).forEach((Integer number) -> {
            System.out.println(number);
        });
    }
}

