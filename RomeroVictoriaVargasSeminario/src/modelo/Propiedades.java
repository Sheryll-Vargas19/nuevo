package modelo;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivoprop = "numeros.properties";
	public void setPropiedades() {
		try {
			prop.setProperty("numeros", "numeros.txt");
			prop.setProperty(archivoprop, "numeros.properties");
			prop.setProperty("nombreCodigo", "Propiedades.Java");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getPropiedades() {
		try {

			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			System.out.println(prop.getProperty("numeros.txt"));
			System.out.println(prop.getProperty("archivoProp"));
			System.out.println(prop.getProperty("nombreCodigo"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}

