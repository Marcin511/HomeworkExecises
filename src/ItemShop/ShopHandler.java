package ItemShop;

import java.util.Map;

public abstract class ShopHandler {

    private ShopHandler shopHandler;

    public void setShopHandler(ShopHandler shopHandler) {
        this.shopHandler = shopHandler;
    }

    public abstract Map<String, Integer> availableProducts();

    public abstract String getShopName();

    public void processRequest(ShopRequest shopRequest) {
        if (shopRequest.getQuantity() <= availableProducts().getOrDefault(shopRequest.getProduct(), 0)){
            System.out.println("Product: " + shopRequest.getProduct() + " available in " + getShopName());
        } else if(shopHandler != null) {
            shopHandler.processRequest(shopRequest);
        }else {
            System.out.println("Product " + shopRequest.getProduct() + " not available");
        }
    }
}
