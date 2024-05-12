package uniandes.dpoo.galeria.modelo.pieza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pieza {

	protected String titulo;
	protected Date fechaCreacion;
	protected String lugarCreacion;
	protected List<String> autores;
	protected String modalidadVenta;
	protected Date fechaEntrega;
	protected int identificadorUnico;
	protected List<String> detallesAdicionales;
	protected int precio;
	public static List<Integer> listaID = new ArrayList<Integer>();
	
	public Pieza(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, 
			Date fechaEntrega, List<String> detallesAdicionales, int precio) 
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
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.lugarCreacion = lugarCreacion;
		this.autores = autores;
		this.modalidadVenta = modalidadVenta;
		this.fechaEntrega = fechaEntrega;
		this.identificadorUnico = numero;
		this.detallesAdicionales = detallesAdicionales;
		this.precio = precio;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @return the lugarCreacion
	 */
	public String getLugarCreacion() {
		return lugarCreacion;
	}

	/**
	 * @return the autores
	 */
	public List<String> getAutores() {
		return autores;
	}
	
	public void addAutores(String autor) {
		autores.add(autor);
	}

	/**
	 * @return the modalidadVenta
	 */
	public String getModalidadVenta() {
		return modalidadVenta;
	}

	/**
	 * @param modalidadVenta the modalidadVenta to set
	 */
	public void setModalidadVenta(String modalidadVenta) {
		this.modalidadVenta = modalidadVenta;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return identificadorUnico;
	}

	/**
	 * @return the detallesAdicionales
	 */
	public List<String> getDetallesAdicionales() 
	{
		return detallesAdicionales;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() 
	{
		return precio;
	}
	
	/*
	 * Métodos de Pieza (si los tiene).
	 */
}
