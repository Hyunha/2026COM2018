package chapters.week03;

import javax.swing.*;

public class ClassManagementOther {
    public static void main(String[] args) {
        double totalPoints = 0.0;
        int count = 0;
        boolean processing = true;
        while (processing) {
            // loop invariant : totalPoints == 지금까지 합산한 점수의 합
            String message = "다음 시험 점수? (입력 완료시 Cancel 버튼 누름)";
            String input = JOptionPane.showInputDialog(message);
            if (input == null) // Cancel 버튼을 눌렀음
                processing = false;
            else {
                int score = Integer.parseInt(input);
                totalPoints = totalPoints + score;
                count = count + 1;
            }
            System.out.println("개수 = " + count + ", 누적 점수 = " + totalPoints);
        }
        if (count == 0)
            throw new RuntimeException("computeAverage error: 계산할 점수가 없습니다.");

        System.out.println("평균 점수 = " + totalPoints / count);
    }
}
