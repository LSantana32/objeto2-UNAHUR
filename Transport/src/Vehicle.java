import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle {

    private final int maxWeight;
    private final double maxVolume;
    private final int maxCities;
    private Set<String>cities=new HashSet<>();

    protected Vehicle(int maxWeight, double maxVolume, int maxCities){
        this.maxWeight=maxWeight;
        this.maxVolume=maxVolume;
        this.maxCities=maxCities;
    }

    //Verifica si el paquete cumple con los requisitos de cada subclase
    public boolean canCarryPackage(Package aPackage) {
        return aPackage.getVolume()<=this.maxVolume && aPackage.getWeight()<=this.maxWeight;
    }

    //Verifica si el paquete puede ser llevado a destino.
    public boolean canGoToCity(String aCity){
        boolean output=false;
        //Primer caso: si el destino se encuentra en la coleccion
        if (cities.contains(aCity)){
            output=true;
        }
        //Segundo caso: si la longitud de la coleccion es menor al maximo de ciudades disponibles
        else if (cities.size() < maxCities) {
            output=true;
            cities.add(aCity);
        }
        return output;
    }

    //Verifica que se cumplan ambas condiciones
    public boolean canSendPackageToDestiny(Package aPackage) {
        return this.canCarryPackage(aPackage) && this.canGoToCity(aPackage.getDestiny());
    }
}
