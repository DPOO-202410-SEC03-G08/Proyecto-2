package uniandes.dpoo.galeria.persistencia;

import java.io.IOException;

import uniandes.dpoo.galeria.exeptions.InformacionInconsistenteException;
import uniandes.dpoo.galeria.modelo.Galeria;


public interface IPersistenciaGaleria
{
	public void cargarGaleria(String archivo, Galeria galeria) throws IOException, InformacionInconsistenteException;
	
	public void salvarAerolinea(String archivo, Galeria galeria) throws IOException;
}