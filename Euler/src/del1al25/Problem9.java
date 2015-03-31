package del1al25;

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Problem9 {

	public static void main(String[] args) {

		int pyt = 0, suma = 0, product = 0, c = 0;

		for(int a = 1; suma != 1000; a++) {
			for(int b = 1; suma != 1000; b++) {
				if(pyt < (a+b)) {
					pyt = (int) (Math.pow(a, 2) + Math.pow(b, 2));
					c = (int) (Math.sqrt(pyt));
					suma = (a + b + c);
					System.out.println(suma); }

				if(suma == 1000 && pyt == Math.pow(c,2)) {
					product = (a*b*c); }


			}
		}

		System.out.println(product);

	}

}
