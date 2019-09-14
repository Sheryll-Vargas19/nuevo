package vista;

import java.util.Random;

import javax.swing.JOptionPane;

import modelo.Estudiante;

public class Interfaz { 

	public int pedirSesion() {

		int ns = Integer.parseInt(JOptionPane.showInputDialog("Numero de sesión"));
		return ns;
	}


	/*public void mostrarArchivos(String archivo)
	{
		JOptionPane.showMessageDialog(null, archivo, "Sesion", JOptionPane.INFORMATION_MESSAGE);

	}*/

	public void mostrarEstudiantes(Estudiante[] estudiantes, int nSesiones)
	{
		String m = "";
		Random rnd = new Random();

			for (int j = 0; j < estudiantes.length; j++) 
			{
				m = m + estudiantes[j].getNombre() + " , " + estudiantes[j].getRolSesiones()[rnd.nextInt(3)] + " , " + nSesiones  +"\n";
			}
			JOptionPane.showMessageDialog(null, m, "Sesion No."+nSesiones, JOptionPane.INFORMATION_MESSAGE);
	}


}
