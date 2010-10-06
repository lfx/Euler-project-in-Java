package problem6;

public class problem6 {

	/**
	 * http://projecteuler.net/index.php?section=problems&id=6 
	 * A: 25164150
	 */
	public static void main(String[] args) {
		Long sum1 = 0L;
		Long sum2 = 0L;
		for (long i = 0; i <= 100; ++i) {
			sum1 += (i * i);
		}
		for (long i = 0; i <= 100; ++i) {
			sum2 += i;
		}
		sum2 = sum2 * sum2;

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2 - sum1);

	}

}
