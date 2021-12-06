package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallsTest {
	@Test
	@DisplayName("contains 테스트")
	void containsTest() {
		Balls testBalls = new Balls(new Ball(1, 2), new Ball(2, 4), new Ball(3, 8));
		Ball testBall = new Ball(1, 2);
		assertThat(testBalls.contains(testBall)).isTrue();
	}
}
