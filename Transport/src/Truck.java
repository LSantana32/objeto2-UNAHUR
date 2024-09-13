public class Truck extends Vehicle {
    private static final int MAX_WEIGHT = 16000;
    private static final double MAX_VOLUME = 20.0;

    protected Truck() {
        super(MAX_WEIGHT, MAX_VOLUME,0);
    }

    @Override
    public boolean canGoToCity(String aCity) {
        return true;
    }

}
