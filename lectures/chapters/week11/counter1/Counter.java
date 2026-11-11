package chapters.week11.counter1;

public class Counter {
    private int  counter;

    public Counter(int start) {
        counter = start;
    }

    public void increment() {
        counter++;
    }

    public int countOf() {
        return counter;
    }
}
