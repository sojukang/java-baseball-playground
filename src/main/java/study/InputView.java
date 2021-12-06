package study;

import java.util.Scanner;

public class InputView {
	private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해 주세요 : ";

	public static String getUserInput() {
		System.out.print(INPUT_NUMBER_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static int getNextStep() {
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine());
	}
}
