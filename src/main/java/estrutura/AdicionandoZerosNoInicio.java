package estrutura;

import java.util.List;

public class AdicionandoZerosNoInicio {

	public List<Integer> iniciaZero(final List<Integer> list) {
		int index = 0;

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != 0) {
				int value = list.get(index);
				list.set(index, list.get(i));
				list.set(i, value);
				index = index + 1;
			}
		}

		return list;
	}

}
