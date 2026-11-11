package labs.lab10.database;

public interface Key {

	/** equals - 인수로 제공된 키와 자신이 같은지 비교
	 * @param obj 비교 대상 (어떤 객체든 올 수 있음)
	 * @return 같으면 true, 다르면 false */
	boolean equals(Object obj);

}
