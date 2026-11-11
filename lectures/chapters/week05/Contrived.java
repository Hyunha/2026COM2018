package chapters.week05;

public class Contrived {

    private double d = 3.14;

    public Contrived() {
        System.out.println(s);
        System.out.println(d);
        int d = 2;
        System.out.println(d);
        s = d + s;
        System.out.println(s);
    }

    private String s = "X" + d;

    public static void main(String[] args) {
        new Contrived();
    }
}
