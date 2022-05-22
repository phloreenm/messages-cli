package tools;

import java.util.Scanner;

public class ConsoleInput {

	public ConsoleInput() {
	}

	//Take input from user:
	public Scanner scanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	public String aString() {
		String input = scanner().next();
		return input;
	}
	public int anInteger() {
		int input = 0;
		try {
			input = scanner().nextInt();
		} catch (Exception e) {
			System.out.println("Insert an Integer!");
			e.printStackTrace();
		}
		return input;
	}


}
