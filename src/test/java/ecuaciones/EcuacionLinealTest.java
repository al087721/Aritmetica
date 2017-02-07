package ecuaciones;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertEquals(0.0,ecuacionLineal.ResuelveLineal(1.0,0), 0.0);

	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertEquals(-1.0,ecuacionLineal.ResuelveLineal(1.0,1.0),0.0);
		
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertEquals(-0.5,ecuacionLineal.ResuelveLineal(2.0,1.0),0.0);
	}

}
