package employees;

public class Manager extends Permanent {
    private static final double HS_VALUE = 4000.0;
    private static final double SENIORITY_VALUE_PER_YEAR = 1500.0;

    public Manager(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren, Integer yearsOfSeniority) {
        super(hsWorked, hasASpouse, numberOfChildren, yearsOfSeniority);
    }

    @Override
    public double getSeniorityValuePerYear() {
        return SENIORITY_VALUE_PER_YEAR;
    }

    @Override
    public double getHourValue() {
        return HS_VALUE;
    }
}
