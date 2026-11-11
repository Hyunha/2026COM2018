package labs.lab02;

import javax.swing.*;

public class DivisibleBy9Easy {
    public static void main(String[] args) {
        int value = Integer.parseInt(JOptionPane.showInputDialog("정수를 주세요."));
        int valueAbs = Math.abs(value);
        JOptionPane.showMessageDialog(null, "정수 " + valueAbs + "은(는) 9로 나누어 떨어지나? " + (valueAbs % 9 == 0));
    }
}
