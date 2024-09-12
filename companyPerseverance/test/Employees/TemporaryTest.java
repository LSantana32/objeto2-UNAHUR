package Employees;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemporaryTest {
    @Test
    public void verificarSiElEmpleadoTemporarioCobraBienElSalario() {
        Temporary temp = new Temporary(80, true, 0);
        Double valorEsperado = 161000.0;
        Double valorObtenido = temp.salary();
        assertEquals(valorEsperado, valorObtenido);
    }
}