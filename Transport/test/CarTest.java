import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Vehicle car = new Car();

    @Test
    public void queNoPuedaLlevarUnPaquete() {
        Package paquete = new Package(3.0, 3.0, 3.0, 10, "Hurlingham");
        Boolean valorEsperado = false;
        Boolean valorObtenido = car.canCarryPackage(paquete);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void quePuedaEnviarPaqueteADestino() {
        Package paquete = new Package(0.1, 0.1, 0.1, 10, "Hurlingham");
        Boolean valorEsperado = true;
        Boolean valorObtenido = car.canSendPackageToDestiny(paquete);
        assertEquals(valorEsperado, valorObtenido);
    }


    @Test
    public void queNoPuedaEnviarPaqueteADestinoPorExcesoDeDestinos() {
        Package paquete = new Package(0.1, 0.1, 0.1, 10, "Hurlingham");
        Package paquete2 = new Package(0.1, 0.1, 0.1, 10, "Moron");
        Package paquete3 = new Package(0.1, 0.1, 0.1, 10, "Castelar");
        Package paquete4 = new Package(0.1, 0.1, 0.1, 10, "Merlo");
        Boolean valorEsperado = false;
        car.canSendPackageToDestiny(paquete);
        car.canSendPackageToDestiny(paquete2);
        car.canSendPackageToDestiny(paquete3);
        Boolean valorObtenido = car.canSendPackageToDestiny(paquete4);          //SON MAS DE 3 DESTINOS
        assertEquals(valorEsperado, valorObtenido);
    }
}