package del1al25;

public class Problem6 {

	public static void main(String[] args) {

		int sumA = 0, sumB = 0;
		
		for(int x = 1; x <= 100; x++) {
			sumA += Math.pow(x, 2);
		}
		
		for(int y = 1; y <= 100; y++) {
			sumB += y;
		}
		
		int squareB = (int) Math.pow(sumB, 2);
		int diff = squareB - sumA;
		
		System.out.println(diff);
	}

}
