package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Balls {
	private List<Ball> ballList = new ArrayList<>();
	public Balls(Ball ball1, Ball ball2, Ball ball3) {
		this.ballList.add(ball1);
		this.ballList.add(ball2);
		this.ballList.add(ball3);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Balls balls = (Balls)o;
		return Objects.equals(ballList, balls.ballList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ballList);
	}

	public Ball getBall(int i) {
		return this.ballList.get(i);
	}
}
