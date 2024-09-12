package Employees;

public class Permanent extends Employee{
    private final Integer yearsOfSeniority;
    private Double seniorityValuePerYear;

    public Permanent(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren, Integer yearsOfSeniority) {
        super(hsWorked, hasASpouse, numberOfChildren);
        this.yearsOfSeniority = yearsOfSeniority;
        this.setSeniorityValuePerYear(1000.0);
        this.setHsValue(3000.0);
    }

    public void setSeniorityValuePerYear(Double newSeniorityValuePerYear) {
        seniorityValuePerYear = newSeniorityValuePerYear;
    }

    public Double senioritySalary() {
        return this.yearsOfSeniority*seniorityValuePerYear;
    }

    @Override
    public Double salary() {
        return super.salary()+this.senioritySalary();
    }
}
