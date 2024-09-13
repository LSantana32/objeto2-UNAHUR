package employees;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermanentTest {
    @Test
    public void verificarSiElEmpleadoPermanenteCobraBienElSalario() {
        Permanent perm = new Permanent(80,true,2,6);
        Double valorEsperado = 251000.0;
        Double valorObtenido = perm.getSalary();
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void verificarSiElEmpleadoPermanente2CobraBienElSalario() {
        Permanent perm2 = new Permanent(160,false,0,4);
        Double valorEsperado = 484000.0;
        Double valorObtenido = perm2.getSalary();
        assertEquals(valorEsperado, valorObtenido);
    }
}
