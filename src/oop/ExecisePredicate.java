package oop;

import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecisePredicate {
    public static void main(String[] args) {
        Predicate<Integer> year = (Integer value) -> {
            LocalDate localDate = LocalDate.now();
            return localDate.isLeapYear();
        };
        System.out.println(year.test(LocalDate.EPOCH.getYear()));
    }

}
