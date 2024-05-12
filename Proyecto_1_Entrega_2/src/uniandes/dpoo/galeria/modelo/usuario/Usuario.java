package uniandes.dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario 
{
	protected String nombre;
	protected String correo;
	protected int identificadorUnico;
	protected int numeroCelular;
	protected int contraseña;
	protected UserManager userManager;
	public static List<Integer> listaID = new ArrayList<Integer>();
	
	public Usuario(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) 
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
		this.nombre = nombre;
		this.correo = correo;
		this.identificadorUnico = numero;
		this.numeroCelular = numeroCelular;
		this.contraseña = contraseña;
		this.userManager = userManager;
	}

	/**
	 * @return the numeroCelular
	 */
	public int getNumeroCelular() 
	{
		return numeroCelular;
	}

	/**
	 * @param numeroCelular the numeroCelular to set
	 */
	public void setNumeroCelular(int numeroCelular) 
	{
		this.numeroCelular = numeroCelular;
	}

	/**
	 * @return the contraseña
	 */
	public int getContraseña() 
	{
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(int contraseña) 
	{
		this.contraseña = contraseña;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @return the identificadorUnico
	 */
	public int getIdentificadorUnico() 
	{
		return identificadorUnico;
	}
	
	public abstract String getTipoUsuario();
	
}
