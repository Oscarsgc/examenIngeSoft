import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAnio {
	private Anio anio;

	@Before
	public void setup() {
		anio = new Anio();
	}

	@Test
	public void testObtenerAnio() {
		anio.setAnio(1990);
		assertEquals(1990, anio.getAnio());
	}

	@Test
	public void testCambiarAnio() {
		anio = new Anio(1920);
		anio.setAnio(1999);
		assertEquals(1999, anio.getAnio());
	}

	@Test
	public void testSiAnioEsBisiesto() {
		anio = new Anio(1920);
		assertEquals(true, anio.esBisiesto());
	}
}
