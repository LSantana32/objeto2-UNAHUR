import org.junit.Test;

import static org.junit.Assert.*;

public class CajaDeAhorroTest {
    CajaDeAhorro caja = new CajaDeAhorro();

    @Test
    public void queDespuesDeLaQuintaExtraccionCobreCostoAdicional() {
        Double valorEsperado=288.0;
        caja.depositar(1000.0);
        for (int i=0;i!=7;i++){
            caja.extraer(100.0);
        }
        Double valorObtenido=caja.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }
}