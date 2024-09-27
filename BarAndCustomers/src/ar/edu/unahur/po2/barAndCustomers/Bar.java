package ar.edu.unahur.po2.barAndCustomers;

import java.util.*;

public class Bar {
    List<Customer> customers = new ArrayList<Customer>();

    public Bar() {}

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            this.customers.add(customer);
        }
    }

    public Integer amountOfCustomers() {
        return this.customers.size();
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public List<Customer> getCustomersPerName() {
        List<Customer> temporalCustomers = new ArrayList<>(this.customers);
        temporalCustomers.sort(Comparator.comparing(Customer::getName));
        return temporalCustomers;
    }

    public List<Customer> getCustomersPerAge() {
        List<Customer> temporalCustomers = new ArrayList<>(this.customers);
        temporalCustomers.sort(Comparator.comparing(Customer::getAge));
        return temporalCustomers;
    }

    public void removeCustomer(Customer customer) {
        if (customers.contains(customer)) {
            this.customers.remove(customer);}
    }
}
