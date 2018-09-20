package test;

import java.awt.PageAttributes;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import edu.unlam.equipo.ArchivoEquipo;
import edu.unlam.equipo.Formulario;
import edu.unlam.equipo.Palabra;



public class PruebaEquipo {
	
	/*@Test
	public void testCargaArchivo() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoEnunciado.in");
		List <String> prueba = form.getPreguntas();
		
		Collections.sort(prueba);
		for(int i =0; i<prueba.size();i++)
			System.out.println(prueba.get(i));
	
	}*/
	
	
	/*@Test
	public void testCargaArchivo2() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoPruebaOrden.in");
		List <String> prueba = form.getPreguntas();
		
		Collections.sort(prueba);
		for(int i =0; i<prueba.size();i++)
			System.out.println(prueba.get(i));
		
	
	}*/
	
	/*@Test
	public void testMayorAfinidad() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoPruebaOrden.in");
		
		System.out.println(form.calcularAfinidad());
	
	}*/
	
	@Test
	public void testCasoEnunciado() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoEnunciado.in");
		System.out.println(form.calcularAfinidad());
	}
	
	/*@Test
	public void testMasDeUnGanador() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoMasDeUnGanador.in");
		System.out.println(form.calcularAfinidad());
	}*/
	
	/*@Test
	public void testSinGanadores() throws FileNotFoundException{
		Formulario form = ArchivoEquipo.leer("test/lotes/in/CasoSinGanadores.in");
		System.out.println(form.calcularAfinidad());
	}*/
	
	/*@Test
	public void testCoincidenciaPalabras() throws FileNotFoundException{
		Palabra pal = new Palabra("accaa");
		int conincidencias = pal.coincidencias("acaaa");
		System.out.println(conincidencias);
		
		System.out.println(pal.getValor().substring(0, conincidencias));
	}*/
	
}
