package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
	private static final int MAX_RANDOM_RANGE = 9;

	public int getRandomNo() {
		return new Random().nextInt(MAX_RANDOM_RANGE) + 1;
	}

	public List<Integer> generateComputerNO() {
		List<Integer> computerNo = new ArrayList<>();
		while (computerNo.size() < 3) {
			int newNo = getRandomNo();
			if (!computerNo.contains(newNo)) {
				computerNo.add(newNo);
			}
		}
		return computerNo;
	}


	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println(com.generateComputerNO());
	}
}
