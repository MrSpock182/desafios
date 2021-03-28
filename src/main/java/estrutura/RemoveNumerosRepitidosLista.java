package estrutura;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumerosRepitidosLista {

	private final List<Integer> retorno = new ArrayList<>();

	/** COMPLEXIBILIDADE **/
	public List<Integer> remove(List<Integer> list) {
		if(list.isEmpty()) {
			return list;
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if(!list.get(i).equals(list.get(i + 1))) {
				retorno.add(list.get(i));
			}
		}

		retorno.add(list.get(list.size() - 1));
		return retorno;
	}
}
