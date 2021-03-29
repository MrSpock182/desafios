import estrutura.OrdenandoRgb;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrdenandoRgbTest {

	private final OrdenandoRgb ordenandoRgb = new OrdenandoRgb();

	@Test
	public void testarOrdemOne() {
		List<String> resultadoEsperado = Arrays.asList("R", "R", "R", "G", "G", "B", "B");
		List<String> list = Arrays.asList("G", "B", "R", "R", "B", "R", "G");

		List<String> resulto = ordenandoRgb.ordernar(list);
		assertEquals(resultadoEsperado, resulto);
	}

	@Test
	public void testarOrdemTwo() {
		List<String> resultadoEsperado = Arrays.asList("R", "G", "B");
		List<String> list = Arrays.asList("G", "B", "R");

		List<String> resulto = ordenandoRgb.ordernar(list);
		assertEquals(resultadoEsperado, resulto);
	}

	@Test
	public void testarOrdemThree() {
		List<String> resultadoEsperado = Arrays.asList("R", "G", "G", "G", "G", "B", "B");
		List<String> list = Arrays.asList("G", "B", "G", "G", "B", "R", "G");

		List<String> resulto = ordenandoRgb.ordernar(list);
		assertEquals(resultadoEsperado, resulto);
	}

}
