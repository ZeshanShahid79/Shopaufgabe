import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ShopServiceTest {

    @Test
    void getProduct() {
        // GIVEN
        ShopService shopService = new ShopService();

        // WHEN
        Product actual = shopService.getProduct("1");

        // THEN
        Product expected = new Product("1", "Banana");

        assertEquals(expected, actual);
    }

    @Test
    void listAllProducts() {
        // GIVEN
        ShopService shopService = new ShopService();

        // WHEN
        List<Product> actual = shopService.listAllProducts();

        // THEN
        List<Product> expected = new ArrayList<>(List.of(new Product("1", "Banana"), new Product("2", "Pineapple")));
        assertEquals(expected, actual);

    }

    @Test
    void getOrder() {
        // GIVEN
        ShopService shopService = new ShopService();
        Order expected = new Order("1", List.of(new Product("1", "Banana")));

        // WHEN
        Order actual = shopService.getOrder("1");

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void listAllOrders() {
        // GIVEN
        ShopService shopService = new ShopService();
        List<Order> expected = new ArrayList<>(List.of(new Order("1", List.of(new Product("1", "Banana"))), new Order("2", List.of(new Product("2", "Pineapple")))));

        // WHEN
        List<Order> actual = shopService.listAllOrders();

        // THEN
        assertEquals(expected, actual);
    }
}
