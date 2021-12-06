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
		assertThat(Game.isStrike(targetBall, testBall)).isEqualTo(BallStatus.STRIKE);
	}
}
