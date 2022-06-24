package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names = Arrays.asList("Piotr", "Joanna", "Krzysztof");
        names.stream().forEach((String name) -> {
            System.out.println( name);
            System.out.println(name.length());
            if(name.length()%2 == 0){
                System.out.println("parzysta liczba znaków w iminiu: "+ name );
            }else{
                System.out.println("nieparzysta liczba znaków w iminiu: "+ name );
            }
        });

    }
}
