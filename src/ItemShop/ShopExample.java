package ItemShop;

public class ShopExample {

    public static void main(String[] args) {
        LocalShop localShop = new LocalShop();
        WareHouse wareHouse = new WareHouse();
        WholeSaler wholeSaler = new WholeSaler();
        Producer producer = new Producer();
        localShop.setShopHandler(wareHouse);
        wareHouse.setShopHandler(wholeSaler);
        wholeSaler.setShopHandler(producer);
        ShopRequest shopRequest = new ShopRequest("Samsung Galaxy Tab S8", 1);
        localShop.processRequest(shopRequest);
    }
}
