package Lec19;

public class Sieve_of_Eratosthenes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n = 70; // Find prime numbers up to 50

	        boolean[] isPrime = new boolean[n + 1];

	        // Step 1: Assume all numbers are prime
	        for (int i = 0; i <= n; i++) {
	            isPrime[i] = true;
	        }

	        // 0 and 1 are not prime
	        isPrime[0] = false;
	        isPrime[1] = false;

	        // Step 2: Mark multiples as non-prime
	        for (int p = 2; p * p <= n; p++) {
	            if (isPrime[p]) {
	                // Mark multiples of p starting from p*p
	                for (int multiple = p * p; multiple <= n; multiple += p) {
	                    isPrime[multiple] = false;
	                }
	            }
	        }

	        // Step 3: Print all prime numbers
	        System.out.println("Prime numbers up to " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            if (isPrime[i]) {
	                System.out.print(i + " ");
	            }
	        }
	}

}
