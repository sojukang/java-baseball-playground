package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	@Test
	@DisplayName("Balls 정답 테스트")
	void allStrikeTest() {
		Balls userBalls = new Balls(new Ball(1, 2), new Ball(2, 3), new Ball(3, 4));
		Balls computerBalls = new Balls(new Ball(1, 2), new Ball(2, 3), new Ball(3, 4));
		assertThat(userBalls.equals(computerBalls)).isTrue();
	}

	@Test
	@DisplayName("스트라이크 개수 테스트")
	void strikesTest() {
		Balls userBalls = new Balls(new Ball(1, 2), new Ball(2, 3), new Ball(3, 4));
		Balls computerBalls = new Balls(new Ball(1, 5), new Ball(2, 7), new Ball(3, 4));
		assertThat(Game.countStrike(userBalls, computerBalls)).isEqualTo(1);
	}


}
