package Company;

import Employees.Employee;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private final String companyName;
    private final Integer cuit;
    private Map<Integer, Employee> employees=new HashMap<>();
    private Integer counter=0;

    public Company(String companyName, Integer cuit) {
        this.companyName=companyName;
        this.cuit=cuit;
    }

    public void addEmployee(Employee aEmployee){
        if (!employees.containsValue(aEmployee)){
            employees.put(counter, aEmployee);
            counter++;
        }
    }

    public Double totalSalary(){
        Double salaryCounter=0.0;
        for (Employee employee : employees.values()){
            salaryCounter+=employee.salary();
        }
        return salaryCounter;
    }


}
