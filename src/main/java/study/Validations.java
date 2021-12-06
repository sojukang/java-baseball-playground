package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validations {

	private static final int MIN_NUMBER_RANGE = 1;

	public static void validNo(String input) throws IllegalArgumentException {
		Integer.parseInt(input);
	}

	public static void validLength(String input) {
		if (input.length() > 3) {
			throw new IllegalArgumentException();
		}
	}

	public static void validOverlap(String input) {
		List<String> list = new ArrayList<>(Arrays.asList(input));
		Set<String> set = new HashSet<>(list);
		if (set.size() < input.length()) {
			throw new IllegalArgumentException();
		}
	}

	public static void validRange(String input) {
		for (String num : input.split("")) {
			if (Integer.parseInt(num) < MIN_NUMBER_RANGE) {
				throw new IllegalArgumentException();
			}
		}
	}

	public static void main(String[] args) {
		validRange("312");
	}
}
