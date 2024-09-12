package employees;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermanentTest {
    @Test
    public void verificarSiElEmpleadoPermanenteCobraBienElSalario() {
        Employee perm = new Permanent(80, true, 2, 6);
        double valorEsperado = 251000.0;
        double valorObtenido = perm.getSalary();
        assertEquals(valorEsperado, valorObtenido, 0);
    }

    @Test
    public void verificarSiElEmpleadoPermanente2CobraBienElSalario() {
        Employee perm2 = new Permanent(160, false, 0, 4);
        double valorEsperado = 484000.0;
        double valorObtenido = perm2.getSalary();
        assertEquals(valorEsperado, valorObtenido, 0);
    }
}
