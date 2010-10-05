package problem1;

public class problem1 {

	/**
	 * @param args
	 */
	// Find the sum of all the multiples of 3 or 5 below 1000.
	// A: 233168
	public static void main(String[] args) {
		int sk = 0;
		for(int i = 0; i<1000; i++){
			if(i % 5 == 0 || i % 3 == 0){
				sk+=i;
			}
		}
		
		System.out.print(sk);

	}

}
