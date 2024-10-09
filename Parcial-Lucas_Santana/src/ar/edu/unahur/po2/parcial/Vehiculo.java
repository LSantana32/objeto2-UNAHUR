package ar.edu.unahur.po2.parcial;

public abstract class Vehiculo {
    /*
    Se interpretó que la motocicleta puede llevar un acompañante como máximo y
    que tanto el autobus como automovil pueden llevar pasajeros (es decir que la
    motocicleta no puede llevar pasajeros y que el autobus y el automovil no pueden llevar acompañantes)
    */
    protected String chofer;
    private Double cantidadDeKilometrosRecorridos;


// Se interpretó que al inicializar un vehiculo, asigne a un chofer por parametro.
    public Vehiculo(String chofer){
        this.chofer= chofer;
        this.cantidadDeKilometrosRecorridos=0.0;
    };

    public abstract void cambiarChofer(String otroChofer);


    public Double getCantidadDeKilometrosRecorridos() {
        return cantidadDeKilometrosRecorridos;
    }

    public void recorrerCantidadDeKilometrosRecorridos(Double cantidadDeKilometrosRecorridos) {
        this.cantidadDeKilometrosRecorridos = cantidadDeKilometrosRecorridos;
    }

    public String getChofer() {
        return chofer;
    }
}
