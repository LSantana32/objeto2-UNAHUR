package employees;

public abstract class Employee {
    // No se necesita tratar los valores como objetos, podemos usar tipos primitivos (Integer -> int)
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

    /**
     * Permite tener el valor de hora de cada empleado, sea cual sea.
     * Al ser abstracto, cada clase puede implementar cuanto deberia ser el valor
     */
    public abstract double getHourValue();

    /**
     * Permite tener el valor por año de antigüedad de cada empleado, sea cual sea
     * Al ser abstracto, cada clase puede implementar cuanto deberia ser el valor.
     */
    public abstract double getSeniorityValuePerYear();

    /**
     * Permite obtener el valor del salario por horas trabajadas, no cambia el calculo
     */
    private double getWorkedSalary() {
        return this.hsWorked * this.getHourValue();
    }

    /**
     * Permite obtener la cantidad de años de antigüedad
     */
    public double getSeniorityYears() {
        return this.seniorityYears;
    }

    /**
     * Permite obtener el salario familiar, no cambia el calculo
     */
    public double getFamilySalary() {
        double salaryPerSpouse = (this.isMarried ? 1000.0 : 0.0);
        double salaryPerChild = (this.numberOfChildren > 0 ? this.numberOfChildren * 2000.0 : 0.0);
        return salaryPerChild + salaryPerSpouse;
    }

    /**
     * Permite obtener el salario, no cambia el calculo
     */
    public double getSalary() {
        return this.getWorkedSalary() + this.getFamilySalary() + this.getSenioritySalary();
    }

    /**
     * Permite obtener el salario por antigüedad
     */
    private double getSenioritySalary() {
        return this.getSeniorityYears() * this.getSeniorityValuePerYear();
    }

}
