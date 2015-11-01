package del26al50;

/*
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in 
 * attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is 
 * correct, is obtained by cancelling the 9s.
 * 
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 * There are exactly four non-trivial examples of this type of fraction, less than 
 * one in value, and containing two digits in the numerator and denominator.
 * 
 * If the product of these four fractions is given in its lowest common terms, find 
 * the value of the denominator.
 */

public class Problem33 {

	public static void main(String[] args) {
		
		double start_time = System.currentTimeMillis();

		double div = 0;
		double checkDiv1 = 0, checkDiv2 = 0;
		int numerator = 1, denominator = 1, max = 1, answer;

		for(int a = 10; a < 99; a++) {
			for(int b = a+1; b < 99; b++) {

				checkDiv1 = check1(a, b);
				checkDiv2 = check2(a, b);
				div = (double)a/(double)b;

				if(checkDiv1 == div) {
					numerator *= a;
					denominator *= b;
				}
				if(checkDiv2 == div) {
					numerator *= a;
					denominator *= b;
				}
			}

		}

		System.out.println("The numerators are: " + numerator);
		System.out.println("The denominators are: " + denominator);

		for(int x = numerator; x > 0; x--) {
			if((numerator % x == 0) && (denominator%x) == 0)
				if(x > max)
					max = x;
		}

		answer = denominator/max;
		System.out.println("Answer: " + answer);
		
		double end_time = System.currentTimeMillis();
		double difference = (end_time - start_time)/1000;
		
		System.out.println("Runtime: " + difference + " seconds.");

	}

	public static double check1(int a, int b) {
		if((a/10%10) == (b%10)) {
			a = (a%10);
			b = (b/10%10);
			return (double)a/(double)b;
		}
		else 
			return 0;
	}

	public static double check2(int a, int b) {
		if((b/10%10) == (a%10)) {
			a = (a/10%10);
			b = (b%10);
			return (double)a/(double)b;
		}
		else 
			return 0;
	}

}
