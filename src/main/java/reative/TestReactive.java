package reative;

import reactor.core.publisher.Flux;

public class TestReactive {

	public Flux<Integer> test() {
		return getInt()
				.map(this::save);
	}

	private Flux<Integer> getInt() {
		return Flux.just(1, 2, 3, 4, 5).log();
	}

	private Integer save(Integer i) {
		System.out.println(i);
		return i;
	}

}
