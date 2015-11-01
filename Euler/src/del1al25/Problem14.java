//The following iterative sequence is defined for the set of positive integers:
//
//n = n/2 (n is even)
//n = 3n + 1 (n is odd)
//
//Using the rule above and starting with 13, we generate the following sequence:
//
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
//Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//Which starting number, under one million, produces the longest chain?

package del1al25;

import java.util.LinkedList;

public class Problem14 {

	static long chain = 0, number, max = 0, maxN = 0;;
	static LinkedList<Long> list = new LinkedList<Long>();

	public static void main(String[] args) {

		for(number = 1; number < 1000000; number++) {
			long a = number;
			while(a != 1) {
				if(a % 2 == 0) {
					a = (a/2);
					list.add(a);
				}
				else {
					a = (a*3) + 1;
					list.add(a);
				}
			}

			if(list.size() > max) {
				max = list.size();
				maxN = number;
			}
			list.clear();
		}

		System.out.println(max + " " + maxN);

	}

	public static long collatz(long number) {
		while(number != 1) {
			if(number % 2 == 0) {
				number = (number/2);
				list.add(number);
			}
			else {
				number = (number*3) + 1;
				list.add(number);
			}
		}
		System.out.println(number + " " + list.size());
		return list.size();
	}

}