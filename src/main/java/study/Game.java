package study;

public class Game {
	public static BallStatus isStrike(Ball userBall, Ball computerBall) {
		if (userBall.equals(computerBall)) {
			return BallStatus.STRIKE;
		}
		return null;
	}

	public static BallStatus isBall(Ball userBall, Ball computerBall) {
		if (userBall.getPosition() != computerBall.getPosition() && userBall.getBallNo() == computerBall.getBallNo()) {
			return BallStatus.BALL;
		}
		return BallStatus.NOTHING;
	}

	public static BallStatus isNothing(Ball userBall, Ball computerBall) {
		return BallStatus.NOTHING;
	}

	public static int countStrike(Balls userBalls, Balls computerBalls) {
		int strikeCount = 0;
		for (int i = 0; i < 3; i++) {
			if (userBalls.getBall(i).equals(computerBalls.getBall(i))) {
				strikeCount++;
			}
		}
		return strikeCount;
	}

	public static int countBall(Balls userBalls, Balls computerBalls) {
		int ballCount = 0;
		for (int i = 0; i < 3; i++) {
			if (Game.isStrike(userBalls.getBall(i), computerBalls.getBall(i)) == null && computerBalls.contains(
				userBalls.getBall(i))){
				ballCount++;
			}
		} return ballCount;
	}
}
