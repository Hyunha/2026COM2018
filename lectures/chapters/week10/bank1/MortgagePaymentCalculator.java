package chapters.week10.bank1;

public class MortgagePaymentCalculator {
	
	private BankAccountSpecification bankAccount;
	
	/** Constructor
	 * @param account - 사용 계좌 */
	public MortgagePaymentCalculator(BankAccountSpecification account) {
		bankAccount = account;
	}
	
	/** makeMortgagePayment - 계좌에서 상환액을 출금해 납부
	 * @param amount - 납부할 금액 */
	public void makeMortgagePayment(int amount) {
		if (bankAccount.withdraw(amount))
			System.out.println(amount + "원 지불");
		else
			System.out.println("잔고 부족");
	}
}

