package del1al25;

public class Problem4 {

	public static void main(String[] args) {

		int mult = 0, max = 0;

		for(int x = 0; x < 1000; x++) {
			for(int y = 0; y < 1000; y++){
				mult = x*y;

				int rev = reverse(mult);

				if(rev == mult && mult > max) {
					max = mult;
				}

			}

		}
		
		System.out.println(max);
		
	}

	public static int reverse(int a) {
		int mod, rev = 0;
		while(a > 0) { 
			mod = a % 10; 
			rev = rev * 10 + mod; 
			a = a / 10; 
		} 
		return rev;
	}

}
