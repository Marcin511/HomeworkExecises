package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names = Arrays.asList("Piotr", "Joanna", "Krzysztof");
        names.stream().map((String name) -> {

            return name.toUpperCase();

        }).forEach((String name) -> {
            System.out.println(name);
        });
    }
}
