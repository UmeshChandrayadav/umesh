package services;
import entities.Order;
import java.util.ArrayList;
import java.util.List;
public class OrderService {
    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
    public Order findOrderById(int orderId) {
        for (Order o : orders) {
            if (o.getOrderId() == orderId) return o;
        }
        return null;
    }
}
