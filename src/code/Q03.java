package code;

public class Q03 {

	public static void main(String[] args) {
		int result = factorial(4);
		System.out.print(result);
	}

	private static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}