package ar.edu.unahur.po2.parcial;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class AutobusTest {
  Autobus autobus = new Autobus("Pedro");
  Pasajero ana = new Pasajero("Ana",13);
  Pasajero lucas = new Pasajero("Lucas",63);
  Pasajero rocio = new Pasajero("Rocio",30);
  Pasajero jorge = new Pasajero("Jorge",72);
  Pasajero mariano = new Pasajero("Mariano",44);

  @Test
    public void cambiarChofer() {
      autobus.cambiarChofer("Pablo");
      assertEquals("Pablo", autobus.getChofer());
  }

  @Test
  public void verificarQueLosPasajerosEstenOrdenados() {
    autobus.agregarPasajero(ana);
    autobus.agregarPasajero(lucas);
    autobus.agregarPasajero(rocio);
    autobus.agregarPasajero(jorge);
    autobus.agregarPasajero(mariano);
    List<Pasajero> valorEsperado = List.of(jorge, lucas, mariano, rocio, ana);
    assertEquals(valorEsperado, autobus.getPasajeros());
  }

  @Test
  public void cambiarChoferSinPasajeros(){
    autobus.cambiarChofer("Pablo");
    assertEquals("Pablo", autobus.getChofer());
  }

  @Test
  public void noPoderCambiarChoferPorPasajerosSubidos(){
    autobus.agregarPasajero(rocio);
    autobus.agregarPasajero(jorge);
    autobus.cambiarChofer("Beatriz");
    assertEquals("Pedro", autobus.getChofer());
  }

}