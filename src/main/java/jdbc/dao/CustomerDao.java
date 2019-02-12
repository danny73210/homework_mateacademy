package jdbc.dao;

import jdbc.model.Customer;

public interface CustomerDao {
    void addCustomer(Customer customer);

    Customer getCustomer(long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(long id);
}
