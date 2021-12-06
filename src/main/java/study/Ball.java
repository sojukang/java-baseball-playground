package study;

import java.util.Objects;

public class Ball {
	private final int position;
	private final int ballNo;

	public Ball(int position, int ballNo) {
		this.position = position;
		this.ballNo = ballNo;
	}

	public int getPosition() {
		return this.position;
	}

	public int getBallNo() {
		return this.ballNo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ball ball = (Ball)o;
		return position == ball.position && ballNo == ball.ballNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position, ballNo);
	}
}
