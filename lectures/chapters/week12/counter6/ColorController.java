package chapters.week12.counter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// getSource 방식: 비교할 메뉴 항목을 필드로 가지고 있다가, 이벤트를 일으킨 객체와 직접 비교한다
public class ColorController implements ActionListener {
    private Counter model;
    private JMenuItem red = new JMenuItem("빨강");
    private JMenuItem blue = new JMenuItem("파랑");
    private JMenuItem yellow = new JMenuItem("노랑");

    public ColorController(Counter model) {
        this.model = model;
        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
    }

    public JMenu makeMenu() {
        JMenu menu = new JMenu("색 바꾸기");
        menu.add(red);
        menu.add(blue);
        menu.add(yellow);
        return menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == red) {
            model.setColor(Color.RED);
        } else if (source == blue) {
            model.setColor(Color.BLUE);
        } else if (source == yellow) {
            model.setColor(Color.YELLOW);
        }
    }
}
