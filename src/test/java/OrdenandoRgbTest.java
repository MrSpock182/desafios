import estrutura.OrdenandoRgb;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrdenandoRgbTest {

	private final OrdenandoRgb ordenandoRgb = new OrdenandoRgb();

	@Test
	public void testarOrdem() {
		List<String> resultadoEsperado = Arrays.asList("R", "R", "R", "G", "G", "B", "B");
		List<String> list = Arrays.asList("G", "B", "R", "R", "B", "R", "G");

		List<String> resulto = ordenandoRgb.ordernar(list);
		assertEquals(resultadoEsperado, resulto);
	}

}
