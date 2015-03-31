package del1al25;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number? */

public class Problem7 {

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

		int x = 0, num = 0;

		while(num < 10001) {
			if(isPrime(x) ) {
				num++;
				System.out.println(x);
			}
			x++;	
		}

	}

}
