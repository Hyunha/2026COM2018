package labs.lab03;

import javax.swing.*;

public class CommandProcess {
    public static void main(String[] args) {
        String command = JOptionPane.showInputDialog("Input Command");

        // TODO [실습 3-3] 아래 if 문을 command.toLowerCase()를 활용한 switch 문으로 바꾸기
        String statusLog = "unknown";
        if ("start".equals(command)) {
            statusLog = "Starting...";
        } else if ("stop".equals(command)) {
            statusLog = "Stopping...";
        } else if ("pause".equals(command)) {
            statusLog = "Pausing...";
        } else if ("resume".equals(command)) {
            statusLog = "Resuming...";
        }

        System.out.println(statusLog);
    }
}
