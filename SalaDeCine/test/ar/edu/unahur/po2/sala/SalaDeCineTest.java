package ar.edu.unahur.po2.sala;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaDeCineTest {

	@Test
	public void queAlCrearLaSalaTodasLasButacasEstanVacias() {
		//Preparaci�n
		Integer butacasTotales = 10;
		Integer cantidaDeFilas = 2;
		SalaDeCine sala = new SalaDeCine(butacasTotales,cantidaDeFilas);
		Boolean valorEsperado = true;
		//Ejecuci�n
		Boolean valorObtenido = sala.estaVacia();
		//Contrastaci�n
		assertEquals(valorEsperado,valorObtenido);
	}	
	
	@Test
	public void verificarSiUnAsientoEstaOcupado() {
		Integer butacasTotales = 10;
		Integer cantidaDeFilas = 2;
		SalaDeCine sala2 = new SalaDeCine(butacasTotales,cantidaDeFilas);
		Boolean valorEsperado = false;
		Boolean valorObtenido = sala2.estaOcupadaLaButaca(1,3);
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void verificarSiSePuedeOcuparAsiento() {
		Integer butacasTotales = 10;
		Integer cantidaDeFilas = 2;
		SalaDeCine sala2 = new SalaDeCine(butacasTotales,cantidaDeFilas);
		sala2.ocuparButaca(1,3);
		Boolean valorEsperado = true;
		Boolean valorObtenido = sala2.estaOcupadaLaButaca(1,3);
		assertEquals(valorEsperado,valorObtenido);
	}
	
	
	@Test
	public void verificarAsientosOcupados() {
		Integer butacasTotales = 10;
		Integer cantidaDeFilas = 2;
		SalaDeCine sala2 = new SalaDeCine(butacasTotales,cantidaDeFilas);
		sala2.ocuparButaca(1,3);
		Integer valorEsperado = 1;
		Integer valorObtenido = sala2.cantidadDeButacasOcupadas();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void verificarSiHayEspacioParaNPersonasDeFormaContigua() {
		Integer butacasTotales = 10;
		Integer cantidaDeFilas = 2;
		SalaDeCine sala2 = new SalaDeCine(butacasTotales,cantidaDeFilas);
		sala2.ocuparButaca(1,3);
		sala2.ocuparButaca(0, 3);
		Boolean valorEsperado = false;
		Boolean valorObtenido = sala2.hayEspacioPara(5);
		assertEquals(valorEsperado,valorObtenido);
	}
	
	
	
	
}

	

