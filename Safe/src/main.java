import java.util.Scanner;



public static void main(String[] args) {
    CajaDeSeguridad caja = new CajaDeSeguridad();
    Scanner entrada= new Scanner(System.in);

    Boolean salida= false;
    Integer opcion;

    System.out.println("Bienvenido a la cajeta foerte");
    while (salida != true) {
        System.out.println("1-Asignar contrasena");
        System.out.println("2-Abrir caja");
        System.out.println("3-Cambiar contrasena");
        System.out.println("4-Salir");
        System.out.println("Elija una opcion:");
        opcion= entrada.nextInt();

        try {
            switch (opcion) {
                case 1:
                    if (caja.getPw() == null) {

                        caja.cerrarCajaSiEstaAbierta();

                        System.out.println("Asigna una longitud de contrasena:");
                        caja.longitudContrasena(entrada.nextInt());}

                    System.out.println("Asigna una contrasena respetando la longitud dada");
                    caja.asignarContrasena(entrada.nextInt());

                    break;

                case 2:
                    if (caja.getEstado().equals("Cerrada")) {
                        System.out.println("Ponga la contrasena:");
                        caja.abrirCaja(entrada.nextInt());
                        if (caja.getEstado().equals("Bloquea2")) {
                            salida= true;
                        }
                    } else {
                        System.out.println("La caja se encuentra abierta");
                    }
                    break;

                case 3:
                    System.out.println("Escriba la contrasena actual:");
                    if (caja.esMismaContrasena(entrada.nextInt())) {
                        System.out.println("Escriba una nueva contrasena");
                        caja.asignarContrasena(entrada.nextInt());

                        break;
                    }
                case 4:
                    salida=true;

                    break;

                default:
                    System.out.println("Las opciones son entre 1 y 4");
            }
        }catch(Exception e){
            System.out.println("Debe escribir un numero");
            entrada.next();
        }
    }

}