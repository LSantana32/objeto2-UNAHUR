package ar.edu.unahur.po2.parcial;

public class Pasajero {
    private String nombre;
    private Integer edad;

    public Pasajero(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }
}
