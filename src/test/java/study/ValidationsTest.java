package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationsTest {
	@Test
	@DisplayName("숫자 입력 테스트")
	void validNoTest() {
		String input = "a123";
		assertThatThrownBy(() -> {
			Validations.validNo(input);
		}).isInstanceOf(IllegalArgumentException.class);
	}
}
