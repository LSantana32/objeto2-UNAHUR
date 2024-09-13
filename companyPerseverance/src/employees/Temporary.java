package employees;

public class Temporary extends Employee{
    private final static double HOUR_VALUE=2000.0;

    public Temporary(int hsWorked, boolean isMarried, int numberOfChildren) {
        super(hsWorked, isMarried, numberOfChildren,0);
    }

    @Override
    public double getHourValue() {
        return HOUR_VALUE;
    }

    @Override
    public double getSeniorityValuePerYear() {
        return 0;
    }
}

