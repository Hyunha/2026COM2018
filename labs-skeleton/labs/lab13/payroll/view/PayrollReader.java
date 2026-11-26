package labs.lab13.payroll.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.nio.charset.StandardCharsets;

public class PayrollReader {
    private BufferedReader infile;
    private final String EOF = "!";
    private String name;
    private int hours, payrate;

    public PayrollReader(String fileName) {
        try {
            infile = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8));
        }
        catch (Exception e) {
            System.out.println("PayrollReader Error - bad file name: " + fileName);
            throw new RuntimeException(e.toString());
        }
    }

    public String nameOf() { return name; }

    public int hoursOf() { return hours; }

    public int payrateOf() { return payrate; }

    public void close() {
        try { infile.close(); }
        catch (IOException e) {
            System.out.println("PayrollReader Warning - file close failed");
        }
    }

    public boolean getNextRecord() {
        boolean result = false;
        try {
            String line = infile.readLine();   // 더 읽을 줄이 없으면 null
            if (line != null) {
                StringTokenizer t = new StringTokenizer(line, ",");
                String s = t.nextToken().trim();
                if (!EOF.equals(s))
                    if (t.countTokens() == 2) {
                        name = s;
                        hours = Integer.parseInt((t.nextToken().trim()));
                        payrate = Integer.parseInt((t.nextToken().trim()));
                        result = true;
                    }
                    else {
                        throw new RuntimeException(line);
                    }
            }
        }
        catch (IOException e) {
            System.out.println("PayrollReader Error : " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("PayrollReader Error - bad record format: " +
                    e.getMessage() + " Skipping");
            result = getNextRecord(); // 다음 줄 시도
        }
        return result;
    }

    public static void main(String[] args) {
        String fileName = "payroll.csv";
        PayrollReader pr = new PayrollReader(fileName);

        while (pr.getNextRecord()) {
            String name = pr.nameOf();
            int hours = pr.hoursOf();
            int payrate = pr.payrateOf();
            int payment = hours * payrate;
            System.out.println(name + "," + payment);
        }
        System.out.println("!");
        pr.close();
    }
}
