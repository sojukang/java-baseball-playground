package study;

public class ResultView {
	private static final String GET_NEXT_STEP_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
	private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

	public static void printBallCount(int ballCount) {
		System.out.print(ballCount + "볼 ");
	}
	
	public static void printScore(int ballCount, int strikeCount) {
		if (ballCount > 0) {
			printBallCount(ballCount);
		}
		if (strikeCount > 0) {
			printStrikeCount(strikeCount);
		}
		if (ballCount == 0 && strikeCount == 0) {
			System.out.print("낫싱");
		}
		System.out.println();
	}

	public static void printStrikeCount(int strikeCount) {
		System.out.print(strikeCount + "스트라이크");
	}

	public static void printGetNextStep() {
		System.out.println(GAME_END_MESSAGE);
		System.out.println(GET_NEXT_STEP_MESSAGE);
	}
}
