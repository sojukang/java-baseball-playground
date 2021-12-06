package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validations {

	private static final int MIN_NUMBER_RANGE = 1;

	public static void validUserInput(String input) {
		validNo(input);
		validLength(input);
		validOverlap(input);
		validRange(input);
	}
	public static void validNo(String input) throws IllegalArgumentException {
		Integer.parseInt(input);
	}

	public static void validLength(String input) {
		if (input.length() > 3) {
			throw new IllegalArgumentException();
		}
	}

	public static boolean validOverlap(String input) {
		List<String> list = new ArrayList<>(Arrays.asList(input.split("")));
		Set<String> set = new HashSet<>(list);
		if (set.size() < input.length()) {
			throw new IllegalArgumentException();
		}
		return true;
	}

	public static void validRange(String input) {
		for (String num : input.split("")) {
			if (Integer.parseInt(num) < MIN_NUMBER_RANGE) {
				throw new IllegalArgumentException();
			}
		}
	}
}
