package problem02;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double getRate() {
		return this.interestRate;
	}
	
	public double calInterest() {
		return this.balance * this.interestRate;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		if (money > this.balance) {
			System.out.println("출금할 수 없습니다");
		} else {
			this.balance -= money;
		}
	}
	public void getInfo() {
		System.out.print("계좌정보: " + account + " 현재잔액: " + balance);
	}
}
