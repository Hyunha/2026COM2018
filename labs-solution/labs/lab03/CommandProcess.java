package labs.lab03;

import javax.swing.*;

public class CommandProcess {
    public static void main(String[] args) {
        String command = JOptionPane.showInputDialog("Input Command");
        command = command.toLowerCase();
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
