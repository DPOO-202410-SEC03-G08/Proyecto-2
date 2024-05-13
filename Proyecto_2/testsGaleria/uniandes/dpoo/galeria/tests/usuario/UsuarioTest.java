package uniandes.dpoo.galeria.tests.usuario;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import uniandes.dpoo.galeria.modelo.Galeria;
import uniandes.dpoo.galeria.modelo.pieza.Escultura;
import uniandes.dpoo.galeria.modelo.pieza.Pieza;
import uniandes.dpoo.galeria.modelo.pieza.Pintura;
import uniandes.dpoo.galeria.modelo.usuario.Administrador;
import uniandes.dpoo.galeria.modelo.usuario.Cliente;
import uniandes.dpoo.galeria.modelo.usuario.UserManager;
import uniandes.dpoo.galeria.modelo.usuario.Usuario;
import uniandes.dpoo.galeria.modelo.ventas.VentasManager;

class UsuarioTest {
	
	public Usuario usuario;

	@Test
	void testConfirmarConsignacion() {
		
		/**
		 * Pieza 1: La Mona Lisa
		 */
		
		Date fechaCreacion = new Date();
		List<String> autores = new ArrayList<>();
		autores.add("Leonardo Davinci");
		Date fechaEntrega = new Date();
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores = new ArrayList<>();
		colores.add("crema");
		colores.add("baige");
		colores.add("marron");
		colores.add("verde");
		
		Pintura pintura1 = new Pintura ("Mona lisa", fechaCreacion, "Paris-Francia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 150000000, colores, "Pintura al oleo", "Pintura al oleo", "Tabla de álamo");
		
		/**
		 * Pieza 2: La noche estrellada
		 */
		
		Date fechaCreacion2 = new Date();
		List<String> autores2 = new ArrayList<>();
		autores.add("Vincent Van Gogh");
		Date fechaEntrega2 = new Date();
		List<String> detallesAdicionales2 = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores2 = new ArrayList<>();
		colores2.add("Ultramarino artificial");
		colores2.add("Azul cobalto");
		colores2.add("Amarillo indio");
		colores2.add("Amarillo de cadmio");
		colores2.add("Verde esmeralda");
		colores2.add("Blanco de plomo");
		
		Pintura pintura2 = new Pintura ("La noche estrellada", fechaCreacion2, "Paris-Francia", autores2, "Venta Fija", fechaEntrega2, 
				detallesAdicionales2, 250000000, colores2, "Oleo sobre lienzo", " sobre lienzo", "Lienzo");
		
		/**
		 * Pieza 3
		 */
		
		Date fechaCreacion3 = new Date ();
		Date fechaEntrega3 = new Date ();
		List<String> autores3 = new ArrayList<>();
		autores.add("MiguelAngel");
		List<String> detallesAdicionales3 = new ArrayList<>();
		detallesAdicionales.add("no se necesitan especificaciones");
		List<String> materialesConstruccion = new ArrayList<>();
		materialesConstruccion.add("Marmol blanco");
		Escultura escultura = new Escultura ("David", fechaCreacion3, "Florencia-Italia", autores3, "Venta Fija", fechaEntrega3, 
				detallesAdicionales3, 2000000, 5.17, 1.05, 0.85, materialesConstruccion, 
				5572, false);
		
		/**
		 * Lista de piezas
		 */
		
		ArrayList<Pieza> listaPiezas = new ArrayList<>();
		/**
		 * listaPiezas.add(pintura1);
		 */
		listaPiezas.add(pintura2);
		listaPiezas.add(escultura);
		
		Administrador admin = new Administrador ("Juan Camacho", "juanrcama07@gmail.com", 314790314, 1234, null);
		
		assertAll(
				() -> assertEquals(true, admin.confirmarConsignacion(pintura1, listaPiezas))
		);
	}
	
	@Test
	void testconfirmarCompra () {
		
		/**
		 * Cliente
		 */
		
		Administrador admin = new Administrador ("Juan Camacho", "juanrcama07@gmail.com", 314790314, 1234, null);
		
		Cliente cliente = new Cliente ("Juan Carlos Granados", "jc.granados@gmail.com", 312908768, 4638739, 1250000, null, 2700000);
		
		assertAll (
				() -> assertEquals(true, admin.confirmarCompra(cliente))
		);
	}
	
	@Test
	void testAddUsuario () {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		Cliente usuario = new Cliente ("Juan Carlos Granados", "jc.granados@gmail.com", 312908768, 4638739, 1250000, null, 2700000); 
		
		/**
		 * Agregar cliente a la lista
		 */
		
		
		
		assertAll (
				() -> assertEquals(true,usuarios.add(usuario))
		);
	}
	
	@Test
	void testgetHistoriaCompradorValorColeccion () {
		
		Administrador admin = new Administrador ("Juan Camacho", "juanrcama07@gmail.com", 314790314, 1234, null);
		
		Cliente cliente = new Cliente ("Juan Carlos Granados", "jc.granados@gmail.com", 312908768, 4638739, 1250000, null, 2700000); 
		
		assertAll (
				() -> assertEquals(0, admin.gethistoriaCompradorValorColeccion(cliente))
		);
	}
	
	@Test 
	void testgetHistoriaCompradorPiezas () {
		
		Administrador admin = new Administrador ("Juan Camacho", "juanrcama07@gmail.com", 314790314, 1234, null);
		
		UserManager userManager = new UserManager (null);
		
		Cliente cliente = new Cliente ("Juan Carlos Granados", "jc.granados@gmail.com", 312908768, 4638739, 1250000, null, 2700000);
		
		Date fechaCreacion = new Date();
		List<String> autores = new ArrayList<>();
		autores.add("Leonardo Davinci");
		Date fechaEntrega = new Date();
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores = new ArrayList<>();
		colores.add("crema");
		colores.add("baige");
		colores.add("marron");
		colores.add("verde");
		
		Pintura Pieza = new Pintura ("Mona lisa", fechaCreacion, "Paris-Francia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 150000000, colores, "Pintura al oleo", "Pintura al oleo", "Tabla de álamo");
		
		List<HashMap<String, Pieza>> lista = new ArrayList<>();
		
		assertAll (
				() -> assertEquals (lista, admin.gethistoriaCompradorPiezas(cliente, userManager))
		);
	}
	
	@Test
	void testgetHistorialPiezaDueño () {
		
		Cliente cliente = new Cliente ("Juan Carlos Granados", "jc.granados@gmail.com", 312908768, 4638739, 1250000, null, 2700000);
		
		Date fechaCreacion = new Date();
		List<String> autores = new ArrayList<>();
		autores.add("Leonardo Davinci");
		Date fechaEntrega = new Date();
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores = new ArrayList<>();
		colores.add("crema");
		colores.add("baige");
		colores.add("marron");
		colores.add("verde");
		
		Pintura Pieza = new Pintura ("Mona lisa", fechaCreacion, "Paris-Francia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 150000000, colores, "Pintura al oleo", "Pintura al oleo", "Tabla de álamo");
		
		assertAll (
				() -> assertEquals (cliente, usuario.getHistorialPiezaDueño(Pieza))
		);
	}
	
	@Test 
	void testgetHistorialPiezaPrecioVenta () {
		
		Date fechaCreacion = new Date();
		List<String> autores = new ArrayList<>();
		autores.add("Leonardo Davinci");
		Date fechaEntrega = new Date();
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores = new ArrayList<>();
		colores.add("crema");
		colores.add("baige");
		colores.add("marron");
		colores.add("verde");
		
		Pintura Pieza = new Pintura ("Mona lisa", fechaCreacion, "Paris-Francia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 150000000, colores, "Pintura al oleo", "Pintura al oleo", "Tabla de álamo");
		
		assertAll (
				() -> assertEquals (0.0, usuario.getHistorialPiezaPrecioVenta(Pieza))
		);
	}
	
	@Test
	void testgethistorialPiezaFechaVenta () {
		
		Date fecha = new Date ();
		
		Date fechaCreacion = new Date();
		List<String> autores = new ArrayList<>();
		autores.add("Leonardo Davinci");
		Date fechaEntrega = new Date();
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("No tiene especificaciones adicionales");
		List<String> colores = new ArrayList<>();
		colores.add("crema");
		colores.add("baige");
		colores.add("marron");
		colores.add("verde");
		
		Pintura Pieza = new Pintura ("Mona lisa", fechaCreacion, "Paris-Francia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 150000000, colores, "Pintura al oleo", "Pintura al oleo", "Tabla de álamo");
		
		assertAll (
				() -> assertEquals (fecha, usuario.getHistorialPiezaFechaVenta(Pieza))
		);
	}
}
