package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validations {

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
}
