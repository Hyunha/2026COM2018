package labs.lab10.database;

public class StringKey implements Key {
    private String s;

    public StringKey(String j) {
        s = j;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StringKey)) return false;    // 타입 먼저 확인
        return s.equals(((StringKey)o).getString());    // 문자열 내용 비교는 equals
    }

    /** equals 를 재정의하면 hashCode 도 함께 재정의한다 */
    @Override
    public int hashCode() {
        return s.hashCode();
    }

    public String getString() {
        return s;
    }
}
