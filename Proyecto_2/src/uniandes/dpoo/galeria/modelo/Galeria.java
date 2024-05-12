package uniandes.dpoo.galeria.modelo;

import java.io.IOException;
import uniandes.dpoo.galeria.modelo.usuario.UserManager;
import uniandes.dpoo.galeria.modelo.ventas.VentasManager;


public class Galeria 
{
	private Inventario inventario;
	private UserManager userManager;
	private VentasManager ventasManager;
	
	public Galeria(Inventario inventario, UserManager userManager, VentasManager ventasManager) 
	{
		super();
		this.inventario = inventario;
		this.userManager = userManager;
		this.ventasManager = ventasManager;
	}

	/**
	 * @return the inventario
	 */
	public Inventario getInventario() {
		return inventario;
	}

	/**
	 * @return the userManager
	 */
	public UserManager getUserManager() {
		return userManager;
	}

	/**
	 * @return the ventasManager
	 */
	public VentasManager getVentasManager() {
		return ventasManager;
	}

	public void cargarGaleria (String archivo) throws IOException
	{
		//POR COMPLETAR
	}
	
	public void salvarGaleria (String archivo)
	{
		//POR COMPLETAR
	}
}