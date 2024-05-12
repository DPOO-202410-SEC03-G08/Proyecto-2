package uniandes.dpoo.galeria.modelo.ventas;

import java.sql.Date;

import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Cliente;

public abstract class Venta 
{
	protected Pieza pieza;
	protected Date fecha;
	protected double precioFinal;	
	protected Cliente ganador;
	protected VentasManager ventasManager;

	public Venta(Pieza pieza, Date fecha, double precioFinal, Cliente ganador, VentasManager userManager) 
	{
		super();
		this.pieza = pieza;
		this.fecha = fecha;
		this.precioFinal = precioFinal;
		this.ganador = ganador;
		this.ventasManager = userManager;
	}

	/**
	 * @return the ganador
	 */
	public Cliente getGanador() {
		return ganador;
	}

	/**
	 * @param ganador the ganador to set
	 */
	public void setGanador(Cliente ganador) {
		this.ganador = ganador;
	}

	/**
	 * @return the precioFinal
	 */
	public double getPrecioFinal() {
		return precioFinal;
	}

	/**
	 * @param precioFinal the precioFinal to set
	 */
	public void setPrecioFinal(double precioFinal) 
	{
		this.precioFinal = precioFinal;
	}

	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	public abstract String getTipoVenta();
	
	public abstract void venderPieza();


	
}
