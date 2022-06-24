package ItemShop;

import java.util.HashMap;
import java.util.Map;

public class WholeSaler extends ShopHandler {

    @Override
    public Map<String, Integer> availableProducts() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Samsung Galaxy Tab S8", 1);
        map.put("Iphone 13 pro", 1);
        return map;
    }

    @Override
    public String getShopName() {
        return "Wholesaler";
    }
}
