package code;

public class Q02 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(0);
		int result = calculator.add(4).add(5).subtract(3).out();
		System.out.print(result);
	}
}

class Calculator {
	private int num;

	public Calculator(int num) {
		this.num = num;
	}

	public Calculator add(int num) {
		this.num = this.num + num;
		return this;
	}

	public Calculator subtract(int num) {
		this.num = this.num - num;
		return this;
	}

	public int out() {
		return num;
	}
}
