import java.util.List;
import java.util.Objects;

public class Order {

    private final String id;
    private final List<Product> orderList;


    public Order(String id, List<Product> orderList) {
        this.id = id;
        this.orderList = orderList;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderList, order.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderList);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
