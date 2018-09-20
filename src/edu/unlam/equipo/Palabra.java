package edu.unlam.equipo;

public class Palabra {
	private String valor;

	public Palabra(String valor) {
		this.valor = valor;
	}
	
	public int coincidencias(String otra) {
		int contLetrasCoincidentes = -1;	//Este -1 sirve por si no hay ninguna coincidencia de letras, necesito que devuelva 0.
		int i=1;
		
		
		while(i <= this.valor.length() && this.valor.substring(0,i).equals(otra.substring(0,i))) {
			contLetrasCoincidentes++;
			i++;
		}
			
		return contLetrasCoincidentes++;	//Como arranca de -1 lo devuelvo incrementado.
	}

	public String getValor() {
		return valor;
	}

	
	

}
