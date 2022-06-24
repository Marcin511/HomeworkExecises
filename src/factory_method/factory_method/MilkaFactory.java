package factory_method.factory_method;

public class MilkaFactory implements ChocolateFactory {
    @Override
    public Chocolate produceChocolate(ChocolateType type) {
        Chocolate chocolate = null;
        switch (type) {
            case DARK:
                chocolate = new DarkChocolate();
                break;
            case MILK:
                chocolate = new MilkChocolate();
                break;
            case NUTS:
                chocolate = new NutsChocolate();
                break;
        }
        return chocolate;
    }
}