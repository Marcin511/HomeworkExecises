package oop;

import java.util.ArrayList;
import java.util.List;

public class Streamer {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("daniel");
        names.add("karol");
        names.add("paweł");
        names.stream().forEach((String name) -> {
            System.out.println("name " + name);
        });
    }
}
