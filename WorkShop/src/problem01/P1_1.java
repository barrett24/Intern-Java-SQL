package problem01;

import java.util.Scanner;

public class P1_1 {
	private int sum = 0;
	private double avg = 0.00;
	private int len;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputAry = input.split(" ");
		len = inputAry.length;
		
		for (String score: inputAry) {
			this.sum +=  Integer.parseInt(score);
		}
		System.out.println(getSum());
		System.out.println(getAvg());
		getScore();
	}
	
	public int getSum() {
		return sum;
	}
	
	public double getAvg() {
		return sum / len;
	}
	
	public void getScore() {
		int score = (int)avg;
		
		switch ((int)(score / 10)) {
			case 9 : {
				System.out.println("A학점");
			}
			case 7: case 8 : {
				System.out.println("B학점");
			}
			case 5: case 6 : {
				System.out.println("C학점");
			}
			case 3: case 4 : {
				System.out.println("D학점");
			}
			default : {
				System.out.println("F학점");
			}
		}
	}
}
