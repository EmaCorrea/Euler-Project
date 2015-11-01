package del1al25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Problem23 {

	// Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
	static ArrayList<Integer> abundant = new ArrayList<>();
	static Collection<Integer> abundantSum = new HashSet<>();

	public static void main(String[] args) {

		int totalSum = 0;

		for(int i = 1; i < 28124; i++) {
			calcAbundant(i);
		}

		calcAbundantSum();

		for(int i = 1; i < 28124; i++) {
			if(!abundantSum.contains(i))
				totalSum+= i;
		}

		System.out.println(totalSum);
	}

	private static void calcAbundantSum() {
		for(int i = 0; i < abundant.size(); i++) {
			for(int j = 0; j < abundant.size(); j++) {
				if(i == 0 && j == 0)
					abundantSum.add(abundant.get(i) + abundant.get(j));
				if(j + 1 != abundant.size())
					abundantSum.add(abundant.get(i) + abundant.get(j + 1));
			}
		}
	}

	private static void calcAbundant(int num) {
		int sum = 0;
		for(int i = 1; i < 28124; i++) {
			if(num % i == 0 && num != i)
				sum+= i;
		}
		if(sum > num)
			abundant.add(num);
	}

}
