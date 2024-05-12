package uniandes.dpoo.galeria.modelo.usuario;

import java.util.Date;

public class Operario extends Usuario
{
	public Operario(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) {
		super(nombre, correo, numeroCelular, contraseña, userManager);
	}

	@Override
	public String getTipoUsuario() 
	{
		return "OPERARIO";
	}
	
	public void modificaFechaRetorno(int idPieza, Date fecha) 
	{
		userManager.getGaleria().getInventario().getPieza(idPieza).setFechaEntrega(fecha);
	}
	
}
