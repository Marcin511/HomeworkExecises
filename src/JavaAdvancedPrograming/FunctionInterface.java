package JavaAdvancedPrograming;

public class FunctionInterface {
    ToUpperCase upperCase = (String x) -> {
        System.out.println(x);
    };
    Downloader downloader = (String y) -> {
        System.out.println(y);
    };
    Converter converter = (String n) -> {
        System.out.println(n);
    };
    Calculator calculator = (int s,int z) -> {
        System.out.println(s + z);
        return s + z;
    };
}

interface ToUpperCase {
    void invoke(String text);
}
interface Downloader {
    void download(String file);
}
interface Converter {
    void convert(String number); //gdzie number to liczba przekazana w postaci tekstowej
}
interface Calculator {
    int calculate(int a, int b);
}
