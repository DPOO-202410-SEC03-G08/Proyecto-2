package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.galeria.modelo.pieza.Pieza;

public class Cliente extends Usuario
{
	private double monto;
	private double dineroTotal;
	private List<Pieza> piezasCompradas;
	private List<Pieza> piezasConsignadas;
	
	public Cliente(String nombre, String correo, int numeroCelular, int contraseña, double monto, UserManager userManager, double dineroTotal) 
	{
		super(nombre, correo, numeroCelular, contraseña, userManager);
		piezasCompradas = new ArrayList<Pieza>();
		piezasConsignadas = new ArrayList<Pieza>();
		this.monto = monto;
		this.dineroTotal = dineroTotal;
	}
	
	/**
	 * @return the dineroTotal
	 */
	public double getDineroTotal() {
		return dineroTotal;
	}



	/**
	 * @param dineroTotal the dineroTotal to set
	 */
	public void setDineroTotal(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}



	/**
	 * @return the monto
	 */
	public double getMonto() 
	{
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) 
	{
		this.monto = monto;
	}

	/**
	 * @return the piezasCompradas
	 */
	public List<Pieza> getPiezasCompradas() 
	{
		return piezasCompradas;
	}

	/**
	 * @return the piezasConsignadas
	 */
	public List<Pieza> getPiezasConsignadas() 
	{
		return piezasConsignadas;
	}
	
	public ArrayList<Pieza> piezasEnPosesion()
	{
		ArrayList<Pieza> piezasEnPosesion = new ArrayList<Pieza>();
		for(Pieza pieza: piezasConsignadas)
		{
			piezasEnPosesion.add(pieza);
		}
		for(Pieza pieza: piezasCompradas)
		{
			if (piezasEnPosesion.contains(pieza) == false)
			{
				piezasEnPosesion.add(pieza);
			}
		}
		return piezasEnPosesion;
	}

	@Override
	public String getTipoUsuario() 
	{
		return "CLIENTE";
	}

	
	public void consignarPieza(Pieza pieza, String modalidad)
	{
		ArrayList<Pieza> piezas = (ArrayList<Pieza>) userManager.getGaleria().getInventario().getPiezas();
		if (Administrador.confirmarConsignacion(pieza, piezas))
		{
			userManager.getGaleria().getInventario().addPiezaBodega(pieza);
			piezasConsignadas.add(pieza);
			if(modalidad == "Venta Fija")
			{
				userManager.getGaleria().getInventario().addPiezasVentaFija(pieza);
			}
			else if (modalidad == "Subasta")
			{
				userManager.getGaleria().getInventario().addPiezasSubasta(pieza);
			}
		}
	}
	
	public void comprarPieza(int identificadorUnico, String modalidad)
	{
		String modalidad2 = userManager.getGaleria().getVentasManager().getVentas().get(identificadorUnico).getTipoVenta();
		if (modalidad == modalidad2)
		{
			userManager.getGaleria().getVentasManager().getVentas().get(identificadorUnico).venderPieza();
		}
	}
}
