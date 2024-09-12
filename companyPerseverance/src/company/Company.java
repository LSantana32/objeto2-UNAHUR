package company;

import java.util.HashSet;
import java.util.Set;

import employees.Employee;

public class Company {
    private final String companyName;
    private final int cuit;
    private Set<Employee> employees = new HashSet<>();
    private int counter = 0;

    public Company(String companyName, Integer cuit) {
        this.companyName = companyName;
        this.cuit = cuit;
    }

    public void addEmployee(Employee aEmployee) {
        employees.add(aEmployee);
    }

    public double totalSalary() {
        double salaryCounter = 0.0;
        for (Employee employee : employees) {
            salaryCounter += employee.getSalary();
        }
        return salaryCounter;
    }


}
