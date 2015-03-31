package del1al25;

public class Problem3 {

	public static void main(String[] args) {

		long x = 600851475143L, mult = 1L;
		int max = 0;

		for(int a = 2; a < Math.sqrt(x); a++) {
			if(x % a == 0 && mult < x) {
				mult *= a;
				if(a > max)
					max = a;
			}
		}
		System.out.println(max);
	}

}
