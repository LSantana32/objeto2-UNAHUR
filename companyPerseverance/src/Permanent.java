public class Permanent extends Employee{
    private Integer yearsOfSeniority;

    public Permanent(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren, Integer yearsOfSeniority) {
        super(hsWorked, hasASpouse, numberOfChildren);
        this.yearsOfSeniority = yearsOfSeniority;
        this.setHsValue(3000.0);
    }

    public Double senioritySalary() {
        return this.yearsOfSeniority*1000.0;
    }

    @Override
    public Double salary() {
        return super.salary()+this.senioritySalary();
    }
}
