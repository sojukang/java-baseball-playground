package study;

public class ApplicationBaseball {
	private static final int MAX_STRIKE = 3;
	private static final int CONTINUE_GAME = 1;
	private static final int END_GAME = 2;

	public static void main(String[] args) {
		int continueState = CONTINUE_GAME;
		while (continueState!=END_GAME) {
			Balls computerBalls = Game.generateComputerBalls();
			runGame(computerBalls);
			ResultView.printGetNextStep();
			continueState = InputView.getNextStep();
		}
	}

	public static void runGame(Balls ComputerBalls) {
		String userInput = InputView.getUserInput();
		Validations.validUserInput(userInput);
		Balls userBalls = Game.generateUserBalls(userInput);
		int strikeCount = Game.countStrike(userBalls, ComputerBalls);
		int ballCount = Game.countBall(userBalls, ComputerBalls);
		ResultView.printScore(ballCount, strikeCount);
		if (strikeCount != MAX_STRIKE) {
			runGame(ComputerBalls);
		}
	}
}
