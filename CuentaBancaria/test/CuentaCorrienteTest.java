import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    CuentaCorriente cuenta = new CuentaCorriente();

    @Test
    public void poderGirarEnDescubiertoConNuestraCuentaCorriente() {
        Double valorEsperado = -105.0;
        cuenta.depositar(100.0);
        cuenta.setDescubierto(150.0);
        cuenta.extraer(200.0);
        Double valorObtenido = cuenta.getSaldo();
        assertEquals(valorEsperado, valorObtenido);
    }
}