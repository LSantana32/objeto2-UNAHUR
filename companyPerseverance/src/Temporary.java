public class Temporary extends Employee{
    public Temporary(Integer hsWorked, Boolean hasASpouse, Integer numberOfChildren) {
        super(hsWorked, hasASpouse, numberOfChildren);
        this.setHsValue(2000.0);
    }
}
