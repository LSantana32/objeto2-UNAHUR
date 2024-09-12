package Company;

import Employees.Manager;
import Employees.Permanent;
import Employees.Temporary;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {
    Company company= new Company("Carrefour",123456789);

    @Test
    public void verificarQueLaSumatoriaDelSalarioDeLosEmpleadosYaCreadosSeaCorrecta() {
        Temporary temp = new Temporary(80, true, 0);
        Permanent perm = new Permanent(80,true,2,6);
        Permanent perm2 = new Permanent(160,false,0,4);
        Manager manag = new Manager(160,true,1,10);
        company.addEmployee(temp);
        company.addEmployee(perm);
        company.addEmployee(perm2);
        company.addEmployee(manag);
        Double valorEsperado=1554000.0;
        Double valorObtenido= company.totalSalary();
        assertEquals(valorEsperado,valorObtenido);

    }
}