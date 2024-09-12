package employees;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemporaryTest {
    @Test
    public void verificarSiElEmpleadoTemporarioCobraBienElSalario() {
        Employee temp = new Temporary(80, true, 0);
        double valorEsperado = 161000.0;
        double valorObtenido = temp.getSalary();
        assertEquals(valorEsperado, valorObtenido);
    }
}