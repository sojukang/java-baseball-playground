package study;

public class Application {
	private static final String GET_USER_INPUT_MESSAGE = "계산할 내용을 입력하세요.";

	public static void main(String[] args) {
		StringCalculator cal = new StringCalculator();
		printGetUserInput();
		String userInput = cal.getUserInput();
		cal.calculate(userInput);
		System.out.println(cal.getResult());
	}

	public static void printGetUserInput() {
		System.out.println(GET_USER_INPUT_MESSAGE);
	}
}
