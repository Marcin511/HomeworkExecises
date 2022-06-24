package ItemShop;

import java.util.HashMap;
import java.util.Map;

public class WareHouse extends ShopHandler{
    @Override
    public Map<String, Integer> availableProducts() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Samsung Galaxy S20", 1);
        map.put("Iphone XS", 2);
        return map;
    }

    @Override
    public String getShopName() {
        return "Warehouse";
    }
}
