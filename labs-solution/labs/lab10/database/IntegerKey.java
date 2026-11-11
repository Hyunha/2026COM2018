package labs.lab10.database;

public class IntegerKey implements Key {
    private int k;

    public IntegerKey(int i) {
        k = i;
    }

    /** equals - 인수로 제공된 키와 자신이 같은지 비교
     * @param o 비교 대상 (어떤 객체든 올 수 있음)
     * @return 같으면 true, 다르면 false */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerKey)) return false;   // 타입 먼저 확인
        return k == ((IntegerKey)o).getInt();
    }

    /** equals 를 재정의하면 hashCode 도 함께 재정의한다 */
    @Override
    public int hashCode() {
        return Integer.hashCode(k);
    }

    public int getInt() {
        return k;
    }
}
