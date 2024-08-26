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

}
