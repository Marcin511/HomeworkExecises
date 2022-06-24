package factory_method.factory_method;

public class MilkaFactoryProduction {
    public static void main(String[] args) {
        ChocolateFactory chocolateFactory = new MilkaFactory();
        Chocolate chocolate = chocolateFactory.produceChocolate(ChocolateType.DARK);
        System.out.println(String.format("opis: %s", chocolate.getDescription()));
        chocolate.showChocolate();
    }
}