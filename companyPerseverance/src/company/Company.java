package company;

import employees.Employee;


import java.util.HashSet;

import java.util.Set;

public class Company {
    private final String companyName;
    private final Integer cuit;
    private Set<Employee> employees= new HashSet<>();

    public Company(String companyName, Integer cuit) {
        this.companyName=companyName;
        this.cuit=cuit;
    }

    public void addEmployee(Employee aEmployee){
        employees.add(aEmployee);
    }

    public Double totalSalary(){
        Double salaryCounter=0.0;
        for (Employee employee : employees){
            salaryCounter+=employee.getSalary();
        }
        return salaryCounter;
    }
}
