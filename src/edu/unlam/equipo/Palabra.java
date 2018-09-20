package edu.unlam.equipo;

public class Palabra {
	private String valor;

	public Palabra(String valor) {
		this.valor = valor;
	}
	
	public int coincidencias(String otra) {
		int contLetrasCoincidentes = 0;
		int i=1;
		
		
		while(i <= this.valor.length() && this.valor.substring(0,i).equals(otra.substring(0,i))) {
			contLetrasCoincidentes++;
			i++;
		}
			
		if(contLetrasCoincidentes == 0)
			return -1;
		
		return contLetrasCoincidentes;	
	}

	public String getValor() {
		return valor;
	}

	
	

}
