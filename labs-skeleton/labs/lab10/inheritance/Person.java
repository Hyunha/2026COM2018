package labs.lab10.inheritance;

public class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean sameName(Person other) {
        return getName().equals(other.getName());
    }
}
