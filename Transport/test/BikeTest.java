import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {
    Vehicle bike= new Bike();

    @Test
    public void queNoPuedaLlevarUnPaquete(){
        Package paquete = new Package(1.0,1.0,1.0,10,"Hurlingham");
        Boolean valorEsperado= false;
        Boolean valorObtenido= bike.canCarryPackage(paquete);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void quePuedaEnviarPaqueteADestino(){
        Package paquete = new Package(0.1,0.1,0.1,10,"Hurlingham");
        Boolean valorEsperado= true;
        Boolean valorObtenido= bike.canSendPackageToDestiny(paquete);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queNoPuedaEnviarPaqueteADestinoPorDestino(){
        Package paquete = new Package(0.1,0.1,0.1,10,"Hurlingham");
        Package paquete2 = new Package(0.1,0.1,0.1,10,"Moron");
        bike.canSendPackageToDestiny(paquete);
        Boolean valorEsperado= false;
        Boolean valorObtenido= bike.canSendPackageToDestiny(paquete2);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queNoPuedaEnviarPaqueteADestinoPorExcesoDePaquete(){
        Package paquete = new Package(0.1,0.1,0.1,10,"Hurlingham");
        Package paquete2 = new Package(0.1,0.1,0.1,10,"Hurlingham");
        Package paquete3 = new Package(0.1,0.1,0.1,10,"Hurlingham");
        Boolean valorEsperado= false;
        bike.canSendPackageToDestiny(paquete);
        bike.canSendPackageToDestiny(paquete2);
        Boolean valorObtenido= bike.canSendPackageToDestiny(paquete3);          //SON MAS DE 2 PAQUETES
        assertEquals(valorEsperado,valorObtenido);
    }


}