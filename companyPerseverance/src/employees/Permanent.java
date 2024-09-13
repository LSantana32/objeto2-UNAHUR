package employees;

public class Permanent extends Employee{
    private static final double HOUR_VALUE=3000.0;
    private static final double SENIORITY_VALUE_PER_YEAR=1000.0;

    public Permanent(int hsWorked, boolean isMarried, int numberOfChildren, int seniorityYears) {
        super(hsWorked, isMarried, numberOfChildren, seniorityYears);
    }

    @Override
    public double getHourValue() {
        return HOUR_VALUE;
    }

    @Override
    public double getSeniorityValuePerYear() {
        return SENIORITY_VALUE_PER_YEAR;
    }
}
