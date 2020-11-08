package code;

import java.math.BigInteger;

public class Q04_01 {

	public static void main(String[] args) {
//		BigInteger result = new BigInteger("1");
		long result = 1;
		long num = 100000;
		for (long i = num; i > 0; i--) {
//			result = result.multiply(new BigInteger(String.valueOf(i)));
			result *= i;
		}
		System.out.println(result);
	}

}
