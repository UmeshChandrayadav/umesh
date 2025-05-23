package services;
import entities.Product;
import java.util.ArrayList;
import java.util.List;
public class ProductService {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }
    public List<Product> getAllProducts() {
        return products;
    }
    public Product findProductById(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) return p;
        }
        return null;
    }
}
