package Employees;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    @Test
    public void verificarSiElGerenteCobraBienElSalario() {
        Manager manag = new Manager(160,true,1,10);
        Double valorEsperado = 658000.0;
        Double valorObtenido = manag.salary();
        assertEquals(valorEsperado, valorObtenido);
    }
}