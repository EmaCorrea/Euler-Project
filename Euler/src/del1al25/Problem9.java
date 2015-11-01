package del1al25;

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Problem9 {

	public static void main(String[] args) {

		int a, b = 0;
		double apow, bpow, sqrt = 0, sum = 0;

		long begin = System.currentTimeMillis();
		
		outerloop:
		for(a = 3; a < 1000; a++) {
			for(b = 4; b < 1000; b++) {
				apow = Math.pow(a, 2);
				bpow = Math.pow(b, 2);
				sqrt = Math.sqrt(apow + bpow);

				if(sqrt % 1 == 0) {
					sum = a + b + sqrt;
				}

				if(sum == 1000)
					break outerloop;
			}
		}
		
		int mult = a * b * (int) sqrt;
		
		long end = System.currentTimeMillis();
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + sqrt);
		System.out.println("The product of the triplets is: " + mult);
		System.out.println("The program took " + (end - begin) + "ms to run!");

	}

}
