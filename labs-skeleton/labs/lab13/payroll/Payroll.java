package labs.lab13.payroll;

import labs.lab13.payroll.controller.PayrollController;

public class Payroll {
    public static void main(String[] args) {
        String nameIn = "payroll.csv";
        String nameOut = "payroll.out.csv";

        PayrollController controller = new PayrollController();
        controller.processPayroll(nameIn, nameOut);   // 급여 정산 (제공)
        controller.printAll(nameIn);                  // loadData 결과 확인
    }
}
