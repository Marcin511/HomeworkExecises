package factory_method.factory_method;

public abstract class Chocolate {
    protected ChocolateType chocolateType;

    public Chocolate(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    protected void showCacaoInfo(int percentage) {
        System.out.println(String.format("Czekolada zawiera %d%% kakao", percentage));
    }

    protected void showSugarInfo(int percentage) {
        System.out.println(String.format("Czekolada zawiera %d%% cukru", percentage));
    }

    public abstract String getDescription();

    public abstract void showChocolate();
}