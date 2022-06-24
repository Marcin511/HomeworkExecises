package factory_method.factory_method;

public class MilkChocolate extends Chocolate {
    public MilkChocolate() {
        super(ChocolateType.MILK);
    }

    @Override
    public String getDescription() {
        return "Czekolada mleczna";
    }

    private void showMilkInof(int percentage) {
        System.out.println(String.format("Czekolada zawiera %d%% mleka", percentage));
    }

    @Override
    public void showChocolate() {
        showCacaoInfo(30);
        showMilkInof(60);
        showSugarInfo(10);
    }
}