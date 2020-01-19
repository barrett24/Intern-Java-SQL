import java.util.ArrayList;

import problem02.Account;

public class AccountAryMain {
	public static final int DEPOSIT = 100000;
	public static final double INTEREST = 4.5;
	public static final String ACCOUNT = "221-0101-211";
	
	public static void main(String[] args) {
		ArrayList<Account> accountAry = new ArrayList<Account>();
		
		for (int i = 1; i <= 5; i++) {
			String userAccount = ACCOUNT + i;
			accountAry.add(new Account(userAccount, DEPOSIT, INTEREST));
		}
		
		for (Account acc: accountAry) {
			acc.getInfo();
			System.out.print(" 이자율: " + acc.getRate());
			System.out.println();
		}
		
		System.out.println();
		
		for (Account acc: accountAry) {
			acc.getInfo();
			System.out.print(" 이자율 : " + acc.getRate());
			System.out.print(" 이자 : " + acc.calInterest());
			System.out.println();
		}
		
	}

}
