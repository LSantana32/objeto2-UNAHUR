package employees;

public abstract class Employee {

    private final int hsWorked;
    private final boolean isMarried;
    private final int numberOfChildren;
    private final int seniorityYears;

    protected Employee(int hsWorked, boolean isMarried, int numberOfChildren, int seniorityYears) {
        this.hsWorked = hsWorked;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
        this.seniorityYears = seniorityYears;
    }

    public abstract double getHourValue();

    public abstract double getSeniorityValuePerYear();

    private double getWorkedSalary() {
        return this.hsWorked * this.getHourValue();
    }

    public double getSeniorityYears() {
        return this.seniorityYears;
    }

    public double getFamilySalary() {
        double salaryPerSpouse = (this.isMarried ? 1000.0 : 0.0);
        double salaryPerChild = (this.numberOfChildren > 0 ? this.numberOfChildren * 2000.0 : 0.0);
        return salaryPerChild + salaryPerSpouse;
    }

    public double getSalary() {
        return this.getWorkedSalary() + this.getFamilySalary() + this.getSenioritySalary();
    }

    private double getSenioritySalary() {
        return this.getSeniorityYears() * this.getSeniorityValuePerYear();
    }
}
