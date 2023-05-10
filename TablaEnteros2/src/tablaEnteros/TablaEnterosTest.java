package tablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	private TablaEnteros tabla;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("INCIO DE LOS TESTS");
		System.out.println();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FINAL DE LOS TESTS");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio de la prueba");
		Integer[] elementos = { 1, 2, 3, 4, 5 };
		tabla = new TablaEnteros(elementos);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Final de la prueba");
	}

	@Test
	void testSumaTabla() {
		assertEquals(15, tabla.sumaTabla());
	}

	@Test
	void testMayorTabla() {
		assertEquals(5, tabla.mayorTabla());
	}

	@Test
	void testPosicionTabla_1() {
		assertEquals(2, tabla.posicionTabla(3));
	}

	@Test
	void testPosicionTabla_2() {
		assertThrows(Exception.class, () -> {
			tabla.posicionTabla(6);
		});
	}

}
