import estrutura.SumTwoItem;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumTwoItemTest {

	private final SumTwoItem sum = new SumTwoItem();

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessFirstPosition() {
		List<Integer> list = Arrays.asList(10, 15, 3, 7);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 17);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessSecondPosition() {
		List<Integer> list = Arrays.asList(15, 10, 3, 7);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 17);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessLastPosition() {
		List<Integer> list = Arrays.asList(15, 3, 10, 7);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 17);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessMiddle() {
		List<Integer> list = Arrays.asList(15, 10, 7, 3);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 17);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessTwoElements() {
		List<Integer> list = Arrays.asList(10, 15);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 25);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessThreeElements() {
		List<Integer> list = Arrays.asList(10, 15, 5);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 15);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberSuccessSixElements() {
		List<Integer> list = Arrays.asList(10, 15, 5, 6, 4, 5);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 15);
		assertEquals(true, response);
	}

	@Test
	public void sumTwoItensListIsEqualsNumberWithOutNumberInList() {
		List<Integer> list = Arrays.asList(15, 11, 7, 3);
		Boolean response = sum.sumTwoItemListIsEqualsNumber(list, 17);
		assertEquals(false, response);
	}


}
