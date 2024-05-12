package uniandes.dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Escultura extends Pieza
{

	private double alto;
	private double ancho;
	private double profundidad;
	private List<String> materialConstruccion;
	private double peso;
	private boolean necesitaElectricidad;
	
	

	public Escultura(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, Date fechaEntrega, 
			List<String> detallesAdicionales, int precio, double alto, double ancho, double profundidad, List<String> materialConstruccion, 
			double peso, boolean necesitaElectricidad) 
	{
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, detallesAdicionales, precio);
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.materialConstruccion = materialConstruccion;
		this.peso = peso;
		this.necesitaElectricidad = necesitaElectricidad;
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

	/**
	 * @return the profundidad
	 */
	public double getProfundidad() 
	{
		return profundidad;
	}

	/**
	 * @return the materialConstruccion
	 */
	public List<String> getMaterialConstruccion() 
	{
		return materialConstruccion;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() 
	{
		return peso;
	}

	/**
	 * @return the necesitaElectricidad
	 */
	public boolean isNecesitaElectricidad() 
	{
		return necesitaElectricidad;
	}

	/**
	 * @param necesitaElectricidad the necesitaElectricidad to set
	 */
	public void setNecesitaElectricidad(boolean necesitaElectricidad) 
	{
		this.necesitaElectricidad = necesitaElectricidad;
	}
	
	
	/*
	 * Métodos de Escultura (Si los tiene).
	 */
}
