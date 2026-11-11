package labs.lab02;

import javax.swing.*;

public class DivisibleBy9Hard {
    public static void main(String[] args) {
        int value = Integer.parseInt(JOptionPane.showInputDialog("정수를 주세요."));
        int valueAbs = Math.abs(value);
        int sum = valueAbs % 10;
        sum = sum + (valueAbs / 10) % 10;
        sum = sum + (valueAbs / 100) % 10;
        sum = sum + (valueAbs / 1000) % 10;
        sum = sum + (valueAbs / 10000) % 10;
        JOptionPane.showMessageDialog(null, "정수 " + valueAbs + "은(는) 9로 나누어 떨어지나? " + (sum % 9 == 0));
    }
}
