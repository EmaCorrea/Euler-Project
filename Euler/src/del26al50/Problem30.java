package del26al50;

/*
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 1634 = 14 + 64 + 34 + 44
 * 8208 = 84 + 24 + 04 + 84
 * 9474 = 94 + 44 + 74 + 44
 * As 1 = 14 is not a sum it is not included.
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 */

public class Problem30 {

	public static void main(String[] args) {

		int sumPower = 0, sumPowerNumbers = 0;
		
		for(int i = 1000; i < 1000000; i++) {
			char[] digits = String.valueOf(i).toCharArray();
			sumPower = findSumPower(digits);
			if(sumPower == i)
				sumPowerNumbers += i;
		}
		
		System.out.println("The answer is: " + sumPowerNumbers);
	}

	private static int findSumPower(char[] digits) {
		int sum = 0;
		for(int i = 0; i < digits.length; i++) {
			int num = Character.getNumericValue(digits[i]);
			sum += Math.pow(num, 5);
		}
		return sum;
	}

}
