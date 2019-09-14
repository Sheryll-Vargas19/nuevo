package modelo;

public class Mundo {
	
	
	private int nSesiones;
	private Estudiante[] est;
	private Archivos arch;
	private String[] roles = {"Relator", "Contradictor", "Protocolante" };
	
	public Mundo () 
	{
		est = null;
		arch = new Archivos();
	}
	
	public void repartirSesiones() {
		
		for (int i= 0; i< est.length; i++) 
		{
		est[i].iniciarRolSesiones(nSesiones);	
		}
		for (int i = 0; i < nSesiones; i++) 
		{
			repartirRoles(i);
		}
	}
	public void repartirRoles(int sesion)
	{		
		int dividido = (int)(est.length/3);
		int totalesGuardados = 0;
		
		
		for(int i = 0; i < 2; i++)
		{
			int guardados = 0;
			
			while( guardados < dividido )
			{
				int numAleat = (int)(Math.random() * est.length);
				
				if( est[numAleat].getRolSesiones()[sesion] == null )
				{
					est[numAleat].agregarRol(sesion, roles[i] );
					guardados++;
					totalesGuardados++;
				}
			}
		}
		
		while( totalesGuardados < est.length )
		{
			int numAleat = (int)(Math.random() * est.length);
			
			if( est[numAleat].getRolSesiones()[sesion] == null )
			{
				est[numAleat].agregarRol(sesion, roles[ roles.length-1 ] );
				totalesGuardados++;
			}
		}
		
	}

	public Archivos getArch() {
		return arch;
	}

	public void setArch(Archivos arch) {
		this.arch = arch;
	}


	public int getnSesiones() {
		return nSesiones;
	}


	public void setnSesiones(int nSesiones) {
		this.nSesiones = nSesiones;
	}


	public Estudiante[] getEst() {
		return est;
	}


	public void setEst(Estudiante[] est) {
		this.est = est;
	}
	
	
	
	
}
