package uniandes.dpoo.galeria.persistencia;

import java.io.IOException;

import uniandes.dpoo.galeria.exeptions.InformacionInconsistenteException;
import uniandes.dpoo.galeria.modelo.Galeria;

public class PersistenciaGaleriaJson implements IPersistenciaGaleria
{
	/**
	 * 
	 * @param String con el nombre del archivo a cargar
	 * @param Aerolina que va a ser cargada
	 */
	public void cargarGaleria(String archivo, Galeria galeria) throws IOException, InformacionInconsistenteException 
	{
		
		
	}
	
	/**
	 * 
	 * @param String con el nombre del archivo a salvar
	 * @param Aerolina que va a ser guardada
	 */
	public void salvarAerolinea(String archivo, Galeria galeria)
	{
		
	}

}
