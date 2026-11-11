package chapters.week11.button;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {

    public Button() {

        JLabel label = new JLabel("OK 누르세요!");
        JButton button = new JButton("OK");

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.add(button);

        setTitle("Button");
        setSize(200, 70);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Button();
    }
}
