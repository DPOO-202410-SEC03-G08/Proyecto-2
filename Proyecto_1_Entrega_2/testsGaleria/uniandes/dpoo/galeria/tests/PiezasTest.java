package uniandes.dpoo.galeria.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import uniandes.dpoo.galeria.modelo.pieza.Escultura;

class PiezasTest {

	@Test
	void testNecesitaElectricidad() {
		Date fechaCreacion = new Date ();
		Date fechaEntrega = new Date ();
		List<String> autores = new ArrayList<>();
		autores.add("MiguelAngel");
		List<String> detallesAdicionales = new ArrayList<>();
		detallesAdicionales.add("no se necesitan especificaciones");
		List<String> materialesConstruccion = new ArrayList<>();
		materialesConstruccion.add("Marmol blanco");
		Escultura e = new Escultura ("David", fechaCreacion, "Florencia-Italia", autores, "Venta Fija", fechaEntrega, 
				detallesAdicionales, 2000000, 5.17, 1.05, 0.85, materialesConstruccion, 
				5572, false);
		
		assertAll(
				() -> assertEquals(false, e.isNecesitaElectricidad())
		);
	}
}
