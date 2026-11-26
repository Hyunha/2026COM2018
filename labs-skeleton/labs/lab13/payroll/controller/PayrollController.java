package labs.lab13.payroll.controller;

import labs.lab13.payroll.view.PayrollReader;
import labs.lab13.payroll.view.PayrollWriter;

public class PayrollController {
    private String[] names;
    private int[] hours;
    private int[] payrates;
    private final int MAX_NUM = 100;

    /** 입력 파일을 읽어 급여를 계산하고 결과 파일에 기록 (완성되어 제공됨) */
    public void processPayroll(String in, String out) {
        PayrollReader reader = new PayrollReader(in);
        PayrollWriter writer = new PayrollWriter(out);
        while (reader.getNextRecord()) {
            int payment = reader.hoursOf() * reader.payrateOf();
            writer.printCheck(reader.nameOf(), payment);
        }
        writer.printCheck("!");
        reader.close();
        writer.close();
    }

    private void reset() {
        // TODO [실습 13-3] names, hours, payrates 를 MAX_NUM 크기의 배열로 새로 만듦
    }

    private int loadData(String in) {
        reset();
        int i = 0;
        // TODO [실습 13-3] PayrollReader 로 파일 in 을 읽어 세 배열을 채우고, 다 읽으면 close()
        return i;   // 읽은 직원 수
    }

    /** loadData 가 배열을 제대로 채웠는지 확인용으로 출력한다 */
    public void printAll(String in) {
        int numOfEmployees = loadData(in);
        // TODO [실습 13-3] "읽은 직원 수 = N" 과 직원별 "이름 : 시간 x 시급 = 급여" 를 출력
    }
}
