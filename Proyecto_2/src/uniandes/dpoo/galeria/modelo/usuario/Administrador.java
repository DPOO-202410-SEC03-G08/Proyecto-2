package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.ventas.Venta;

public class Administrador extends Usuario
{
	

	public Administrador(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) 
	{
		super(nombre, correo, numeroCelular, contraseña, userManager);
	}

	@Override
	public String getTipoUsuario() 
	{
		return "ADMINISTRADOR";
	}
	
	public List<HashMap<String,Pieza>> gethistoriaCompradorPiezas(Cliente cliente)
	{
		ArrayList<Pieza> piezasCompradas = (ArrayList<Pieza>) cliente.getPiezasCompradas();
		ArrayList<Venta> ventas = (ArrayList<Venta>) userManager.getVentas();
		
		HashMap<String,Pieza> piezasCompradas_Fecha = new HashMap<String,Pieza>();
		
		for (int i = 0; i < ventas.size(); i++)
		{
			for (int j = 0; j < piezasCompradas.size(); j++)
			{
				if(piezasCompradas.get(j) == ventas.get(i).getPieza())
				{
					String fecha = ventas.get(i).getFecha().toString();
					piezasCompradas_Fecha.put(fecha,piezasCompradas.get(j));
				}
			}
		}
		
		ArrayList<Pieza> piezasEnPosesion = cliente.piezasEnPosesion();
		HashMap<String,Pieza> piezasEnPosesion_Precio = new HashMap<String,Pieza>();
		
		for (int i = 0; i < piezasEnPosesion.size(); i++)
		{
			int precio = piezasEnPosesion.get(i).getPrecio();
			String precio2 = ""+precio;
			piezasEnPosesion_Precio.put(precio2, piezasEnPosesion.get(i));
		}
		
		ArrayList<HashMap<String,Pieza>> listReturn = new ArrayList<HashMap<String,Pieza>>();
		listReturn.add(piezasCompradas_Fecha);
		listReturn.add(piezasEnPosesion_Precio);
		return listReturn;
	}
	
	public int gethistoriaCompradorValorColeccion(Cliente cliente)
	{
		ArrayList<Pieza> piezasEnPosesion = cliente.piezasEnPosesion();
		int ValorColeccion = 0;
		for (Pieza pieza: piezasEnPosesion)
		{
			ValorColeccion += pieza.getPrecio();
		}
		return ValorColeccion;
	}
	
	public static boolean confirmarConsignacion(Pieza pieza, ArrayList<Pieza> piezas) 
	{
		boolean respuesta = true;
		if(piezas.contains(pieza))
		{
			respuesta = false;
		}
		return respuesta;
	}
	
	public static boolean confirmarCompra(Cliente comprador) 
	{
		boolean respuesta = true;
		if(comprador.getDineroTotal()*0.5 < comprador.getMonto())
		{
			respuesta = false;
		}
		return respuesta;
	}
	
}
