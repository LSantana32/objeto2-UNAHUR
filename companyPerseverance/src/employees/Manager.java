package employees;

public class Manager extends Permanent{

    private static final double HOUR_VALUE = 4000.0;
    private static final double SENIORITY_VALUE_PER_YEAR = 1500.0;

    public Manager(int hsWorked, boolean isMarried, int numberOfChildren, int seniorityYears) {
        super(hsWorked, isMarried, numberOfChildren, seniorityYears);
    }

    @Override
    public double getHourValue(){
        return HOUR_VALUE;
    }

    @Override
    public double getSeniorityValuePerYear(){
        return SENIORITY_VALUE_PER_YEAR;
    }
}

