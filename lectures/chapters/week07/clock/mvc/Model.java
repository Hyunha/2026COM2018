package chapters.week07.clock.mvc;

import java.time.LocalTime;

public class Model {
    LocalTime whatTimeIsIt() {
        return LocalTime.now();
    }
}
