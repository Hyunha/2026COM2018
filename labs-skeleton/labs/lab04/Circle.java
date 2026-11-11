package labs.lab04;

import java.text.DecimalFormat;

public class Circle {
    // TODO [실습 4-1] 1. 면적 계산을 method area(int radius)로 분리하기
    // TODO [실습 4-1] 2. radius를 입력창으로 받고, 결과를 메시지 창으로 출력하기
    public static void main(String[] args) {
        int radius = 5;
        double area = Math.PI * radius * radius;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Area of circle: " + df.format(area));
    }
}
