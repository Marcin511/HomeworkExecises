package ItemShop;

import java.util.HashMap;
import java.util.Map;

public class LocalShop extends ShopHandler {
    @Override
    public Map<String, Integer> availableProducts() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Samsung Galaxy S22", 1);
        map.put("Samsung Galaxy S9", 2);
        return map;
    }

    @Override
    public String getShopName() {
        return "Local Shop";
    }
}
