package ar.edu.unahur.po2.parcial;

public class Motocicleta extends Vehiculo {
    private String acompañante;

    public Motocicleta(String chofer) {
        super(chofer);
        this.acompañante = null;
    }

    @Override
    public void cambiarChofer(String otroChofer) {
        if(this.acompañante==null){
            this.chofer = otroChofer;
        }
    }

    public void agregarAcompañante(String nuevoAcompañante) {
        if (this.acompañante==null){
            this.acompañante=nuevoAcompañante;
        }
    }
}
