package ar.edu.unahur.po2.barAndCustomers;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BarTest {
    Bar bar = new Bar();
    Customer customer1= new Customer("Lucas",25,12345);
    Customer customer2= new Customer("Mariano",23,12346);
    Customer customer3= new Customer("Alberto",21,12347);

    @Test
    public void registerCustomer() {
        bar.addCustomer(customer1);
        assertTrue(bar.getCustomers().contains(customer1));
    }

    @Test
    public void notRegisterRepeatCustomer() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer1);
        List<Customer> expectedValue = List.of(customer1);
        List<Customer> actualValue = bar.getCustomers();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void checkAmountOfCustomer() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);
        bar.addCustomer(customer3);
        int expectedValue=3;
        int actualValue= bar.amountOfCustomers();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void submitCustomerList() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);
        bar.addCustomer(customer3);
        List<Customer> expectedValue = List.of(customer1,customer2,customer3);
        List<Customer> actualValue = bar.getCustomers();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void submitCustomerListSortedByName() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);
        bar.addCustomer(customer3);
        List<Customer> expectedValue = List.of(customer3,customer1,customer2);
        List<Customer> actualValue = bar.getCustomersPerName();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void submitCustomerListSortedByAge() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);
        bar.addCustomer(customer3);
        List<Customer> expectedValue = List.of(customer3,customer2,customer1);
        List<Customer> actualValue = bar.getCustomersPerAge();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeCustomer() {
        bar.addCustomer(customer1);
        bar.addCustomer(customer2);
        bar.addCustomer(customer3);
        bar.removeCustomer(customer1);
        List<Customer> expectedValue = List.of(customer2,customer3);
        List<Customer> actualValue = bar.getCustomers();
        assertEquals(expectedValue, actualValue);
    }
}