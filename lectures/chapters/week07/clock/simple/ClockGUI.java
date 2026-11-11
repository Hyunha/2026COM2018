package chapters.week07.clock.simple;

import javax.swing.*;
import java.time.LocalTime;

public class ClockGUI {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, LocalTime.now());
    }
}
