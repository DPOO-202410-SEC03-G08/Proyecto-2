package uniandes.dpoo.galeria.modelo.ventas;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.galeria.modelo.Galeria;

public class VentasManager 
{
	private List<Venta> ventas;
	private Galeria galeria;
	
	public VentasManager(Galeria galeria) 
	{
		super();
		ventas = new ArrayList<Venta>();
		this.galeria = galeria;
	}

	/**
	 * @return the ventas
	 */
	public List<Venta> getVentas() {
		return ventas;
	}

	/**
	 * @return the galeria
	 */
	public Galeria getGaleria() {
		return galeria;
	}
	
	public void addVenta(Venta venta) {
		ventas.add(venta);
	}
	
}
