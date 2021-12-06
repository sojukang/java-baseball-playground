package study;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	Balls computerBalls;
	@BeforeEach
	void setUp() {
		this.computerBalls = new Balls(new Ball(1, 2), new Ball(2, 3), new Ball(3, 4));
	}
	@Test
	@DisplayName("Balls 정답 테스트")
	void allStrikeTest() {
		Balls userBalls = new Balls(new Ball(1, 2), new Ball(2, 3), new Ball(3, 4));
		assertThat(userBalls.equals(computerBalls)).isTrue();
	}

	@Test
	@DisplayName("스트라이크 개수 테스트")
	void countStrikeTest() {
		Balls userBalls = new Balls(new Ball(1, 2), new Ball(2, 4), new Ball(3, 8));
		assertThat(Game.countStrike(userBalls, computerBalls)).isEqualTo(1);
	}

	@Test
	@DisplayName("볼 개수 판정 테스트")
	void countBallTest() {
		Balls userBalls = new Balls(new Ball(1, 2), new Ball(2, 4), new Ball(3, 8));
		assertThat(Game.countBall(userBalls, computerBalls)).isEqualTo(1);
	}



}
