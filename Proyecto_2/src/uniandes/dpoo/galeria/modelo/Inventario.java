package uniandes.dpoo.galeria.modelo;

import java.util.ArrayList;
import java.util.List;


import uniandes.dpoo.galeria.modelo.pieza.Pieza;

public class Inventario 
{
	private List<Pieza> piezas;
	private List<Pieza> piezasPasadas;
	private List<Pieza> piezasBodega;
	private List<Pieza> piezasExhibicion;
	private List<Pieza> piezasVentaFija;
	private List<Pieza> piezasSubasta;
	
	public Inventario() 
	{
		super();
		piezas = new ArrayList<Pieza>();
		piezasPasadas = new ArrayList<Pieza>();
		piezasBodega = new ArrayList<Pieza>();
		piezasExhibicion = new ArrayList<Pieza>();
		piezasVentaFija = new ArrayList<Pieza>();
		piezasSubasta = new ArrayList<Pieza>();
	}
	
	public void addPieza (Pieza pieza)
	{
		if (piezas.contains(pieza) == false)
		{
			piezas.add(pieza);
		}
	}
	
	public void addPiezaPasada (Pieza pieza)
	{
		piezasPasadas.add(pieza);
		piezas.remove(pieza);
		piezasPasadas.remove(pieza);
		piezasBodega.remove(pieza);
		piezasExhibicion.remove(pieza);
		piezasVentaFija.remove(pieza);
		piezasSubasta.remove(pieza);
	}
	
	public void addPiezaBodega (Pieza pieza)
	{
		if (piezas.contains(pieza) == false)
		{
			piezasBodega.add(pieza);
			piezasExhibicion.remove(pieza);
		}
	}
	
	public void addPiezaExhibicion (Pieza pieza)
	{
		if (piezas.contains(pieza) == false)
		{
			piezasExhibicion.add(pieza);
			piezasBodega.remove(pieza);
		}
	}
	
	public void addPiezasVentaFija (Pieza pieza)
	{
		if (piezas.contains(pieza) == false)
		{
			piezasVentaFija.add(pieza);
			piezas.add(pieza);
			piezasSubasta.remove(pieza);
		}
	}
	
	public void addPiezasSubasta (Pieza pieza)
	{
		if (piezas.contains(pieza) == false)
		{
			piezasSubasta.add(pieza);
			piezas.add(pieza);
			piezasVentaFija.remove(pieza);
		}
	}
	
	public Pieza getPieza (int identificadorUnico)
	{
		Pieza pieza = null;
		for(Pieza i :piezas)
		{
			if (i.getID() == identificadorUnico)
			{
				pieza = i;
			}
		}
		return pieza;
	}

	/**
	 * @return the piezas
	 */
	public List<Pieza> getPiezas() 
	{
		return piezas;
	}

	/**
	 * @return the piezasPasadas
	 */
	public List<Pieza> getPiezasPasadas() 
	{
		return piezasPasadas;
	}

	/**
	 * @return the piezasBodega
	 */
	public List<Pieza> getPiezasBodega() 
	{
		return piezasBodega;
	}

	/**
	 * @return the piezasExhibicion
	 */
	public List<Pieza> getPiezasExhibicion() 
	{
		return piezasExhibicion;
	}

	/**
	 * @return the piezasVentaFija
	 */
	public List<Pieza> getPiezasVentaFija() 
	{
		return piezasVentaFija;
	}

	/**
	 * @return the piezasSubasta
	 */
	public List<Pieza> getPiezasSubasta() 
	{
		return piezasSubasta;
	}
	
	
}