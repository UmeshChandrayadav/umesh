package entities;
import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<Product, Integer> items = new HashMap<>();
    public Map<Product, Integer> getItems() {
        return items;
    }
    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }
    public void clearCart() {
        items.clear();
    }
}
