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
        // TODO [실습 10-2] instanceof 로 타입 확인 후 정수 값 비교
        return false;
    }

    /** equals 를 재정의하면 hashCode 도 함께 재정의한다 (완성되어 제공됨) */
    @Override
    public int hashCode() {
        return Integer.hashCode(k);
    }

    public int getInt() {
        // TODO [실습 10-2] 저장한 정수 값 반환
        return 0;
    }
}
