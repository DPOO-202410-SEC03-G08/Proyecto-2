package uniandes.dpoo.galeria.modelo.ventas;


import java.util.Date;
import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.usuario.Administrador;
import uniandes.dpoo.galeria.modelo.usuario.Cajero;
import uniandes.dpoo.galeria.modelo.usuario.Cliente;

public class VentaFija extends Venta
{

	public VentaFija(Pieza pieza, Date fecha, double precioFinal, Cliente ganador, VentasManager userManager) {
		super(pieza, fecha, precioFinal, ganador, userManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoVenta() 
	{
		return "VENTA-FIJA";
	}

	@Override
	public void venderPieza() 
	{
		if(Administrador.confirmarCompra(ganador))
		{
			Venta ventaFija = new VentaFija(this.pieza, this.fecha, this.precioFinal, this.ganador, this.ventasManager);
			Cajero.registrarVenta(ventaFija, ventasManager.getGaleria().getUserManager());
			ventasManager.addVenta(ventaFija);

		}
	}
	
}
