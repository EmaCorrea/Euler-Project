//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//What is the sum of the digits of the number 21000?

package del1al25;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {

		BigInteger pow = BigInteger.valueOf(1);
		BigInteger[] rem;
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++)
			pow = pow.multiply(BigInteger.valueOf(2));
		
		while (pow.compareTo(BigInteger.ZERO) != 0) {
			rem = pow.divideAndRemainder(BigInteger.TEN);
			sum += Math.abs(rem[1].intValue());
			pow = rem[0];
		} 
		
		System.out.println(sum);
		
	}

}
