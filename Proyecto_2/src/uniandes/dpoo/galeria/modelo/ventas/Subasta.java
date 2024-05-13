package uniandes.dpoo.galeria.modelo.ventas;

import java.util.Date;
import java.util.List;
import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Administrador;
import uniandes.dpoo.galeria.modelo.usuario.Cajero;
import uniandes.dpoo.galeria.modelo.usuario.Cliente;

public class Subasta extends Venta
{
	private boolean finalizada;
	private List<Cliente> compradores;
	
	public Subasta(Pieza pieza, Date fecha, double precioFinal, Cliente ganador, VentasManager ventasManager, boolean finalizada, List<Cliente> compradores)
	{
		super(pieza, fecha, precioFinal, ganador, ventasManager);
		this.finalizada = finalizada;
		this.compradores = compradores;
	}

	@Override
	public String getTipoVenta() 
	{
		return "SUBASTA";
	}

	/**
	 * @return the finalizada
	 */
	public boolean isFinalizada() 
	{
		return finalizada;
	}

	/**
	 * @param finalizada the finalizada to set
	 */
	public void setFinalizada() 
	{
		if (compradores.isEmpty())
		{
			this.finalizada = true;
		}
		else
		{
			this.finalizada = false;
		}
	}

	/**
	 * @return the comprador
	 */
	public List<Cliente> getComprador() 
	{
		return compradores;
	}

	@Override
	public void venderPieza() 
	{
		Cliente comprador = compradores.getFirst();
		compradores.removeFirst();
		double precio = comprador.getMonto();
		if(precio > precioFinal)
		{
			setPrecioFinal(precio);
			setFinalizada();
			setGanador(comprador);
			if(!isFinalizada())
			{
				venderPieza();
			}
			else
			{
				if (!Administrador.confirmarCompra(comprador))
				{
					setGanador(null);
				}
				else 
				{
					Venta subasta = new Subasta(this.pieza, this.fecha, this.precioFinal, this.ganador, this.ventasManager, this.finalizada, this.compradores);
					Cajero.registrarVenta(subasta, ventasManager.getGaleria().getUserManager());
					ventasManager.addVenta(subasta);
				}
			}
		}
		else
		{
			venderPieza();
		}
	}	
	
	public String getResultado()
	{
		if(getGanador() == null)
		{
			return "LA SUBASTA HA SIDO COMPLETADA";
		}
		return "LA SUBASTA NO HA SIDO COMPLETADA";
	}
	
}