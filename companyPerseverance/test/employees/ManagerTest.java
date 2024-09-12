package employees;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    @Test
    public void verificarSiElGerenteCobraBienElSalario() {
        Employee manag = new Manager(160, true, 1, 10);
        double valorEsperado = 658000.0;
        double valorObtenido = manag.getSalary();
        assertEquals(valorEsperado, valorObtenido, 0);
    }
}