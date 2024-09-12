package Employees;

public class Employee {
    private final Integer hsWorked;
    private final Boolean hasASpouse;
    private final Integer numberOfChildren;
    private Double hsValue;

    public Employee(Integer hsWorked,Boolean hasASpouse, Integer numberOfChildren){
        this.hsWorked = hsWorked;
        this.hasASpouse = hasASpouse;
        this.numberOfChildren = numberOfChildren;
    }

    public void setHsValue(Double newHsValue){
        hsValue = newHsValue;
    }

    public Double workedSalary(){
        return this.hsWorked * this.hsValue;
    }

    public Double familiarSalary(){
        Double salaryPerSpouse=(this.hasASpouse ? 1000.0 : 0.0);
        Double salaryPerChild=(this.numberOfChildren>0 ? this.numberOfChildren * 2000.0 : 0.0);
        return salaryPerChild + salaryPerSpouse;
    }

    public Double salary(){
        return this.workedSalary() + this.familiarSalary();
    }
}
