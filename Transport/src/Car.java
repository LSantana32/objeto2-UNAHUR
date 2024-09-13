import java.util.HashSet;
import java.util.Set;


public class Car extends Vehicle {
    private static final int MAX_WEIGHT = 500;
    private static final double MAX_VOLUME = 2;
    private static final int MAX_CITIES=3;

    protected Car() {
        super(MAX_WEIGHT, MAX_VOLUME, MAX_CITIES);
    }

}
