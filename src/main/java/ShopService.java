import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    public Product getProduct(String id) {
        return productRepo.get(id);
    }

    public List<Product> listAllProducts() {
        return productRepo.listProductList();
    }

    public Order getOrder(String id) {
        return orderRepo.getOrder(id);
    }

    public Order addOrder(List<String> productIds) {
        List<Product> addedProducts = new ArrayList<>();

        for (String productId : productIds) {
            Product product = productRepo.get(productId);
            if (product == null) {

                return null;
            }
            addedProducts.add(product);
        }

        Order newOrder = new Order(UUID.randomUUID().toString(), addedProducts);
        return orderRepo.addOrder(newOrder);

    }

    public List<Order> listAllOrders() {
        return orderRepo.listAllOrders();
    }
}
