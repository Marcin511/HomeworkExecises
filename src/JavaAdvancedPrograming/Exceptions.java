package JavaAdvancedPrograming;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Integer.parseInt("kot");
        } catch (NumberFormatException e) {
            System.out.println("nie da rady");
        }
    }
}