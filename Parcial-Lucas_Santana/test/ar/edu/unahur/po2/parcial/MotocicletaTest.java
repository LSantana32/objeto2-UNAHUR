package ar.edu.unahur.po2.parcial;

import org.junit.Test;

import static org.junit.Assert.*;

public class MotocicletaTest {
    Motocicleta motocicleta=new Motocicleta("Juan");

    @Test
    public void queNoSePuedaCambiarElChoferPorqueTieneAcompañante(){
        motocicleta.agregarAcompañante("Maria");
        motocicleta.cambiarChofer("Pedro");
        assertEquals("Juan",motocicleta.getChofer());
    }

    @Test
    public void queSePuedaCambiarElChoferSinAcompañante(){
        motocicleta.cambiarChofer("Pedro");
        assertEquals("Pedro",motocicleta.getChofer());
    }
}