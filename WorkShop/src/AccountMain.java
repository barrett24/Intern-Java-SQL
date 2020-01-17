import problem02.Account;

public class AccountMain {
	public static void main(String[] args) {
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		acc.getInfo();
		acc.withdraw(600000);
		acc.deposit(20000);
		acc.getInfo();
		System.out.println("이자: " + acc.calInterest());
	}
}
