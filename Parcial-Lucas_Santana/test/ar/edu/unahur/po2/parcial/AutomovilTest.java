package ar.edu.unahur.po2.parcial;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AutomovilTest {
    Automovil automovil=new Automovil("Leandro");

    Pasajero mariano = new Pasajero("Mariano",44);
    Pasajero ana = new Pasajero("Ana",13);
    Pasajero lucas = new Pasajero("Lucas",63);
    Pasajero rocio = new Pasajero("Rocio",30);

    @Test
    public void queNoSePuedanSubirMasDeTresPasajeros() {
        automovil.agregarPasajero(mariano);
        automovil.agregarPasajero(ana);
        automovil.agregarPasajero(lucas);
        automovil.agregarPasajero(rocio);
        List<Pasajero> valorEsperado= List.of(lucas,mariano,ana);
        assertEquals(valorEsperado,automovil.getPasajeros());
    }

    @Test
    public void hacerRecorridoConAuto(){
        automovil.recorrerCantidadDeKilometrosRecorridos(7.8);
        assertEquals(7.8, automovil.getCantidadDeKilometrosRecorridos(),0.0);
    }
}