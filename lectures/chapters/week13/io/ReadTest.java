package chapters.week13.io;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadTest {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog("읽을 파일 이름을 쓰세요.");
        // try-with-resources : 괄호 안에서 연 파일은 블록을 벗어날 때 자동으로 닫힘
        try (BufferedReader infile = new BufferedReader(
                     new FileReader(fileName, StandardCharsets.UTF_8));
             PrintWriter outfile = new PrintWriter(
                     new FileWriter(fileName + ".out", StandardCharsets.UTF_8))) {
            String s;
            while ((s = infile.readLine()) != null) {   // 더 읽을 줄이 없으면 null
                outfile.println(s);
            }
        }   // close() 를 부르지 않아도 여기서 두 파일 모두 닫힘
    }
}
