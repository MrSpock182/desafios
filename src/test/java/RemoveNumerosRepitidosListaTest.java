import estrutura.RemoveNumerosRepitidosLista;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveNumerosRepitidosListaTest {

	private final RemoveNumerosRepitidosLista removeNumerosRepitidosLista = new RemoveNumerosRepitidosLista();

	@Test public void removeTest() {
		List<Integer> value = Collections.singletonList(1);
		List<Integer> esperado = Collections.singletonList(1);
		List<Integer> remove = removeNumerosRepitidosLista.remove(value);
		assertEquals(esperado, remove);
	}

	@Test public void remove() {
		List<Integer> value = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6);
		List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> remove = removeNumerosRepitidosLista.remove(value);
		assertEquals(esperado, remove);
	}

	@Test public void removeListaVazia() {
		List<Integer> value = Collections.emptyList();
		List<Integer> esperado = Collections.emptyList();
		List<Integer> remove = removeNumerosRepitidosLista.remove(value);
		assertEquals(esperado, remove);
	}

}
