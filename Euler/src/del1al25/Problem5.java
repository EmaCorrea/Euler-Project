package del1al25;

/* 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20? */

public class Problem5 {

	public static void main(String[] args) {

		int count = 0, ans = 0;

		for(int num = 1; count <= 10; num++) {
			for(int x = 1; x <= 20; x++) {
				if(num % x == 0) {
					ans = num;
					count++; }
				else {
					count = 0;
					break; }
			}
		}
		
		System.out.println(ans);

	}

}

