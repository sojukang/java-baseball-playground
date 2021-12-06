package study;

import java.util.List;
import java.util.stream.Stream;

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

	public static Balls generateComputerBalls() {
		Computer com = new Computer();
		List<Integer> comNo = com.generateComputerNO();
		return new Balls(new Ball(1, comNo.get(0)), new Ball(2, comNo.get(1)), new Ball(3, comNo.get(2)));
	}

	public static Balls generateUserBalls(String input) {
		int[] ballNo = Stream.of(input.split("")).mapToInt(Integer::parseInt).toArray();
		return new Balls(new Ball(1, ballNo[0]), new Ball(2, ballNo[1]), new Ball(3, ballNo[2]));
	}

	public static void main(String[] args) {
		Balls newBalls = generateComputerBalls();
		System.out.println(newBalls.getBall(0).getBallNo());
		System.out.println(newBalls.getBall(1).getBallNo());
		System.out.println(newBalls.getBall(2).getBallNo());
	}

}
