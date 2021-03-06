package problem2;

public class problem2 {

	/**
	 * @param args
	 */
	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * Find the sum of all the even-valued terms in the sequence which do not exceed four million.
	 * A: 4613732
	 */
	public static void main(String[] args) {
		long pirmas = 1;
		long antras = 0;
		long suma = 0;
		long all = 0;
		while(antras<4000000){
			suma = pirmas + antras;
			pirmas = antras;
			antras = suma;
			if(suma%2==0){
				all+=suma;
			}
		}
		System.out.println(all);
	}

}
