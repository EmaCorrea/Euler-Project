package del1al25;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		for(int x = 0; x < 1000; x++)
			if(x % 3 == 0 || x % 5 == 0)
				contador+= x;
		
		System.out.println(contador);
		
	}

}
