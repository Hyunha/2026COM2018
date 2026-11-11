package labs.lab05;

import java.awt.*;
import javax.swing.*;

public class GrowingEgg extends JPanel {

    private final int NET_SIZE;
    private int eggWidth = 60;
    private int eggHeight = 40;
    private int x;
    private int y;

    public GrowingEgg(int size) {
        NET_SIZE = size;
        x = NET_SIZE / 2 - eggWidth / 2;
        y = NET_SIZE / 2 - eggHeight / 2;
        JFrame f = new JFrame();
        f.setTitle("Egg");
        f.setSize(NET_SIZE, NET_SIZE);
        f.getContentPane().add(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, eggWidth, eggHeight);
        eggWidth += 60;
        eggHeight += 40;
        x -= 30;
        y -= 20;
    }

    public static void main(String[] args) {
        new GrowingEgg(600);
    }
}