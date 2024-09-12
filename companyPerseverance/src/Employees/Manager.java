package Employees;

public class Manager extends Permanent{
    public Manager(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren, Integer yearsOfSeniority) {
        super(hsWorked, hasASpouse, numberOfChildren, yearsOfSeniority);
        this.setSeniorityValuePerYear(1500.0);
        this.setHsValue(4000.0);
    }
}
