package chapters.week13.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriteTest {
    public static void main(String[] args) throws IOException {
        // 쓸 용도로 파일 만들고 열기 (덮어쓰기)
        try (PrintWriter outfile = new PrintWriter(
                new FileWriter("poem.txt", StandardCharsets.UTF_8))) {
            outfile.println("가을이 오면...");
            outfile.println("학기가 저물고,");
            outfile.println("시험이 끝나면서");
            outfile.println("겨울이 온다.");
        }   // 블록을 벗어나면 자동으로 닫힘

        // 이어 쓸 용도로 파일 열기 (마지막 인수 true = append)
        try (PrintWriter outfile = new PrintWriter(
                new FileWriter("poem.txt", StandardCharsets.UTF_8, true))) {
            outfile.println("방학이 되면...");
            outfile.println("뭘 할까?");
        }
    }
}
