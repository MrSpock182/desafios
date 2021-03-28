import estrutura.AdicionandoZerosNoInicio;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdicionandoZerosNoInicioTest {

	private final AdicionandoZerosNoInicio service = new AdicionandoZerosNoInicio();

	@Test public void iniciaZeroUmTest() {
		List<Integer> resultadoEsperado = Arrays.asList(5, 4, 3, 2, 1, 0, 0);
		List<Integer> list = Arrays.asList(5, 0, 4, 3, 0, 2, 1);

		List<Integer> result = service.iniciaZero(list);
		assertEquals(resultadoEsperado, result);
	}

	@Test public void iniciaZeroDoisTest() {
		List<Integer> resultadoEsperado = Arrays.asList(9, 8, 4, 1, 3, 0, 0);
		List<Integer> list = Arrays.asList(9, 8, 4, 1, 0, 3, 0);

		List<Integer> result = service.iniciaZero(list);
		assertEquals(resultadoEsperado, result);
	}

	@Test public void iniciaZeroTresTest() {
		List<Integer> resultadoEsperado = Arrays.asList(1, 2, 3, 4, 5, 0, 0);
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 0);

		List<Integer> result = service.iniciaZero(list);
		assertEquals(resultadoEsperado, result);
	}

}
