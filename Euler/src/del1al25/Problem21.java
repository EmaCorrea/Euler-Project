package del1al25;

/*
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 
284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem21 {

	static ArrayList<Integer> divisors = new ArrayList<>();
	static Collection<Integer> amicable = new HashSet<>();
	static Map<Integer, Integer> mapOfSums = new HashMap<>();

	static int divSum, totalSum = 0;

	public static void main(String[] args) {

		for(int i = 1; i < 10000; i++) {
			divisors.clear();
			calcDivisors(i);
		}
		for(int i = 1; i < 10000; i++)
			calcAmicable(i);

		System.out.println("The amicable numbers are: " + amicable);
		System.out.println("The sum of the amicable numbers is: " + totalSum);
	}

	public static void calcDivisors(int x) {
		divSum = 0;
		for(int i = 1; i < x; i++) {
			if(x % i == 0) {
				divisors.add(i);
				divSum+= i;
			}
		}
		mapOfSums.put(x, divSum);
	}

	public static void calcAmicable(int x) {
		int key = mapOfSums.get(x);
		int value = 0;

		if(x != 1 && key < 10000)
			value = mapOfSums.get(key);

		if(x == value && key != value) {
			amicable.add(value);
			totalSum+= x;
		}
	}
}