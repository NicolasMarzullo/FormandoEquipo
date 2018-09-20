package edu.unlam.equipo;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
	private List<String> preguntas = new ArrayList<>();
	private int cantPreg;
	
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

	
	
	
}
