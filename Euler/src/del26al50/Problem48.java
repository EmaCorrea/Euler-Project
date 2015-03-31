package del26al50;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String[] args) {

		int pow = 1;
		long sum = 0L;
		BigInteger sumz = BigInteger.valueOf(0);

		for(int x = 1; x <= 1000; x++) {
			//sumz = sumz.add(Math.pow(x, pow));
			pow++;
		}

		System.out.println(sum);

	}

}
