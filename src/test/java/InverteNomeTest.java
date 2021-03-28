import estrutura.InverteNome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InverteNomeTest {

	private final InverteNome invertenome = new InverteNome();

	@Test
	public void inverterNome() {
		String retorno = invertenome.inverte("MARIA");
		assertEquals("AIRAM", retorno);
	}

	@Test
	public void isPalindrome() {
		Boolean palindrome = invertenome.isPalindrome("a droga do dote e todo da gorda");
		assertEquals(true, palindrome);
	}

	@Test
	public void isNotPalindrome() {
		Boolean palindrome = invertenome.isPalindrome("RONALDO");
		assertEquals(false, palindrome);
	}
}
