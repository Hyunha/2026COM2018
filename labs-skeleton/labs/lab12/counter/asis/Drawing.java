package labs.lab12.counter.asis;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    private Counter count;

    public Drawing(Counter m) {
        count = m;
        setSize(200, 200);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 200, 200);
        // TODO [실습 12-2] 색을 바꿔도 기존 공의 색상이 유지되도록 수정 (Color 배열을 어디에 둘지 고민)
        g.setColor(count.getColor());
        int x = 0, y = 0;
        for (int i = 0; i != count.countOf(); i++) {
            g.fillOval(x * 25, y * 25, 20, 20);
            x++;
            if (x > 7) {
                x = 0;
                y++;
            }
        }
    }
}
