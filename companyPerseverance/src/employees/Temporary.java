package employees;

public class Temporary extends Employee {

    private static final double HS_VALUE = 2000.0;

    public Temporary(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren) {
        super(hsWorked, hasASpouse, numberOfChildren, 0);
    }

    @Override
    public double getHourValue() {
        return HS_VALUE;
    }

    @Override
    public double getSeniorityValuePerYear() {
        return 0;
    }
}
