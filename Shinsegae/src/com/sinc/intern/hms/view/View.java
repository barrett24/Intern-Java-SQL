package com.sinc.intern.hms.view;

import java.util.Scanner;

public class View {
	
	public void mainMenu() {
		while (true) {
			System.out.println("  **  Insa Management Stytem  **  ");
			System.out.println("1. insert");
			System.out.println("2. single select");
			System.out.println("3. multi select");
			System.out.println("4. update");
			System.out.println("5. delete");
			System.out.println("99. exit");
			System.out.println("choice number > ");
			
			Scanner scanner = new Scanner(System.in);
			int cNUm = scanner.nextInt();
			
			switch (cNUm) {
				case 1:
					insert();
					break;
				case 99:
					System.exit(1);
			}
		}	
	}
	
	public void insert() {
		System.out.println("WOWOWOWOWOWOWOW");
	}
}
