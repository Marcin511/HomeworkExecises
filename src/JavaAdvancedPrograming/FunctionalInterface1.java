package JavaAdvancedPrograming;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterface1 {
}
class Account {
    public String name;

    public Account(String name) {
        this.name = name;
    }

    Function< String,Account> inToAccount = (String name) -> {
        return new Account(name);
    };
}
class Box {
    public Integer value;

    public Box(Integer value) {
        this.value = value;
    }

    Function<Integer, Box> inToBoX = (Integer value) -> {
        return new Box(value);
    };

    Supplier<String> getData = () -> {
        return String.valueOf(LocalDateTime.now());
    };
    Supplier<Character> getCharacter = () -> {
        Random r = new Random();
        int c = r.nextInt(97,123);
        char a = (char)c;
        return a;
    };
}