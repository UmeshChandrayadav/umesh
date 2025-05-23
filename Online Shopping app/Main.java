import entities.*;
import services.*;
import java.util.*;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();
    private static AdminService adminService = new AdminService();
    private static CustomerService customerService = new CustomerService();
    private static OrderService orderService = new OrderService();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> adminMenu();
                case 2 -> customerMenu();
                case 3 -> { System.out.println("Exiting..."); System.exit(0); }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Product\n2. Remove Product\n3. View Products\n4. Create Admin\n5. View Admins\n6. Update Order Status\n7. View Orders\n8. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> { System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int stock = scanner.nextInt();
                    productService.addProduct(new Product(id, name, price, stock));
                    System.out.println("Product added successfully!");
                }
                case 2 -> { System.out.print("Enter Product ID to remove: ");
                    int id = scanner.nextInt();
                    productService.removeProduct(id);
                    System.out.println("Product removed successfully!");
                }
                case 3 -> { System.out.println("Products:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                }
                case 4 -> { System.out.print("Enter Admin ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Admin Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Admin Email: ");
                    String email = scanner.next();
                    adminService.addAdmin(new Admin(id, name, email));
                    System.out.println("Admin created successfully!");
                }
                case 5 -> { System.out.println("Admins:");
                    for (Admin a : adminService.getAdmins()) {
                        System.out.println(a);
                    }
                }
                case 6 -> { System.out.print("Enter Order ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
                    String status = scanner.next();
                    Order order = orderService.findOrderById(id);
                    if (order != null) {
                        order.setStatus(status);
                        System.out.println("Order status updated!");
                    } else {
                        System.out.println("Order not found!");
                    }
                }
                case 7 -> { System.out.println("Orders:");
                    for (Order o : orderService.getOrders()) {
                        System.out.println("Order ID: " + o.getOrderId() + ", Customer: " + o.getCustomer().getUsername() + ", Status: " + o.getStatus());
                        for (ProductQuantityPair pq : o.getProducts()) {
                            System.out.println("  Product: " + pq.getProduct().getName() + ", Quantity: " + pq.getQuantity());
                        }
                    }
                }
                case 8 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private static void customerMenu() {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Customer\n2. View Customers\n3. Place Order\n4. View Orders\n5. View Products\n6. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Username: ");
                    String username = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    System.out.print("Enter Address: ");
                    String address = scanner.next();
                    customerService.addCustomer(new Customer(id, username, email, address));
                    System.out.println("Customer created successfully!");
                }
                case 2 -> {
                    System.out.println("Customers:");
                    for (Customer c : customerService.getCustomers()) {
                        System.out.println(c);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Customer ID: ");
                    int id = scanner.nextInt();
                    Customer customer = customerService.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }
                    List<ProductQuantityPair> orderItems = new ArrayList<>();
                    while (true) {
                        System.out.print("Enter Product ID to add to order (or -1 to complete): ");
                        int pid = scanner.nextInt();
                        if (pid == -1) break;
                        Product product = productService.findProductById(pid);
                        if (product == null) {
                            System.out.println("Product not found!");
                            continue;
                        }
                        System.out.print("Enter quantity: ");
                        int qty = scanner.nextInt();
                        orderItems.add(new ProductQuantityPair(product, qty));
                    }
                    Order order = new Order(customer, orderItems);
                    orderService.addOrder(order);
                    System.out.println("Order placed successfully!");
                }
                case 4 -> {
                    System.out.print("Enter Customer ID: ");
                    int id = scanner.nextInt();
                    Customer customer = customerService.findCustomerById(id);
                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }
                    System.out.println("Orders:");
                    for (Order o : orderService.getOrders()) {
                        if (o.getCustomer().getUserId() == id) {
                            System.out.println("Order ID: " + o.getOrderId() + ", Status: " + o.getStatus());
                            for (ProductQuantityPair pq : o.getProducts()) {
                                System.out.println("  Product: " + pq.getProduct().getName() + ", Quantity: " + pq.getQuantity());
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Products:");
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }
                }
                case 6 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
