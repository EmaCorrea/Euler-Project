package del1al25;

import java.util.ArrayList;

public class Sieve_of_Erastosthene {

	public int N;
	public int M = -1;
	public int primes = 0;
	public boolean[] isPrime;
	//public boolean[] isPrime = new boolean[N + 1];

	public Sieve_of_Erastosthene(int N, boolean[] isPrime) {
		this.M = 2;
		this.N = N;
		this.isPrime = isPrime;
	}
	
	public Sieve_of_Erastosthene(int M, int N, boolean[] isPrime) {
		this.M = M;
		this.N = N;
		this.isPrime = isPrime;
	}

	// initially assume all integers are prime
	public void assume() {
		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}
	}

	// mark non-primes <= N using Sieve of Eratosthenes
	public void sieve() {
		for (int i = 2; i*i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider multiples i, i+1, ..., N/i
			if (isPrime[i]) {
				for (int j = i; i*j <= N; j++) {
					isPrime[i*j] = false;
				}
			}
		}
	}

	public ArrayList<Integer> count() {
		int i;
		ArrayList<Integer> primes = new ArrayList<>();
		for (i = M; i <= N; i++) {
			if (isPrime[i]) 
				primes.add(i);
		}
		return primes;
	}

}