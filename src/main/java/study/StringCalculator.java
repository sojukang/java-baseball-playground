package study;

import java.util.Scanner;

public class StringCalculator {
	public int result = 0;

	public String[] splitByBlank(String inputStr) {
		return inputStr.split(" ");
	}

	public void add(String input) {
		this.result += Integer.parseInt(input);
	}

	public int getResult() {
		return this.result;
	}

	public void minus(String input) {
		this.result -= Integer.parseInt(input);
	}

	public void multiply(String input) {
		this.result *= Integer.parseInt(input);
	}

	public void divide(String input) {
		this.result /= Integer.parseInt(input);
	}

	public String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void calculate(String input) {
		String[] values = splitByBlank(input);
		for (int i = 0; i < values.length; i++) {
			if (i == 0) {
				this.result += Integer.parseInt(values[i]);
			}
			if (values[i].equals("+")) {
				add(values[i + 1]);
			}
			if (values[i].equals("-")) {
				minus(values[i + 1]);
			}
			if (values[i].equals("*")) {
				multiply(values[i + 1]);
			}
			if (values[i].equals("/")) {
				divide(values[i + 1]);
			}
		}
	}
}
