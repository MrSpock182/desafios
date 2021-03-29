package estrutura;

import java.util.List;

public class OrdenandoRgb {
	private int indexLetraR;
	private int indexLetraB;

	public List<String> ordernar(List<String> list) {
		indexLetraR = 0;
		indexLetraB = list.size() - 1;

		for (int i = 0; i < list.size(); i++) {
			ordernarLetraR(i, list);
			ordernarLetraB(i, list);
		}

		return list;
	}

	private void ordernarLetraR(int i, List<String> list) {
		if (list.get(i).equals("R")) {
			String value = list.get(indexLetraR);
			list.set(indexLetraR, list.get(i));
			list.set(i, value);
			indexLetraR = indexLetraR + 1;
		}

	}

	private void ordernarLetraB(int i, List<String> list) {
		if (list.get(i).equals("B") && indexLetraB > i) {
			String value = list.get(indexLetraB);

			if (!value.equals("R")) {
				list.set(indexLetraB, list.get(i));
				list.set(i, value);
			} else {
				ordernarLetraRDepoisB(i, value, list);
			}

			indexLetraB = indexLetraB - 1;
		}
	}

	private void ordernarLetraRDepoisB(int i, String value, List<String> list) {
		String valueR = list.get(indexLetraR);
		list.set(indexLetraR, value);
		list.set(indexLetraB, valueR);
		list.set(indexLetraB, list.get(i));
		list.set(i, valueR);
		indexLetraR = indexLetraR + 1;
	}

}

