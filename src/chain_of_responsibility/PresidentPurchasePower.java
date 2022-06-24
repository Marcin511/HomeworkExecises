package chain_of_responsibility;

class PresidentPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() {
        return BASE * 60;
    }

    @Override
    protected String getRole() {
        return "President";
    }
}