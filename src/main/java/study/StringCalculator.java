package study;

public class StringCalculator {
	public int result = 0;
	public String[] splitByBlank(String inputStr) {
		return inputStr.split(" ");
	}

	public void add(String input) {
		this.result += Integer.parseInt(input);
	}



	public int getResult() {
		return this.result;
	}

	public void minus(String input) {
		this.result -= Integer.parseInt(input);
	}

	public void multiply(String input) {
		this.result *= Integer.parseInt(input);
	}

	public void devide(String input) {
		this.result /= Integer.parseInt(input);
	}
}
