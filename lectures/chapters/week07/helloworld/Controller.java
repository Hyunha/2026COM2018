package chapters.week07.helloworld;

public class Controller {
    public void control(Model m, View v) {
        v.show(m.createGreetings());
    }
}
