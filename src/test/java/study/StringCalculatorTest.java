package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	public StringCalculator cal;

	@BeforeEach
	void setUp() {
		cal = new StringCalculator();
	}

	@Test
	@DisplayName("공백 문자 기준 분리")
	void splitByBlankTest() {
		String testStr = "2 + 3 * 4 / 2";
		String[] expected = {"2", "+", "3", "*", "4", "/", "2"};
		assertThat(cal.splitByBlank(testStr)).isEqualTo(expected);
	}


}
