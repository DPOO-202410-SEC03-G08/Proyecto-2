package uniandes.dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Pintura extends Pieza {

	private List<String> colores;
	private String tecnica;
	private String estilo;
	private String superficie;
	
	
	
	public Pintura(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, Date fechaEntrega, 
			List<String> detallesAdicionales, int precio, List<String> colores, String tecnica, String estilo, String superficie) 
	{
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, detallesAdicionales, precio);
		this.colores = colores;
		this.tecnica = tecnica;
		this.estilo = estilo;
		this.superficie = superficie;
	}


	/**
	 * @return the colores
	 */
	public List<String> getColores() 
	{
		return colores;
	}


	/**
	 * @return the tecnica
	 */
	public String getTecnica() 
	{
		return tecnica;
	}


	/**
	 * @return the estilo
	 */
	public String getEstilo() 
	{
		return estilo;
	}


	/**
	 * @return the superficie
	 */
	public String getSuperficie() 
	{
		return superficie;
	}
	
	/*
	 * Metodos de Pintura (Si los tiene)
	 */
}
