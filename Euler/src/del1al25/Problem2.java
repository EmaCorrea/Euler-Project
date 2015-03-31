package del1al25;

public class Problem2 {

	public static void main(String[] args) {

		int a = 1, b = 2, temp = 0, cont = 0;

		while(temp < 4000000) {
			temp = b;
			b += a; 
			a = temp; 
			if(temp % 2 == 0)
				cont += temp;
		}

		System.out.println(cont);

	}

}
