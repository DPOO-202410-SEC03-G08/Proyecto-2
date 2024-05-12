package uniandes.dpoo.galeria.modelo.usuario;

import uniandes.dpoo.galeria.modelo.ventas.Venta;

public class Cajero extends Usuario
{

	public Cajero(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) {
		super(nombre, correo, numeroCelular, contraseña, userManager);
	}

	@Override
	public String getTipoUsuario() 
	{
		return "CAJERO";
	}
	
	public static void registrarVenta(Venta venta, UserManager userManager)
	{
		userManager.addVenta(venta);
		double cobro = venta.getGanador().getDineroTotal() - venta.getPrecioFinal();
		venta.getGanador().setDineroTotal(cobro);
		userManager.getGaleria().getInventario().addPiezaPasada(venta.getPieza());
	}
}
