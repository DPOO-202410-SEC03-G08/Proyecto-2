package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;

import uniandes.dpoo.galeria.modelo.pieza.Pieza;

public class Administrador extends Usuario
{
	

	public Administrador(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) 
	{
		super(nombre, correo, numeroCelular, contraseña, userManager);
	}

	@Override
	public String getTipoUsuario() 
	{
		return "ADMINISTRADOR";
	}
	
	public static boolean confirmarConsignacion(Pieza pieza, ArrayList<Pieza> piezas) 
	{
		boolean respuesta = true;
		if(piezas.contains(pieza))
		{
			respuesta = false;
		}
		return respuesta;
	}
	
	public static boolean confirmarCompra(Cliente comprador) 
	{
		boolean respuesta = true;
		if(comprador.getDineroTotal()*0.5 < comprador.getMonto())
		{
			respuesta = false;
		}
		return respuesta;
	}
	
}
