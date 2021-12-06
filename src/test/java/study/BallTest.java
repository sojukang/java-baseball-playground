package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {
	@Test
	@DisplayName("스크라이크 테스트")
	void strikeTest() {
		Ball testBall = new Ball(1, 1);
		Ball targetBall = new Ball(1, 1);
		assertThat(targetBall.equals(testBall)).isTrue();
	}

	@Test
	@DisplayName("볼 테스트")
	void ballTest() {
		Ball testBall = new Ball(2, 1);
		Ball targetBall = new Ball(1, 1);
		assertThat(Game.isBall(targetBall, testBall)).isEqualTo(BallStatus.BALL);
	}
}
