package uniandes.dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Video extends Pieza {

	private int duracion;
	private String resolucionVideo;
	private int framesPerSecond;
	private String relacionAspecto;
	private String formato;
	
	
	
	public Video(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, Date fechaEntrega, 
			List<String> detallesAdicionales, int precio, int duracion, String resolucionVideo, int framesPerSecond, String relacionAspecto, String formato) 
	{
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, detallesAdicionales, precio);
		this.duracion = duracion;
		this.resolucionVideo = resolucionVideo;
		this.framesPerSecond = framesPerSecond;
		this.relacionAspecto = relacionAspecto;
		this.formato = formato;
	}


	/**
	 * @return the resolucionVideo
	 */
	public String getResolucionVideo() {
		return resolucionVideo;
	}


	/**
	 * @param resolucionVideo the resolucionVideo to set
	 */
	public void setResolucionVideo(String resolucionVideo) {
		this.resolucionVideo = resolucionVideo;
	}


	/**
	 * @return the relacionAspecto
	 */
	public String getRelacionAspecto() {
		return relacionAspecto;
	}


	/**
	 * @param relacionAspecto the relacionAspecto to set
	 */
	public void setRelacionAspecto(String relacionAspecto) {
		this.relacionAspecto = relacionAspecto;
	}


	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}


	/**
	 * @return the framesPerSecond
	 */
	public int getFramesPerSecond() {
		return framesPerSecond;
	}


	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}
	
	/*
	 * Métodos de Video (si los tiene)
	 */
}
