package employees;

public class Permanent extends Employee {
    private static final double HS_VALUE = 3000.0;
    private static final double SENIORITY_VALUE_PER_YEAR = 1000.0;

    public Permanent(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren, Integer yearsOfSeniority) {
        super(hsWorked, hasASpouse, numberOfChildren, yearsOfSeniority);
    }

    @Override
    public double getHourValue() {
        return HS_VALUE;
    }

    @Override
    public double getSeniorityValuePerYear() {
        return SENIORITY_VALUE_PER_YEAR;
    }
}
