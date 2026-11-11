package chapters.week11.cw1st;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class ClockWriter extends JPanel {
    public ClockWriter() {
        int width = 200;
        // 프레임 생성
        JFrame frame = new JFrame();
        // 자신(패널)을 프레임에 끼우기
        frame.getContentPane().add(this);
        // 프레임 만들어 보여주기
        frame.setTitle("Clock");
        frame.setSize(width, width);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
        int width = 200;
        // 바탕은 흰색으로
        g.setColor(Color.white);
        g.fillRect(0, 0, width, width);
        // 현재 시간 + 시침, 분침 각도 계산
        LocalTime now = LocalTime.now();
        int minutesAngle = 90 - now.getMinute() * 6;
        int hoursAngle = 90 - now.getHour() * 30;
        // 시계 크기 설정
        int x = 50;
        int y = 50;
        int diameter = 100;
        // 시계 판 그리기
        g.setColor(Color.black);
        g.drawOval(x, y, diameter, diameter);
        // 분침 그리기
        g.setColor(Color.red);
        g.fillArc(x+5, y+5, diameter-10, diameter-10, minutesAngle, 5);
        // 시침 그리기
        g.setColor(Color.blue);
        g.fillArc(x+25, y+25, diameter-50, diameter-50, hoursAngle, -8);
    }

    public static void main(String[] args) {
        new ClockWriter();
    }
}
