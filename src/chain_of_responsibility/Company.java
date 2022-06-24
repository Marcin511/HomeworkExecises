package chain_of_responsibility;

public class Company {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(125000,
                "Nowy notebook dla pracownika");
        ManagerPurchasePower manager = new ManagerPurchasePower();
        DirectorPurchasePower director = new DirectorPurchasePower();
        VicePresidentPurchasePower vicePresident = new VicePresidentPurchasePower();
        PresidentPurchasePower president = new PresidentPurchasePower();
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        manager.processRequest(purchaseRequest);
    }
}