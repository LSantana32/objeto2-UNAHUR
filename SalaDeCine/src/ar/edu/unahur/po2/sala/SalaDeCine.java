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
		Boolean output=true;
		for (int fila=0;fila<cantidadDeFilas;fila++) {
			for (int columna=0;columna<butacasPorFilas;columna++) {
				if (butacas[fila][columna]==true){
					output=false;
					break;
				}
			}				
		}
		return output;
		
	}
	
	public Boolean estaOcupadaLaButaca(Integer fila,Integer columna) {
		return butacas[fila][columna];
	}
	
	public void ocuparButaca(Integer fila, Integer columna) {
		if (butacas[fila][columna]==false) {
			this.butacas[fila][columna]= true;
		}
	 }
	
	public Integer cantidadDeButacasOcupadas() {
		Integer contador=0;
		for (int fila=0;fila<cantidadDeFilas;fila++){
			for (int asiento=0;asiento<butacasPorFilas;asiento++){
				if (butacas[fila][asiento]==true) {
					contador++;
				}
			}
		}
		return contador;
				
	}
	
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		Boolean output=false;
		if (cantidadDePersonas<=butacasPorFilas) {
			for (int fila=0;fila<cantidadDeFilas;fila++) {
				Integer contador=0;
				for (int asiento=0;asiento<butacasPorFilas;asiento++) {
					if (butacas[fila][asiento]==false){
					contador++;
					}
				}
				if (contador>=cantidadDePersonas) {
					output=true;
					break;
				}
			}
		}
		return output;
	}
	

}
