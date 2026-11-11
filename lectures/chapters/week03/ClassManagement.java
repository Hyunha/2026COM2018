package chapters.week03;

import javax.swing.*;

public class ClassManagement {
    public static void main(String[] args) {
        int howMany = 5;
        double totalPoints = 0.0;
        int count = 0;
        while (count < howMany) {
            // loop invariant : totalPoints == 지금까지 합산한 점수의 합
            String input = JOptionPane.showInputDialog("다음 시험 점수?");
            int score = Integer.parseInt(input);
            totalPoints = totalPoints + score;
            count = count + 1;
            System.out.println("개수 = " + count + ", 누적 점수 = " + totalPoints);
        }
        System.out.println("평균 점수 = " + totalPoints / howMany);
    }
}
