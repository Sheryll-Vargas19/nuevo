package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Archivos {

	public Estudiante[] leerArchivo() {
		ArrayList<Estudiante> est = new ArrayList<Estudiante>();

		File f = new File("./numeros.txt");

		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea != null) {
				Estudiante n = new Estudiante();
				n.setNombre(linea);
				est.add(n);

				linea = br.readLine();
			}
			fr.close();
		}
		catch(IOException e) {

			//JOptionPane.showMessageDialog(null,e.printStackTrace();,"ALV", JOptionPane.INFORMATION_MESSAGE);
		}

		Estudiante[] estudiantes = new Estudiante[ est.size() ];
		for (int i = 0; i < estudiantes.length; i++) 
		{
			estudiantes[i] = est.get(i);
		}
		return estudiantes;
	}

	public void Escribir(Estudiante[] estudiantes, int nSesiones)
	{
		File f = new File("./salida.xls");
		try{
			String linea_arch = "";
			Random rnd = new Random();

			for (int j = 0; j < estudiantes.length; j++) 
			{
				linea_arch = linea_arch + estudiantes[j].getNombre() + " , " + estudiantes[j].getRolSesiones()[rnd.nextInt(3)] + " , " + nSesiones  +"\n";
			}
				
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader linea= new BufferedReader(isr);
			FileWriter linea_tx= new FileWriter(f,true);
			linea_tx.write("\r\n"+linea_arch);
			
			linea_tx.close();
			}catch(IOException e)
			{
				JOptionPane.showMessageDialog(null, "No se pudo escribir");
			} 
	}
	

}



