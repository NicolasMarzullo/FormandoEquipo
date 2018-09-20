package edu.unlam.equipo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Formulario {
	private List<String> preguntas = new ArrayList<>();
	private int cantPreg;
	private static int afinidadMax = 0;
	private static String letrasComunes = "No hubo ninguna coincidencia";

	public Formulario(List<String> preguntas, int cantPreg) {
		this.preguntas = preguntas;
		this.cantPreg = cantPreg;
	}

	public List<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<String> preguntas) {
		this.preguntas = preguntas;
	}

	public String calcularAfinidad() {
		Palabra palabra;	
		int afinidadActual=0;
		int cantParticipantesCoincidentes = 0;
		int j, indexUltimaRespuesta =0;
		
		Collections.sort(this.preguntas);	//Primero ordeno las preguntas
		
		for (int i = 0; i < this.preguntas.size(); i++) {	//For que itera todo el listado
			palabra = new Palabra(this.preguntas.get(i));	//Obtengo el primer string y creo una Palabra.
															//Palabra tiene el método que determina la cantidad de coincidencias
			
			j=i+1;	//J siempre arranca con uno mas que i para no comparar las palabras con si mismas.
	
			//En este while primero pregunto que no se haya ido del rango
			//Posteriormente, primero asigno a afinidadActual las coincidencias que haya entre una respuesta y la siguiente->
			//del listado. Luego pregunta si es >= a la afinidadMax;
			while (j < this.preguntas.size() && (afinidadActual = palabra.coincidencias(this.preguntas.get(j))) >= afinidadMax) {
					
					//Si es mayor cambio mis "letrasCoumunes" -> Aquellas letras en las que coincidieron
					if (afinidadActual > afinidadMax) {
						letrasComunes = palabra.getValor().substring(0, afinidadActual);
						afinidadMax = afinidadActual;	//actualizo la afinidad maxima
						cantParticipantesCoincidentes = 2;	//actualizo la cantidad de coincidentes
						
					//si son iguales solamente tengo que incrementar la cantidad de participantes,
					//pero tiene un detalle: no debo volver a contar una respuesta que ya fue contabilizada
					//Ver CasoPruebaOrden.in
					} else if (afinidadActual == afinidadMax && j>indexUltimaRespuesta) {	
						cantParticipantesCoincidentes++;

				}
				j++;
			}
			indexUltimaRespuesta=j-1;	//Guardo el index de la ultima respuestas analizada

		}

		
		/*La afinidad de dicho
		equipo se define como la cantidad de
		colaboradores en el equipo, multiplicado
		por el cuadrado de N (siendo N la cantidad
		de preguntas contestadas de la misma
		manera)*/
		double afinidad = 0;
			if(letrasComunes != null)
				afinidad = cantParticipantesCoincidentes*Math.pow(letrasComunes.length(), 2);
			
		return letrasComunes + " " + afinidad;
	}

}
