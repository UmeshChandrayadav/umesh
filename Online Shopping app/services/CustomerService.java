package services;
import entities.Customer;
import java.util.ArrayList;
import java.util.List;
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public Customer findCustomerById(int customerId) {
        for (Customer c : customers) {
            if (c.getUserId() == customerId) return c;
        }
        return null;
    }
}
