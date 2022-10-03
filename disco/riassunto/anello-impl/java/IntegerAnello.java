package anello;

public class IntegerAnello implements AbstractAnello {
	public Integer getZero() {
		return 0;
	}

	public Integer getOne() {
		return 1;
	}

	public Integer sum(Integer a, Integer b) {
		return a+b;
	}

	public Integer prod(Integer a, Integer b) {
		return a*b;
	}
}
