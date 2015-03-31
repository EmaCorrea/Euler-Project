package del26al50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Problem29 {
	
	public static void main(String[] args) {
		
		ArrayList<Double> seq = new ArrayList<>();
		HashSet<Double> nodupes = new HashSet<>();
		
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= 100; b++) {
				seq.add(Math.pow(a, b));
			}
		}
		
		nodupes.addAll(seq);
		seq.clear();
		seq.addAll(nodupes);
		
		Collections.sort(seq);

		System.out.println(seq.size());
		
	}

}
