package labs.lab11;

import javax.swing.*;
import java.awt.*;

public class Archery extends JPanel {
    private final int RINGS = 10; // 원의 개수
    private final int TARGET_DIAMETER;

    /* Constructor Archery - 양궁 과녁 패널을 만들고 프레임에 넣음
     * @param d - 과녁의 직경 */
    public Archery(int d) {
        TARGET_DIAMETER = d;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("양궁 과녁");
        f.setSize(TARGET_DIAMETER, TARGET_DIAMETER + 28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /* paintComponent - 패널에 그림을 그림
     * @param g - 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        // 녹색 바탕 색칠하기
        g.setColor(Color.green);
        g.fillRect(0,  0, TARGET_DIAMETER, TARGET_DIAMETER);
        // 링의 간격 OFFSET
        final int OFFSET = TARGET_DIAMETER / RINGS;
        int number = 1;
        int diameter = TARGET_DIAMETER;
        int newXPosition = 0;
        int newYPosition = 0;
        // 밖의 원부터 가장 안에 있는 원까지 순서대로 그린다.
        while (number <= RINGS) {
            // loop invariant (루프 불변 성질): 지금까지 number-1 개의 링을 그렸음
            if (number <= 2) {
                // TODO : 흰 배경, 회색 선으로 가장 밖의 두 원을 그린다.
                // ...
            }
            else if (number <= 4) {
                // TODO : 검은 배경, 흰색 선으로 다음 두 원을 그린다.
                // HINT : 흰색 선 하나만 그리면 된다.
                // ...
            }
            else if (number <= 6) {
                // TODO : 파란 배경, 흰색 선으로 다음 두 원을 그린다.
                // ...
            }
            else if (number <= 8) {
                // TODO : 붉은 배경, 흰색 선으로 다음 두 원을 그린다.
                // ...
            }
            else if (number <= 10) {
                // TODO : 노란 배경, 빨간 선으로 마지막 원을 그린다.
                // ...
            }
            // 반복 때마다 x, y 위치 정보와 number, diameter 를 갱신한다. 
            // ...
            break; // 임시: 갱신 코드가 없을 때 무한 루프를 막음. 갱신 코드를 작성한 뒤 반드시 삭제할 것!
        }
    }

    public static void main(String[] args) {
        new Archery(400);
    }

}
