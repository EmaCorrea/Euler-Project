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

public class Problem14 {

	public static void main(String[] args) {

		int number = 2, length = 0, maxL = 0, maxNum = 0;

		while(number < 500000) {
			int a = number;

			while(a != 1) {
				if(a % 2 == 0)
					a = a/2;
				else
					a = 3*a + 1;
				length++;
			}

			if(length > maxL) {
				maxL = length;
				maxNum = number;
			}

			length = 0;
			number++;
		}

		System.out.println(maxNum);
		System.out.println(maxL);

	}

}


//public static void main(String[] args) {
//
//	int number = 2, max = 0;
//	ArrayList<Integer> seq = new ArrayList<>();
//	ArrayList<Integer> maxSeq = new ArrayList<>();
//
//	while(number < 500000) {
//		int a = number;
//		seq.add(a);
//
//		while(a != 1) {
//			if(a % 2 == 0) {
//				a = a/2;
//				seq.add(a);
//			}
//			else {
//				a = 3*a + 1;
//				seq.add(a);
//			}
//			length++;
//		}
//		if(seq.size() > max) {
//			max = seq.size();
//			maxSeq.clear();
//			maxSeq.addAll(seq);
//
//		}
//		//System.out.println(maxSeq);
//		seq.clear();
//		number++;
//	}
//
//	System.out.println(maxSeq);
//
//}