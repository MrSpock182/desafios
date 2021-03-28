package estrutura;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumTwoItem {

	public Boolean sumTwoItemListIsEqualsNumber(final List<Integer> list, final Integer number) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			int valorAlvo = number - list.get(i);
			if(!map.containsKey(valorAlvo)) {
				map.put(list.get(i), i);
			} else {
				return true;
			}
		}

		return false;
	}

	// TWO POINTERS
	public Boolean sumTwoItemListOrderIsEqualsNumber(final List<Integer> list, final Integer number) {
		return false;
	}

	// THREE POINTERS
	public Boolean sumThreeItemListOrderIsEqualsNumber(final List<Integer> list, final Integer number) {
		return false;
	}
}
