package ar.edu.unahur.po2.parcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Autobus extends Vehiculo {

    protected Integer limiteDePasajeros;
    private List<Pasajero> pasajeros;

    public Autobus(String chofer) {
        super(chofer);
        this.limiteDePasajeros=20;
        this.pasajeros = new ArrayList<Pasajero>();
    }

    @Override
    public void cambiarChofer(String otroChofer) {
        if(this.pasajeros.isEmpty()){
            chofer=otroChofer;
        }
    }


    // Se interpretó que la puerta de ingreso esta al principio de la lista (orden decreciente)

    public void agregarPasajero(Pasajero pasajero){
        if (this.pasajeros.size() < this.limiteDePasajeros && !this.pasajeros.contains(pasajero)) {
            this.pasajeros.add(pasajero);
            pasajeros.sort(Comparator.comparing(Pasajero::getEdad).reversed());
        }
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
