package del1al25;

import java.math.BigInteger;

public class Problem20 {

	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);		
	}

	public static void main(String[] args) {

		BigInteger fact = BigInteger.valueOf(1);
		BigInteger[] rem;
		long sum = 0;

		for (int i = 1; i <= 100; i++)
			fact = fact.multiply(BigInteger.valueOf(i));

		while (fact.compareTo(BigInteger.ZERO) != 0) {
			rem = fact.divideAndRemainder(BigInteger.TEN);
			sum += Math.abs(rem[1].intValue());
			fact = rem[0];
		} 

		System.out.println(sum);

	}

}
