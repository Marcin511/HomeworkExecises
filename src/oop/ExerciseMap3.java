package oop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseMap3 {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        dates = Arrays.asList("12:34","07:07");
        dates.stream().map((String time) -> {
        String[] data = time.split(":");
            return LocalTime.of(Integer.parseInt(data[0]),Integer.parseInt(data[1]));

        }).forEach((LocalTime time) -> {
            System.out.println(time);
        });
    }
}

