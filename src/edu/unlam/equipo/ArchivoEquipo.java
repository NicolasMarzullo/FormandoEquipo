package edu.unlam.equipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoEquipo {

	public static Formulario leer(String path) throws FileNotFoundException {
		Scanner lector = new Scanner(new File(path));
		List<String> preguntas = new ArrayList<>();
		
		int cantPreguntas = lector.nextInt();
		int cantColaboradores = lector.nextInt();
		
		for(int i =0 ; i < cantColaboradores;i++) 
			preguntas.add(lector.next());
			
		lector.close();
		return new Formulario(preguntas, cantPreguntas); 
	}
	
	
}
