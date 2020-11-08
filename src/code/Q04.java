package code;

public class Q04 {
	public static void main(String[] args) {
		long result = factorial(100000);
		System.out.print(result);
	}

	private static long factorial(long num) {
		return factorialMethod(num, 1);
	}

	private static long factorialMethod(long num, long value) {
		if (num == 1) {
			return value;
		}
		return factorialMethod(num - 1, value * num);
	}

}