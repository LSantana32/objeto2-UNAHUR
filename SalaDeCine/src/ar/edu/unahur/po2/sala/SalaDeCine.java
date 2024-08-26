package ar.edu.unahur.po2.sala;

public class SalaDeCine {

	private Integer butacasTotales;
	private Integer cantidadDeFilas;
	private int butacasPorFilas; 
	private Boolean[][] butacas;
	

	public SalaDeCine(Integer butacasTotales, Integer cantidadDeFilas) {
		this.butacasTotales=butacasTotales;
		this.cantidadDeFilas=cantidadDeFilas;
		this.butacasPorFilas = butacasTotales/cantidadDeFilas;
		this.butacas = new Boolean[cantidadDeFilas][butacasPorFilas];
		for (int fila=0;fila<cantidadDeFilas;fila++) {
			for (int columna=0;columna<butacasPorFilas;columna++) {
				butacas[fila][columna] = false;
			}
		}
	}

	public Boolean estaVacia() {		
		for (int fila=0;fila<cantidadDeFilas;fila++) {
			for (int columna=0;columna<butacasPorFilas;columna++) {
				if (butacas[fila][columna] == true) {
					return false;
				}
			}
		}
		return true;
	}

}
