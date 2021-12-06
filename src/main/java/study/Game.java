package study;

public class Game {
	public static BallStatus isStrike(Ball userBall, Ball computerBall) {
		if (userBall.getPosition() == computerBall.getPosition() && userBall.getBallNo() == computerBall.getBallNo()) {
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
}
