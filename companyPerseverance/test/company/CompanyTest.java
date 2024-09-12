package company;

import employees.Employee;
import employees.Manager;
import employees.Permanent;
import employees.Temporary;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {
    Company company = new Company("Carrefour", 123456789);

    @Test
    public void verificarQueLaSumatoriaDelSalarioDeLosEmpleadosYaCreadosSeaCorrecta() {

        // Usar la superclase como tipo para mejorar la flexibilidad, polimorfismo y desacoplamiento
        Employee temp = new Temporary(80, true, 0);
        Employee perm = new Permanent(80, true, 2, 6);
        Employee perm2 = new Permanent(160, false, 0, 4);
        Employee manag = new Manager(160, true, 1, 10);
        company.addEmployee(temp);
        company.addEmployee(perm);
        company.addEmployee(perm2);
        company.addEmployee(manag);
        double valorEsperado = 1554000.0;
        double valorObtenido = company.totalSalary();
        assertEquals(valorEsperado, valorObtenido, 0);
    }
}