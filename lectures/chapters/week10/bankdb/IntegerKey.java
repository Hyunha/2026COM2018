package chapters.week10.bankdb;

public class IntegerKey implements Key {
	
	private int key;
	
	public IntegerKey(int i) {
		key = i;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof IntegerKey)) return false;
		return key == ((IntegerKey)o).getInt();
	}
	
	/** equals 를 재정의하면 hashCode 도 함께 재정의해야 한다.
	 *  (같다고 판정한 두 객체는 같은 해시값을 내놓아야 한다는 약속) */
	@Override
	public int hashCode() {
		return Integer.hashCode(key);
	}

	public int getInt() {
		return key;
	}

}


