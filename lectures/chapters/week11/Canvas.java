package chapters.week11;

import javax.swing.*;
// java.awt.* 로 한꺼번에 불러오면 java.awt.Canvas 와 이 클래스의 이름이 겹치므로
// 필요한 클래스만 골라서 불러온다.
import java.awt.Color;
import java.awt.Graphics;

public class Canvas extends JPanel {
    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas");
        frame.setSize(300, 200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
        // draw string
//        g.setColor(Color.RED);
//        g.drawString("Java!", 100, 60);

        // draw a rectangle and oval
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.MAGENTA);
        g.drawRect(100, 60, 90, 60);
        g.fillOval(100, 60, 50, 50);
    }

    // test code
    public static void main(String[] args) {
        new Canvas();
    }
}
