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

	@Test
	@DisplayName("+ 기능 테스트")
	void plusTest() {
		String testInput = "3";
		cal.add(testInput);
		assertThat(cal.getResult()).isEqualTo(3);
	}

	@Test
	@DisplayName("- 기능 테스트")
	void minusTest() {
		String testInput = "3";
		cal.minus(testInput);
		assertThat(cal.getResult()).isEqualTo(-3);
	}

	@Test
	@DisplayName("* 기능 테스트")
	void multiplyTest() {
		String testInput = "3";
		cal.add("1");
		cal.multiply(testInput);
		assertThat(cal.getResult()).isEqualTo(3);
	}

	@Test
	@DisplayName("/ 기능 테스트")
	void devideTest() {
		String testInput = "3";
		cal.add("3");
		cal.divide(testInput);
		assertThat(cal.getResult()).isEqualTo(1);
	}

	@Test
	@DisplayName("문자열 -> 계산 기능 테스트")
	void calculateTest() {
		String testInput = "2 + 3 * 4 / 2";
		cal.calculate(testInput);
		assertThat(cal.getResult()).isEqualTo(10);
	}
}
