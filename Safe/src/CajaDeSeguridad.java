import java.util.Scanner;

public class CajaDeSeguridad {

    private Integer longitud;
    private Integer pw;
    private String estado;
    private Integer counter=0;
    private Integer block= 3;

    public CajaDeSeguridad() {
        this.longitud=null;
        this.pw=null;
        this.estado="Abierta";
    }


    public Boolean estaAbierta() {
        return this.estado=="Abierta";
    }

    public void cerrarCajaSiEstaAbierta() {
        if(this.estaAbierta()) {
            this.estado="Cerrada";
        }
    }

    public void asignarContrasena(Integer contraseña) {
        if (Integer.toString(contraseña).length()==this.longitud) {
            this.estado="Cerrada";
            this.pw=contraseña;
        }
        else {
            System.out.println("Respetar longitud dada, vuelva a intentarlo:");
            Scanner pwNew = new Scanner(System.in);
            this.asignarContrasena(pwNew.nextInt());
        }
    }

    public void longitudContrasena(Integer unaLongitud) {
        this.longitud=unaLongitud;
    }

    public void abrirCaja(Integer contrasena) {

        if (this.pw.equals(contrasena) && this.counter < block) {
            this.estado = "Abierta";
            System.out.println("La pusiste bien flaco");


        } else if (this.counter.equals(block)) {
            this.estado="Bloquea2";
            System.out.println("Bloquea2");;
        }
        else{
            this.uploadCounter();
            System.out.println("Contrasena incorrecta, vuelva a intentar:");
            Scanner pw = new Scanner(System.in);
            this.abrirCaja(pw.nextInt());
        }
    }

    public Boolean esMismaContrasena(Integer contrasena) {
        return this.pw.equals(contrasena);
    }

    private void uploadCounter (){
        this.counter++;
    }


    public Integer getPw() {
        return this.pw;
    }

    public String getEstado() {
        return this.estado;
    }

    public Integer getLongitud(){
        return this.longitud;
    }
}