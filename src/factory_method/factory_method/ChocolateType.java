package factory_method.factory_method;

public enum ChocolateType {
    MILK("milk"), NUTS("nuts"), DARK("dark");
    private String choclateType;

    ChocolateType(String choclateType) {
        this.choclateType = choclateType;
    }
}