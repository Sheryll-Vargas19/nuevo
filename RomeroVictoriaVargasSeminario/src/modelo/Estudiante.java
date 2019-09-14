package modelo;



public class Estudiante {

	private String nombre;
	private String[] rolSesiones;



	public Estudiante( ) 
	{
		nombre = null;

		rolSesiones = null;
	}
	
	public void iniciarRolSesiones(int nSesiones)
	{
		rolSesiones = new String[nSesiones];
	}
	
	public void agregarRol(int nSesion, String rol) {
		
		rolSesiones[nSesion] = rol;
	}
	

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String[] getRolSesiones() 
	{
		return rolSesiones;
	}
	
	
	
	

	
	
}
