package labs.lab10.database;

public class StringKey implements Key {
    private String s;

    public StringKey(String j) {
        s = j;
    }

    @Override
    public boolean equals(Object o) {
        // TODO [실습 10-2] instanceof 로 타입 확인 후 문자열 내용 비교
        return false;
    }

    /** equals 를 재정의하면 hashCode 도 함께 재정의한다 (완성되어 제공됨) */
    @Override
    public int hashCode() {
        return s.hashCode();
    }

    public String getString() {
        // TODO [실습 10-2] 저장한 문자열 반환
        return null;
    }
}
