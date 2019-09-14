/* Sheryll Vargas
Daniela Victoria
Felipe Romero*/

package controlador;

import modelo.*;
import vista.Interfaz;

public class Controlador {

	private Mundo m;
	private Interfaz gui;

	public Controlador () 
	{
		gui = new Interfaz();
		m = new Mundo();
		
		
		int nSesiones = gui.pedirSesion();
		m.setnSesiones( nSesiones );

		Estudiante[] estudiantes = m.getArch().leerArchivo();
		m.setEst(estudiantes);
		
		m.repartirSesiones();
		
		gui.mostrarEstudiantes(m.getEst(), m.getnSesiones());	
		m.getArch().Escribir(m.getEst(), m.getnSesiones());


	}



}


