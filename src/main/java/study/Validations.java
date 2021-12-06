package study;

public class Validations {

	public static void validNo(String input) throws IllegalArgumentException {
		Integer.parseInt(input);
	}

	public static void validLength(String input) {
		if (input.length() > 3) {
			throw new IllegalArgumentException();
		}
	}
}
