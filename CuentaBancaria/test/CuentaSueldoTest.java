import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaSueldoTest {
    CuentaSueldo cuenta = new CuentaSueldo();

    @Test
    public void queAlCrearLaCuentaSuSaldoSeaCero() {
        Double valorEsperado= 0.0;
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queAlDepositarSeSumeALaCuentaSueldo(){
        Double valorEsperado= 100.0;
        cuenta.depositar(100.0);
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queAlRetirarSeResteDeLaCuentaSueldo(){
        Double valorEsperado= 25.0;
        cuenta.depositar(100.0);
        cuenta.extraer(75.0);
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queNoSePuedaDepositarUnValorNegativo(){
        Double valorEsperado= 0.0;
        cuenta.depositar(-100.0);
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queNoSePuedaExtraerMasDeLoQueTenga(){
        Double valorEsperado= 0.0;
        cuenta.extraer(100.0);
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void queNoSePuedaExtraerValoresNegativos(){
        Double valorEsperado= 50.0;
        cuenta.depositar(50.0);
        cuenta.extraer(-50.0);
        Double valorObtenido= cuenta.getSaldo();
        assertEquals(valorEsperado,valorObtenido);
    }
}