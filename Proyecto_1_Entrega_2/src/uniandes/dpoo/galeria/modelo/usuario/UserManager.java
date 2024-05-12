package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.galeria.modelo.Galeria;
import uniandes.dpoo.galeria.modelo.ventas.Venta;

public class UserManager 
{
	private List<Usuario> usuarios;
	private List<Venta> ventas;
	private Galeria galeria;
	
	public UserManager(Galeria galeria) 
	{
		super();
		usuarios = new ArrayList<Usuario>();
		ventas = new ArrayList<Venta>();
		this.galeria = galeria;
	}
	
	public void addUsuario(Usuario usuario)
	{
		usuarios.add(usuario);
	}
	
	public void removeUsuario(Usuario usuario)
	{
		usuarios.remove(usuario);
	}
	
	public Usuario getUsuario(int identificadorUnico)
	{
		for(Usuario i :usuarios)
		{
			if (i.getIdentificadorUnico() == identificadorUnico)
			{
				return i;
			}
		}
		return null;
	}

	/**
	 * @return the ventas
	 */
	public List<Venta> getVentas() {
		return ventas;
	}
	
	public void addVenta(Venta venta)
	{
		ventas.add(venta);
	}

	/**
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() 
	{
		return usuarios;
	}

	/**
	 * @return the galeria
	 */
	public Galeria getGaleria() 
	{
		return galeria;
	}
	
}
