package union;

import com.sun.source.doctree.TextTree;
import reactor.util.annotation.NonNull;

import java.util.*;
import java.util.stream.Collectors;

public class Union {

	public void uni() {
		List<Test> lists = Arrays.asList(new Test("123", Arrays.asList("1", "3", "5")),
				new Test("123", Arrays.asList("2", "4", "6")),
				new Test("124", Arrays.asList("1", "3", "4")),
				new Test("154", null));

		List<Test> list = lists.stream()
				.collect(Collectors.groupingBy(Test::getCnpj))
				.values().stream()
				.map(this::test)
				.collect(Collectors.toList());

		list.forEach(System.out::println);
	}

	private Test test(List<Test> list) {
		Test test = new Test(list.get(0).getCnpj());
		List<String> l = new ArrayList<>();
		list.forEach(v -> {
			Optional<List<String>> optional = Optional.ofNullable(v.getList());
			if(optional.isPresent()) {
				l.addAll(v.getList());
			}
		});
		test.setList(l);
		return test;
	}

}
