package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.ventas.Venta;

public abstract class Usuario 
{
	protected String nombre;
	protected String correo;
	protected int identificadorUnico;
	protected int numeroCelular;
	protected int contraseña;
	protected UserManager userManager;
	public static List<Integer> listaID = new ArrayList<Integer>();
	
	public Usuario(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) 
	{
		super();
		boolean condition = false;
		int numero = 0;
		while (condition == false)
		{
			numero = (int) ((Math.random() * 1000000000) + 1);
			if (listaID.contains(numero) == false)
			{
				listaID.add(numero);
				condition = true;
			}
		}
		this.nombre = nombre;
		this.correo = correo;
		this.identificadorUnico = numero;
		this.numeroCelular = numeroCelular;
		this.contraseña = contraseña;
		this.userManager = userManager;
	}
	
	public Cliente getHistorialPiezaDueño(Pieza pieza) 
	{
		List<Usuario> usuarios = userManager.getUsuarios();
		Cliente dueño = null;
		for (Usuario usuario: usuarios)
		{
			if(usuario.getTipoUsuario() == "CLIENTE")
			{
				Cliente cliente = (Cliente) usuario;
				for (Pieza pieza2: cliente.getPiezasConsignadas())
				{
					if (pieza == pieza2)
					{
						dueño = cliente;
					}
				}
			}
		}
		return dueño;
	}
	
	public double getHistorialPiezaPrecioVenta(Pieza pieza) 
	{
		List<Venta> ventas = userManager.getVentas();
		double precioVenta = 0;
		for (Venta venta: ventas)
		{
			if (venta.getPieza() == pieza)
			{
				precioVenta = venta.getPrecioFinal();
			}
		}
		return precioVenta;
	}
	
	public Date getHistorialPiezaFechaVenta(Pieza pieza) 
	{
		List<Venta> ventas = userManager.getVentas();
		Date fechaVenta = null;
		for (Venta venta: ventas)
		{
			if (venta.getPieza() == pieza)
			{
				fechaVenta = venta.getFecha();
			}
		}
		return fechaVenta;
	}
	
	public List<HashMap<String,Pieza>> gethistoriaArtista(String nombre) 
	{
		HashMap<String,Pieza> piezasCreadasArtista = new HashMap<String,Pieza>();
		ArrayList<Pieza> piezas = (ArrayList<Pieza>) userManager.getGaleria().getInventario().getPiezas();
		for (int i = 0; i < piezas.size(); i++)
		{
			List<String> autores = piezas.get(i).getAutores();
			for(int j = 0; j < autores.size(); j++)
			{
				String autor = autores.get(j);
				if (autor.compareToIgnoreCase(nombre) == 0)
				{
					piezasCreadasArtista.put(piezas.get(i).getFechaCreacion().toString(), piezas.get(i));
				}
			}
		}
		
		HashMap<String,Pieza> piezasVendidasArtista = new HashMap<String,Pieza>();
		ArrayList<Venta> ventas = (ArrayList<Venta>) userManager.getVentas();
		for (int i = 0; i < ventas.size(); i++)
		{
			List<String> autores = ventas.get(i).getPieza().getAutores();
			for(int j = 0; j < autores.size(); i++)
			{
				if (autores.get(j).compareToIgnoreCase(nombre) == 0)
				{
					String fecha = ventas.get(i).getFecha().toString();
					Double precio = ventas.get(i).getPrecioFinal();
					precio.toString();
					String fecha_precio = fecha + precio;
					piezasVendidasArtista.put(fecha_precio, ventas.get(i).getPieza());
				}
			}
		}
		ArrayList<HashMap<String,Pieza>> listReturn = new ArrayList<HashMap<String,Pieza>>();
		listReturn.add(piezasCreadasArtista);
		listReturn.add(piezasVendidasArtista);
		return listReturn;
	}

	/**
	 * @return the numeroCelular
	 */
	public int getNumeroCelular() 
	{
		return numeroCelular;
	}

	/**
	 * @param numeroCelular the numeroCelular to set
	 */
	public void setNumeroCelular(int numeroCelular) 
	{
		this.numeroCelular = numeroCelular;
	}

	/**
	 * @return the contraseña
	 */
	public int getContraseña() 
	{
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(int contraseña) 
	{
		this.contraseña = contraseña;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @return the identificadorUnico
	 */
	public int getIdentificadorUnico() 
	{
		return identificadorUnico;
	}
	
	public abstract String getTipoUsuario();
	
}
