package factory_method.factory_method;

public class NutsChocolate extends Chocolate {
    public NutsChocolate() {
        super(ChocolateType.NUTS);
    }

    @Override
    public String getDescription() {
        return "Czekolada orzechowa";
    }

    private void showNutsInfo(int percentage) {
        System.out.println(String.format("Czekolada zawiera %d%% orzechów", percentage));
    }

    @Override
    public void showChocolate() {
        showCacaoInfo(50);
        showNutsInfo(30);
        showSugarInfo(20);
    }
}