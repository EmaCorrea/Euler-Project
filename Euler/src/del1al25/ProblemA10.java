//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

package del1al25;

public class ProblemA10 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int x = 2;
		long sum = 0L;
		
		while(x < 2000000) {
			if(isPrime(x)) {
				sum += x;
//				System.out.println(x);
			}
			x++;	
		}
		
		System.out.println(sum);

	}
}
