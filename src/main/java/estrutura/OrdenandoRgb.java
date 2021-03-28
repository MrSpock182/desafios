package estrutura;

import java.util.List;

public class OrdenandoRgb {

	public List<String> ordernar(List<String> list) {
		int index = 0;

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("R")) {
				String value = list.get(index);
				list.set(index, list.get(i));
				list.set(i, value);
				index = index + 1;
			}
		}

		for (int i = index; i < list.size(); i++) {
			if(list.get(i).equals("G")) {
				String value = list.get(index);
				list.set(index, list.get(i));
				list.set(i, value);
				index = index + 1;
			}
		}

		return list;
	}

}
