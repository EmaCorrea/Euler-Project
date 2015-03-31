package del1al25;

public class Problem25 {

	public static long fibonacci(long x) {
		if (x == 0 || x == 1)
			return x;
		else
			return fibonacci(x - 1) + fibonacci(x - 2);
	}

	public static void main(String[] args) {

		for(int x = 1; x < 25; x++) {
			long num = fibonacci(x);
			if(num >= 1000)
				System.out.println(x);
		}

		System.out.println(fibonacci(16));
		
	}

}
