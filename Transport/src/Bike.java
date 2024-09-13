
public class Bike extends Vehicle {
    private static final int MAX_WEIGHT = 15;
    private static final double MAX_VOLUME = 0.125;
    private static final int MAX_CITIES = 1;
    private int packageCounter = 0;


    protected Bike() {
        super(MAX_WEIGHT, MAX_VOLUME, MAX_CITIES);
    }

    @Override
    public boolean canCarryPackage(Package aPackage) {
        boolean canCarry = false;
        if (super.canCarryPackage(aPackage) && packageCounter < 2) {
            packageCounter++;
            canCarry = true;
        }
        return canCarry;
    }


}
