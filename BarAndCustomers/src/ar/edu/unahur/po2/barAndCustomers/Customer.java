package ar.edu.unahur.po2.barAndCustomers;

public class Customer {

    private final String name;
    private final Integer age;
    private final Integer dni;

    public Customer(String name, Integer age, Integer dni) {
        this.name=name;
        this.age =age;
        this.dni= dni;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getDni() {
        return dni;
    }

    public String toString() {
        return "Customer "+ dni +" has been created";
    }
}
