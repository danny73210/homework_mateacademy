package jdbc.service;

import jdbc.model.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);

    Customer getCustomer(long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(long id);
}
