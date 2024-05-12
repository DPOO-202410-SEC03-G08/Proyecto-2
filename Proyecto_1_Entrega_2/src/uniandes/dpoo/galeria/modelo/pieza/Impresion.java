package uniandes.dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Impresion extends Pieza {

	private double alto;
	private double ancho;
	private String tipoPapel;
	private String formatoImpresion;
	
	

	public Impresion(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, Date fechaEntrega, 
			List<String> detallesAdicionales, int precio, double alto, double ancho, String tipoPapel, String formatoImpresion) 
	{
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, detallesAdicionales, precio);
		this.alto = alto;
		this.ancho = ancho;
		this.tipoPapel = tipoPapel;
		this.formatoImpresion = formatoImpresion;
	}

	/**
	 * @return the tipoPapel
	 */
	public String getTipoPapel() 
	{
		return tipoPapel;
	}

	/**
	 * @param tipoPapel the tipoPapel to set
	 */
	public void setTipoPapel(String tipoPapel) 
	{
		this.tipoPapel = tipoPapel;
	}

	/**
	 * @return the formatoImpresion
	 */
	public String getFormatoImpresion() 
	{
		return formatoImpresion;
	}

	/**
	 * @param formatoImpresion the formatoImpresion to set
	 */
	public void setFormatoImpresion(String formatoImpresion) 
	{
		this.formatoImpresion = formatoImpresion;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() 
	{
		return alto;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() 
	{
		return ancho;
	}
	
	/*
	 * Métodos de Impresion (Si los tiene).
	 */
}
