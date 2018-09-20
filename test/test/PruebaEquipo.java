package test;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import edu.unlam.equipo.ArchivoEquipo;
import edu.unlam.equipo.Formulario;



public class PruebaEquipo {
	
	@Test
	public void testCargaArchivo() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoEnunciado.in");
		List <String> prueba = form.getPreguntas();
		
		Collections.sort(prueba);
		for(int i =0; i<prueba.size();i++)
			System.out.println(prueba.get(i));
	
	}
	
	@Test
	public void testEnunciado(){
		
	}

}
