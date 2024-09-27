package ar.edu.unahur.po2.barAndCustomers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void createACustomer(){
        Customer customer1= new Customer("Lucas",25,12345);
        String expectedValue= "Customer 12345 has been created";
        String actualValue = customer1.toString();
        assertEquals(expectedValue, actualValue);
    }

}